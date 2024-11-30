package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonMethods.ProjectSpecificClass;
import week6.day1.DataLibrary;



public class CreateLead extends ProjectSpecificClass {

	@Test(dataProvider = "fetchData")
	public void createLead(String cname, String fname, String lname, String phno) {

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(indices = {2 , 0}, name = "fetchData")
	public String[][] sendData() throws InvalidFormatException, IOException{


		String[][] excelData = DataLibrary.readExcelData();

		return excelData;


	}


}






