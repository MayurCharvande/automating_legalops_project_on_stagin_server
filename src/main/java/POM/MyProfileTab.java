package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseTest;

public class MyProfileTab extends BaseTest
{
	@FindBy(xpath="//a[@id='my-profile']") private WebElement MyProfileButton;
	@FindBy(xpath="//a[text()='Public Profile']") private WebElement publicProfile;
	public MyProfileTab()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyProfileTab()
	{
		MyProfileButton.click();
	}
	public void clickOnPublicProfile()
	{
		publicProfile.click();
	}
}
