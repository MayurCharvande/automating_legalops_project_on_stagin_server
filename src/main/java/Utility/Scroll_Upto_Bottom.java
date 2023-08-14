package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll_Upto_Bottom extends BaseTest
{
	public WebDriver ScrollingBottom() throws InterruptedException
	{
		 /*Scroll Down*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
      // js.executeScript("javascript:window.scrollBy(0,0)");
        Thread.sleep(3000);
        return driver;
	}
}
