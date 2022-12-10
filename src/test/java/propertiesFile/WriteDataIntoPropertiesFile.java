package propertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");

		//Step 2: Create instance for Properties class
		Properties p = new Properties();
		
		//Step 3: Load properties file to project
		p.load(fis);
		
		//Step 4: Write data into properties file
		p.put("url2", "https://www.facebook.com/");
		
		//Step 5:Save properties file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData.properties");
		p.store(fos, "Data Updated Successfully");
	}

}
