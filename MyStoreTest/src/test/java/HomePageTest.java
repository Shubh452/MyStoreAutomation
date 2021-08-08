import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.TestBase;
import com.myStore.pages.HomePage;
import com.myStore.pages.LoginPage;
import com.myStore.pages.MyAccountPage;
import com.myStore.pages.SummerDressesPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	HomePage homePage;
	SummerDressesPage summerDressesPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = myAccountPage.gotoHome();
	
	}
	
	@Test(priority=1)
	public void gotoSummerDressesPageTest() throws InterruptedException {
		summerDressesPage = homePage.gotoSummerDresses();
	}
	
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
