package assertionTestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftAssert
{/*
	
	SoftAssert sa= new SoftAssert();
	@Test
	public void test()
	{
		
		System.out.println("open browser");
		System.out.println("enter Username");
		System.out.println("enter password ");
		System.out.println("click on sign in button");
		sa.assertEquals(true, true);
		System.out.println("validate home page");
		sa.assertEquals(true, true);
		System.out.println("go to deal page");
		System.out.println("create a deal page");
		sa.assertEquals(true, true);
		System.out.println("go to contact page");
		System.out.println("create contact page");
		sa.assertAll();
		
		
				
	}
	@Test
	public void test2()
	{
		System.out.println("logout");
		//sa.assertEquals(false,true);
		sa.assertEquals(true, true);
		sa.assertAll();
		
	}
	
	*/
	
	
	
	
	
	
	
	SoftAssert sa=new SoftAssert();
	
	@Test(priority=1)
	public void test()
	{
		System.out.println("open the browser");
		System.out.println("enter username");
		System.out.println("enter password");
		sa.assertEquals(true, true);
		System.out.println("home page is validated");
		//sa.assertEquals(false, true);
		System.out.println("create contact");
		System.out.println("contact is created");
		sa.assertEquals(true, true);
		sa.assertAll();
	}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("click on logout button");
		sa.assertEquals(false, true);
		System.out.println("log out successfully");
		sa.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
