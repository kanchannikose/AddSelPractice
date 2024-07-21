package com.KanchanPractce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{
	//-------->DataProvider method in same class<--------------

	
	/*
	@Test(dataProvider="LoginDataProvider")
	public void loginTestData(String mail, String pwd)
	{
		System.out.println(mail+" "+pwd);
	}
	

	@DataProvider(name="LoginDataProvider")
	public Object[][] getData()
	{
		
		Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"mno@gmail.com","mno"}};
		return data;
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------->DataProvider method in diff class<--------------------------------
	
	@Test(dataProvider="loginDataProvider", dataProviderClass=CustomDataProvider.class)
	
	public void loginTest(String email, String pwd)
	{
		System.out.println(email+" "+pwd);
	}
	
	
	
	
	
	
	
	
	
	
}
