package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethod;
//import wdMethods.SeMethods;

public class DuplicateTestLeadSe extends ProjectMethod{

	@Test(groups="sanity")
	public void duplicateTestLead() throws InterruptedException {
		//Launch the URL and set initial properties
		startApp("chrome", "http://leaftaps.com/opentaps");

		//locate the user name and send input
		WebElement eleuserName = locateElement("id", "username");
		type(eleuserName, "DemoSalesManager");

		//locate the password and send input
		type(locateElement("id", "password"), "crmsfa");

		Thread.sleep(5000);

		//locate the login button and click
		click(locateElement("class", "decorativeSubmit"));

		//Locate the link text CRM/SFA and click
		click(locateElement("linkText", "CRM/SFA"));
		//Locate the link text Leads and click
		click(locateElement("linkText", "Leads"));

		//Locate the link text Find Leads Lead and click
		click(locateElement("linkText", "Find Leads"));
		
		//Locate the link text Email and click
		click(locateElement("xpath", "//span[text()='Email']"));
		
		//Locate the email and enter the email
		type(locateElement("name", "emailAddress"),"abc@gmail.com");
		
		//Locate the Find Leads button and click
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		Thread.sleep(5000);
		
		String actualLeadName = getText(locateElement("xpath", "//*[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a"));
		//Locate the first Lead id and click
		click(locateElement("xpath", "//*[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a"));
		
		Thread.sleep(5000);
		
		//Locate the duplicate Lead button and click
		click(locateElement("linkText", "Duplicate Lead"));
		
		//verify whether the title is "Duplicate Lead"
		verifyExactText(locateElement("id", "sectionHeaderTitle_leads"),"Duplicate Lead");
		
		//Locate the create Lead button and click
		click(locateElement("name", "submitButton"));
		
		//check whether the lead name is matched
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), actualLeadName);
	}
}
