package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.Agreement_Checking_Program;
import POM.Login;
import Pojo.Browser;
import Utility.BaseTest;
@Listeners(Listner.class)
public class TC_Agreement_Checking extends BaseTest
{
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
	obj.enterUserName("mayur.charvande+101@fxbytes.com");
	obj.enterPassword("fxbytes@123");
	Thread.sleep(15000);
	obj.clickOnLoginButton();
	}
@Test(priority=2)
	public void Agreements_Checking() throws InterruptedException
	{
	Agreement_Checking_Program obj2 = new Agreement_Checking_Program(driver);
	//obj3.ScrollingBottom();
	//Thread.sleep(3000);
	obj2.clickOnRadioButton();
	System.out.println("1");
	Actions act = new Actions(driver);
	for(int i=1;i<4;i++)
	{
		act.sendKeys(Keys.TAB).perform();
	}
	System.out.println("2");
	Thread.sleep(3000);
		obj2.clickOnNextButton1();
		System.out.println("3");
	Thread.sleep(3000);
		obj2.clickOnNextButton2();
		System.out.println("4");
	Thread.sleep(3000);
		obj2.clickOnContinueButton();
		System.out.println("5");
	Thread.sleep(3000);
		obj2.titleOfAgreementPresentOrNot(driver.getTitle(), "[DEMO USE ONLY] API Send Transient Test Agreement 712");
	
	}
}
