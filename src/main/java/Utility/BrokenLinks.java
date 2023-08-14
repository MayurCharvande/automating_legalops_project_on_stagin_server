package Utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks extends BaseTest
{
	public WebDriver brokenLink() throws IOException
	{
			//driver.findElement(By.xpath(path));
			/*Get lists of all links & images*/
			List<WebElement> linkslist = driver.findElements(By.tagName("a"));
			linkslist.addAll(driver.findElements(By.tagName("img")));
			System.out.println("size of full links & images--->"+linkslist.size());
			
			List<WebElement> activelinks = new ArrayList<WebElement>();
			/*exclude all the links/images that doesn't have any href attribute*/
			for(int i=0;i<linkslist.size();i++)
			{
				System.out.println(linkslist.get(i).getAttribute("href"));
				
				if(linkslist.get(i).getAttribute("href")!=null && (! linkslist.get(i).getAttribute("href").contains("javascript")))
				{
					activelinks.add(linkslist.get(i));
				}
			}
			//get the size of active links list:
			System.out.println("size of active links and images--->"+activelinks.size());
			/*3. Check the href url with httpconnection api
			 200--ok
			 404--not found
			 500--internal error
			 400--bad request*/
			
			for(int j=0;j<activelinks.size();j++) 
			{
				HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response = connection.getResponseMessage();//ok
				connection.disconnect();
				System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
			}
			return driver;
		}	
}
