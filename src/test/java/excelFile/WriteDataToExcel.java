package excelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		//Creates new row by deleting the older values, should be given only when row doesn't have any data
		//Row row = sheet.createRow(3);
		
		//Get control over row
		Row row = sheet.getRow(1);
		
		//Creates new cell by deleting the older values
		Cell cell = row.createCell(2);
		
		//It sets the value into the cell
		cell.setCellValue("Hello");
		
		//Save data into Excel
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		fos.flush();
		wb.close();
		
		
	}

}
