package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{
	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText","CRM/SFA"));
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
		
		type(locateElement("id", "createLeadForm_companyName"), "chandra");
		type(locateElement("id", "createLeadForm_firstName"), "chandru");
		type(locateElement("id", "createLeadForm_lastName"), "D");
		
		//WebElement stateElement = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		//Select stateSource = new Select(stateElement);
		//stateSource.selectByValue("IN-TN");
		
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "LEAD_EMPLOYEE");
		
		
		click(locateElement("class", "smallSubmit"));
		
		
		
	}

}
