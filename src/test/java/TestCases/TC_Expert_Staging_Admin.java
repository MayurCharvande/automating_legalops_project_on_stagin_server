package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.Expert_Staging_Admin;
import POM.Login;
import Pojo.Browser;
import Utility.BaseTest;
import Utility.BrokenLinks;
@Listeners(Listner.class)
public class TC_Expert_Staging_Admin extends BaseTest
{
@BeforeSuite
 public void OpenChrome() throws InterruptedException
	{
	driver = Browser.OpenBrowser("https://experts-staging.legalops.com/admin"); //https://experts-staging.legalops.com/admin
	//driver = Browser.OpenBrowser("https://staging:9UXn7'ufSyG<Lr^2@staging.legalops.com/admin");
	Login obj1 = new Login(driver);
	obj1.enterAuthUser("user13");
	obj1.enterAuthPassword("agoSLTeE");
	obj1.clickOnSubmitButton();
	Thread.sleep(3000);
	}
@Test(priority=1)
	public void loginFunctionality() throws InterruptedException 
	{
	Login obj = new Login(driver);
	obj.enterUserName("mayur.charvande+1000@fxbytes.com");
	obj.enterPassword("Fxbytes@123");
	Thread.sleep(15000);
	obj.clickOnLoginButton();
	Thread.sleep(60000);
	}
 // Start Testing Broken-Links 
@Test(priority=2)
    public void Test_BrokenLinks_for_DefaultPage() throws IOException
    {
    BrokenLinks bl = new BrokenLinks();
    bl.brokenLink();
    }
@Test(priority=3)
    public void TC_ProvidersApprovals() throws IOException
    {
    Expert_Staging_Admin obj1 = new Expert_Staging_Admin();
    BrokenLinks bl = new BrokenLinks();
    obj1.click_ProvidersApprovals();
    bl.brokenLink();
    //browser back operation
    driver.navigate().back();
    }
@Test(priority=4)
    public void TC_Setting() throws IOException
    {
    Expert_Staging_Admin obj2 = new Expert_Staging_Admin();
    BrokenLinks bl = new BrokenLinks();
    obj2.click_Setting();
    bl.brokenLink();
    //browser back operation
    driver.navigate().back();
    }
@Test(priority=5)
    public void TC_click_MyDashboard() throws IOException
    {
    Expert_Staging_Admin obj3 = new Expert_Staging_Admin();
    BrokenLinks bl = new BrokenLinks();
    obj3.click_MyDashboard();
    bl.brokenLink();
    //browser back operation
    driver.navigate().back();
    }
@Test(priority=6)
    public void TC_click_Notifications() throws IOException
    {
    Expert_Staging_Admin obj4 = new Expert_Staging_Admin();
    BrokenLinks bl = new BrokenLinks();
    obj4.click_Notifications();
    bl.brokenLink();
    //browser back operation
    driver.navigate().back();
    }
}
