package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.Login;
import POM.Registration_Expert_Staging;
import Pojo.Browser;
import Utility.BaseTest;
import Utility.BrokenLinks;

public class TC_Reg_Experts_Staging extends BaseTest
{
@BeforeSuite
	public void OpenChrome() throws InterruptedException
	{
	driver = Browser.OpenBrowser("https://experts-staging.legalops.com/");
	//driver = Browser.OpenBrowser("https://staging:9UXn7'ufSyG<Lr^2@staging.legalops.com/admin");
	Login obj1 = new Login(driver);
	obj1.enterAuthUser("user13");
	obj1.enterAuthPassword("agoSLTeE");
	obj1.clickOnSubmitButton();
	Thread.sleep(3000);
	}
@Test (priority = 1)
	public void TestingBrokenLinkOn_LoginPage() throws InterruptedException, IOException
	{
		BrokenLinks obj = new BrokenLinks();
		obj.brokenLink();
		Thread.sleep(3000);
	}
@Test (priority = 2)
	public void TestingBrokenLinkOn_ConfirmEligibility() throws InterruptedException, IOException
	{
		Registration_Expert_Staging Res = new Registration_Expert_Staging(driver);
		BrokenLinks obj = new BrokenLinks();
		Res.clickHereButton();
		Thread.sleep(2000);
		obj.brokenLink();
		Res.clickEmployeeCheckBox();
		Thread.sleep(2000);
		Res.clickAgreementCheckBox();
		Thread.sleep(2000);
		Res.clickOnNextButton();
		Thread.sleep(2000);
	}
@Test (priority =3)	
	public void TestingBrokenLinkFromStep2() throws InterruptedException, IOException
	{
		BrokenLinks obj = new BrokenLinks();
		obj.brokenLink();
	}
}
