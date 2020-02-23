package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	
	@BeforeSuite
	public void setIp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SOFT\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("vechhabharath@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("password");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
}
