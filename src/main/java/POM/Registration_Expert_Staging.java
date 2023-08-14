package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Expert_Staging 
{
	@FindBy(xpath="//a[text()='click here']") private WebElement clickhere;
	@FindBy (xpath="//h6[text()='CURRENTLY EMPLOYED']")private WebElement EmployeeCheckBox;
	@FindBy (xpath="//label[@for='agree2']")private WebElement AgreementCheckBox;
	@FindBy (xpath="(//button[@type='button'])[1]")private WebElement Next;
	public Registration_Expert_Staging(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickHereButton()
	{
		clickhere.click();
	}
	public void clickEmployeeCheckBox()
	{
		EmployeeCheckBox.click();
	}
	public void clickAgreementCheckBox()
	{
		AgreementCheckBox.click();
	}
	public void clickOnNextButton()
	{
		Next.click();
	}
}
