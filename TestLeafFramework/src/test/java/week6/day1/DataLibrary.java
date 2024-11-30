package week6.day1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	
	public static String[][] readExcelData() throws InvalidFormatException, IOException {
		
		//step1: Set the excel file path
		File filePath = new File("./testData/CreateLead.xlsx");
		
		//step2: Open the workbook
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);
		
		//step3: Get the sheet from workbook
		XSSFSheet sheetByIndex = workBook.getSheetAt(0);
		XSSFSheet sheetByName = workBook.getSheet("Sheet1");
		
		//step4: Get the row count
		int rowCount = sheetByIndex.getLastRowNum();
		System.out.println("Row count -> "+rowCount);
			
		//step5: Get the row
		XSSFRow firstRow = sheetByIndex.getRow(0);
		
		//step6: Get the column count
		int columnCount = firstRow.getLastCellNum();
		System.out.println("Column Count -> "+columnCount);
		
		//Read All testData
		String[][] data = new String[rowCount][columnCount];
		System.out.println("<----------------------All Test Data--------------------------->");
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j <columnCount; j++) {
				String stringCellValue = sheetByIndex.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j] = stringCellValue;

			}
		}
		
		workBook.close();
		
		return data;
	}

}
