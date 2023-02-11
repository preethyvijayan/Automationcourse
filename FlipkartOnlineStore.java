package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartOnlineStore {
	public WebDriver driver;
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automationcourse\\src\\main\\java\\Resource\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	public void pageTitle()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Page title is same");
		}
		else
		{
			System.out.println("Page title is not same");
		}
	}
	public void currentUrl()
	{
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://www.flipkart.com/";
		if(actualurl.equals(expectedurl))
		{
			System.out.println("Url is same");
		}
		else
		{
			System.out.println("Url is not same");
		}
	}
	public void toClose()
	{
		driver.close();
	}

	public static void main(String[] args) {
		FlipkartOnlineStore obj=new FlipkartOnlineStore();
		obj.initializeBrowser();
		obj.pageTitle();
		obj.currentUrl();
		obj.toClose();

	}

}
