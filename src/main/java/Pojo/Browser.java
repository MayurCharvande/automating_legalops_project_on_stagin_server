package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	public static WebDriver OpenBrowser(String url) 
	{	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\latest\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fxbytes\\eclipse-workspace\\Fxbytes\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		return driver;

	}
	private static void sum() 
	{
		
	}
}
