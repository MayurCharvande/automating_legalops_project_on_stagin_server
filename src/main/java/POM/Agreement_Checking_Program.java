package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseTest;

public class Agreement_Checking_Program extends BaseTest
{
	@FindBy(xpath="(//button[@type=\"button\"])[14]") WebElement nextButton1;
	@FindBy(xpath="(//button[@type=\"button\"])[16]") WebElement nextButton2;
	@FindBy(xpath="//button[text()='Continue']") WebElement continueButton;
	@FindBy(xpath="//span[@class='title']") WebElement titleOfAgreement;
	@FindBy(xpath="(//label[@class=\"radio-custom-label table-checkbox-label p-10\"])[5]") WebElement radioButton;
	
	public Agreement_Checking_Program (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnNextButton1()
	{
		nextButton1.click();
	}
	public void clickOnNextButton2()
	{
		nextButton2.click();
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	public void clickOnRadioButton()
	{
		radioButton.click();
	}
	public void titleOfAgreementPresentOrNot(String actual, String expected)
	{
		if(expected.equals(actual))
		{
			System.out.println("Agreement is present");
		}
		else
		{
			System.out.println("You need to Upload Aggrement");
		}
	}
}
