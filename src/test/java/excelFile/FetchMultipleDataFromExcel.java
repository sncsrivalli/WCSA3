package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		//DataFormatter df = new DataFormatter();

//		System.out.println(sheet.getLastRowNum());
//		System.out.println(sheet.getRow(0).getLastCellNum());
		String[][] arr = new String[sheet.getLastRowNum()+1][sheet.getRow(2).getLastCellNum()];
		
		for(int i=0; i<=sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(2).getLastCellNum();j++) {
				arr[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		for(int i=0 ; i<=sheet.getLastRowNum(); i++) {
			for(int j=0; j<sheet.getRow(2).getLastCellNum();j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		wb.close();
	}

}
