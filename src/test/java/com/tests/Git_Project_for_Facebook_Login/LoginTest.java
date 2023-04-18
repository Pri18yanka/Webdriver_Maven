package com.tests.Git_Project_for_Facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep()
	{
		System.setProperty("webdriver.chorme.driver", "D:\\Selenium 2022\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launching Browser");
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("priyankasalokhe18@gmail.com");
		
		System.out.println("Entering Password");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		
		System.out.println("Clicking on Login Button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Login into Facebook Account");	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
