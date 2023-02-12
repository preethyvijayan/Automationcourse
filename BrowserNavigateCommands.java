package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigateCommands {
	public WebDriver driver;
	//browser commands
	public void initializebrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Automationcourse\\src\\main\\java\\Resource\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}
	public void pageTitle()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("The actaul title and expected title is same");
		}
		else
		{
			System.out.println("The actaul title and expected title is not same");
		}
	}
	public void currentUrl() {
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://www.makemytrip.com/";
		if(actualurl.equals(expectedurl))
		{
			System.out.println("The actual url and expected url is same");
		}
		else
		{
			System.out.println("The actual url and expected url is not same");	
		}
	}
	public void pageSource()
	{
		String pagesource=driver.getPageSource();
		if(pagesource.contains("https://fonts.googleapis.com/css?family=Lato:300,400,400i,700,900&display=swap"))
		{
			System.out.println("Same content");
		}
		else
		{
			System.out.println("Not Same content");
		}
	}
	public void close()
	{
		driver.close();
	}
	public void quit()
	{
		driver.quit();
	}
//Navigation commands
	public void navigateTo()
	{
		driver.navigate().to("https://www.easemytrip.com/");
		System.out.println("navigated to next url");
		
	}
	public void navigateForward()
	{
		driver.navigate().forward();
		System.out.println("page forwarded");
	}
	public void navigateBack()
	{
		driver.navigate().back();
		System.out.println("page backward");
	}
	public void navigateRefresh()
	{
		driver.navigate().refresh();
		System.out.println("Page refreshed");
	}
	public static void main(String args[])
	{
		BrowserNavigateCommands obj=new BrowserNavigateCommands();
		obj.initializebrowser();
		obj.pageTitle();
		obj.currentUrl();
		obj.pageSource();
		obj.navigateTo();
		obj.navigateBack();
		obj.navigateForward();
		obj.navigateRefresh();
		//obj.close();
		obj.quit();
	}

}
