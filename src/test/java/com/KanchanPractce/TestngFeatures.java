package com.KanchanPractce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngFeatures {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	//number of time it will lauch app ==number of test script   
	
	@Test()
	public void userName()
	{
		 System.out.println("enter username");
		// int i=9/0;
	}
	
	@Test(dependsOnMethods="userName")
	public void password()
	{
		System.out.println("Enter password");
	}
	
	@Test(dependsOnMethods="userName")
	public void login()
	{
		System.out.println("Click on submitt button");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
