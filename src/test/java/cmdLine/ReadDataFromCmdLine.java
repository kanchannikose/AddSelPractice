package cmdLine;

import org.testng.annotations.Test;

public class ReadDataFromCmdLine {

	@Test
	
	public void read()
	{
		String uname=System.getProperty("username");
		System.out.println(uname);
		
		String pwd=System.getProperty("password");
		System.out.println(pwd);
	}
}
