package wdMethods;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class ProjectMethod extends SeMethods{
	
	        @Parameters({"browser","url","uName","upmd"})
	        @BeforeMethod(groups="smoke")
	     	public void LoginLeafTaps(String browser,String url,String username,String password) throws InterruptedException {
			startApp(browser, url);
			//WebElement eleuserName = locateElement("id", username);
			//type(eleuserName, "username");
			type(locateElement("id", "username"), username);
			type(locateElement("id", "password"), password);
			Thread.sleep(5000);
			click(locateElement("class", "decorativeSubmit"));
			click(locateElement("linkText", "CRM/SFA"));

		}		
	        
	       	
		@AfterMethod
		public void closeBrowser() {
			// TODO Auto-generated method stub
			driver.close();
		}
		@DataProvider(name="fetchData")
		public String[][] getData() throws InvalidFormatException, IOException{
			/*data[0][0]="Test Leaf";
			data[0][1]="Satheesh";
			data[0][2]="R";
			data[1][0]="Test Leaf";
			data[1][1]="Sankar";
			data[1][2]="V";*/
			File src=new File("./testdata/login.xlsx");
			XSSFWorkbook wBook=new XSSFWorkbook(src);
			XSSFSheet sheet=wBook.getSheet("sheet2");
			int rowCount=sheet.getLastRowNum();
			int columnCount=sheet.getRow(0).getLastCellNum();
			String[][] data= new String[rowCount][columnCount];
			System.out.println(rowCount);
			System.out.println(columnCount);
			for(int i=1;i<=rowCount;i++){
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<columnCount;j++){
					XSSFCell cell=row.getCell(j);
					data[i-1][j]=cell.getStringCellValue();		
					System.out.println(data);
							
				}
			}wBook.close();
			
			return data;
			
}

}
