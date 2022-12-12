package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		
		DataFormatter df = new DataFormatter();
		
//		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(3);
//		Cell cell = row.getCell(0);
//		
//		System.out.println(df.formatCellValue(cell));
		
		System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(0)));
		wb.close();
		
	}

}
