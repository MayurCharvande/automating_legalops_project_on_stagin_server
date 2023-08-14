package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll_Upto_Elements extends BaseTest
{
	public WebDriver ScrollingDown(String elementPath) throws InterruptedException
	{
		 /*Scroll Down*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(elementPath));
        js.executeScript("arguments[0].scrollIntoView();", element);
       // js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(3000);
        return driver;
	}
}
