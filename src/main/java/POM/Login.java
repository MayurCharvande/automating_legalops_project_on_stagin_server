package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	@FindBy(xpath="//input[@type='text']") private WebElement AuthUser;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement AuthPassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement AuthSubmit;
	@FindBy(xpath="//input[@id='user_email']") private WebElement userName;
	@FindBy(xpath="//input[@name='user_password']") private WebElement password;
	@FindBy(xpath="//button[@id='submit_login']") private WebElement loginButton;
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterAuthUser(String user)
	{
		AuthUser.sendKeys(user);
	}
	public void enterAuthPassword(String Authpass)
	{
		AuthPassword.sendKeys(Authpass);
	}
	public void clickOnSubmitButton()
	{
		AuthSubmit.click();
	}
	public void enterUserName(String name)
	{
		userName.sendKeys(name);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
