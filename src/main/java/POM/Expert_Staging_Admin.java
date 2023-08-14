package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseTest;

public class Expert_Staging_Admin extends BaseTest
{
	@FindBy(xpath="//a[@id='pending-approval']") private WebElement ProvidersApprovals;
	@FindBy(xpath="//a[@id='settings']") private WebElement Setting;
	@FindBy(xpath="//a[@id='admin-my-dashboard']") private WebElement MyDashboard;
	@FindBy(xpath="//a[@id='all-notifications']") private WebElement Notifications;
	@FindBy(xpath="//a[@id='company-list']") private WebElement Companies;
	@FindBy(xpath="//a[@id='master-data']") private WebElement MasterData;
	@FindBy(xpath="//a[@id='users']") private WebElement Members;
	@FindBy(xpath="//a[@id='registration']") private WebElement Memberships;
	@FindBy(xpath="//a[@id='all-notes']") private WebElement Notes;
	@FindBy(xpath="//a[@id='notifications']") private WebElement Notificatin_email_Templates;
	
	public Expert_Staging_Admin()
	{
		PageFactory.initElements(driver, this);
	}
	public void click_ProvidersApprovals()
	{
		ProvidersApprovals.click();
	}
	public void click_Setting()
	{
	Setting.click();
	}
	public void click_MyDashboard()
	{
	MyDashboard.click();
	}
	public void click_Notifications()
	{
	Notifications.click();
	}
	public void click_Companies()
	{
		Companies.click();
	}
	public void click_MasterData()
	{
		MasterData.click();
	}
	public void click_Members()
	{
		Members.click();
	}
	public void click_Membership()
	{
		Memberships.click();
	}
	public void click_Notes()
	{
		Notes.click();
	}
	public void Notificatin_email_Templates()
	{
		Notificatin_email_Templates.click();
	}
}
