package propertyFileRelated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileExample {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\example.properties";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		pro.load(fis);
		
		fis.close();
		
		String name = pro.getProperty("name");
		String position = pro.getProperty("position");
		String javarate = pro.getProperty("javarate");
		String experience = pro.getProperty("experience");
		String project = pro.getProperty("project");
		String company = pro.getProperty("company");
		
		for(String key : pro.stringPropertyNames())
		{
			System.out.println(key +" " + pro.getProperty(key));
		}
		
		

	}

}
