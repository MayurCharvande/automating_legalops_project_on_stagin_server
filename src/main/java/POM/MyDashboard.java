package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseTest;

public class MyDashboard extends BaseTest
{
	
		 @FindBy(xpath=("(//a[@id='my_page'])[1]")) private WebElement mydashboard;
		 	public MyDashboard()
		 	{
		 		PageFactory.initElements(driver, this);
		 	}
		 	public void clickOnMyDashboared()
		 	{
		 		mydashboard.click();
		 	}
	
}
