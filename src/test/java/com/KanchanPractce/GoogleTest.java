package com.KanchanPractce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.amazon.in/");
	}	
	
	@Test(priority=1)
	public void checkTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" );
	}
	
	@Test(priority=2)
	public void checkIndia()
	{
		boolean nation=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']")).isDisplayed();
		System.out.println(nation);
		Assert.assertEquals(nation, true);
	}
	
	
	@Test(priority=3)
	public void search()
	{
		boolean sea=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).isDisplayed();
		System.out.println(sea);
	}
	
	@Test(priority=4)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=5)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority=6) 
	public void test3()
	{
		System.out.println("test3");
	}
	
	
   	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
		
	

	
	}


