package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");

		//Step 2: Create an instance of Properties class
		//Properties class is available in java.util package
		Properties p = new Properties();
		
		//Step 3: Load properties file into project
		p.load(fis);
		
		//Step 4: Fetch data from properties file
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}
