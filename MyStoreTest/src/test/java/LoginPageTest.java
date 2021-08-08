import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.TestBase;
import com.myStore.pages.LoginPage;
import com.myStore.pages.MyAccountPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	MyAccountPage myAccountPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginTitle() {
		String title = validateTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void login(){
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
