package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.Login;
import POM.MyDashboard;
import POM.MyProfileTab;
import Pojo.Browser;
import Utility.BaseTest;
import Utility.BrokenLinks;

public class TC_Login extends BaseTest
{
	//WebDriver driver;
	@BeforeSuite
		public void OpenChrome() throws InterruptedException
		{
		driver = Browser.OpenBrowser("https://staging.legalops.com"+"/"+"admin");
		//driver = Browser.OpenBrowser("https://staging:9UXn7'ufSyG<Lr^2@staging.legalops.com/admin");
		Login obj1 = new Login(driver);
		obj1.enterAuthUser("staging");
		obj1.enterAuthPassword("9UXn7'ufSyG<Lr^2");
		obj1.clickOnSubmitButton();
		Thread.sleep(3000);
		}	
	@Test(priority=1)
		public void loginFunctionality() throws InterruptedException 
		{
		Login obj = new Login(driver);
		obj.enterUserName("mayur.charvande@fxbytes.com");
		obj.enterPassword("Fxbytes@123");
		Thread.sleep(30000);
		obj.clickOnLoginButton();
		}
	@Test(priority=2)
		public void MyProfile_PersonalProfile_PrivateProfile()
		{
		MyProfileTab PT = new MyProfileTab();
		PT.clickOnMyProfileTab();
		}
	@Test(priority=3)
		public void MyProfile_PersonalProfile_PublicProfile()
		{
		MyProfileTab PT = new MyProfileTab();
		PT.clickOnPublicProfile();
		}
	@Test(priority=4)
		public void MyDashboardTab()
		{
		MyDashboard db = new MyDashboard();
		db.clickOnMyDashboared();
		}
	@AfterMethod
		public void checkBrokenLinks() throws IOException
		{
			System.out.println("=======================================================================================================================================================================================");
			BrokenLinks bl = new BrokenLinks();
			bl.brokenLink();
		}
}
