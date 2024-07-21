package propertyFileRelated;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFilesampleData {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\sampleData.properties";
        
		FileOutputStream fos=new FileOutputStream(filepath);
		
		pro.setProperty("Country", "USA");
		pro.setProperty("President", "Joe Biden");
		pro.setProperty("Vicepresident", "Kamla haris");
		pro.setProperty("Population", "33.33cr");
		
		pro.store(fos, "This is sample data");
		
		fos.close();
		
		System.out.println("The data has been written");
		
	}

}
