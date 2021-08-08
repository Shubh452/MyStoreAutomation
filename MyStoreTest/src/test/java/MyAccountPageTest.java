
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.TestBase;
import com.myStore.pages.HomePage;
import com.myStore.pages.LoginPage;
import com.myStore.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	HomePage homePage;
	
	public MyAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateMyAccountPageTitle() {
		String title = validateTitle();
		Assert.assertEquals(title, "My account - My Store");
	}
	
	@Test(priority=2)
	public void verifyAccountNameTest() {
		Assert.assertTrue(myAccountPage.verifyAccount());
	}
	
	@Test(priority=1)
	public void gotoHomePageTest() {
		homePage = myAccountPage.gotoHome();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
