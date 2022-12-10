package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		//Step 2: Open workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: Get control over Sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		//Step 4: Get control over row
		Row row = sheet.getRow(0);
		
		//Step 5: Get control over cell
		Cell cell = row.getCell(1);
		
		//Step 6: Fetch the value
		System.out.println(cell.getStringCellValue());
		
		//Step 7: Close workbook
		wb.close();
		
	}

}
