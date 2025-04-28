package com.KanchanPractce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test   (invocationCount=2)
	public void swapp()
	{
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a:--->"+a);
		System.out.println("b:--->"+b);
	//   Assert.assertEquals(a, 30, "Not matched");
		Assert.assertEquals(a, 20);
		Assert.assertEquals(b, 10);
		
	}

}
