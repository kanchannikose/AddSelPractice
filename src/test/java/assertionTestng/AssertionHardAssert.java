package assertionTestng;

import org.testng.Assert;

import org.testng.annotations.Test;

public class AssertionHardAssert
{
	
	
	/*
	@Test
	public void test()
	{
		System.out.println("open browser");
		System.out.println("enter Username");
		System.out.println("enter password ");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, true );
		System.out.println("validate home page");
		Assert.assertEquals(true, true);
		System.out.println("go to deal page");
		System.out.println("create a deal page");
		System.out.println("go to contact page");
		System.out.println("create contact page");
		Assert.assertEquals(false, true, "contact is not created");
				
	}
	
	
	*/
	
	
	
	@Test
	public void test()
	{
		System.out.println("open browser");
		System.out.println("enter username");
		System.out.println("enter password");
		Assert.assertEquals(true, true);
		System.out.println("validate home page");
		Assert.assertEquals(true, true);
		System.out.println("go to deal page");
		System.out.println("create a deal page");
		System.out.println("go to contact page");
		System.out.println("create contact page");
		Assert.assertEquals(false, true, "contact is not created");
	}
	
	
	
	
	
	
	
	
	

}
