package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//Webdriver is using commonly,if we want to run chrome driver then we can write ChromeDriver driver,generalise web browsing is doing so we used WebDriver
	
	public void initialiseBrowser()//to configer webdriver
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automationcourse\\src\\main\\java\\Resource\\chromedriver.exe");//which driver, location of driver
		driver=new ChromeDriver();//for adding selenium tool
		driver.get("https://www.amazon.in/");//application url
	}
	public static void main(String args[])
	{
		Base obj=new Base();
		obj.initialiseBrowser();
	}
}
