package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class MergeLeadSe extends SeMethods{
	@Test(groups="regression")
	public void merge() throws InterruptedException {
		
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

		//Locate the link Merge Leads and click
		click(locateElement("linkText", "Merge Leads"));

		//Store the parent window name
		//String parentWindow = driver.getWindowHandle();

		//Locate the button of from lead and click
		click(locateElement("xpath", "//table[@class='twoColumnForm'][1]/tbody/tr[1]/td[2]/a"));

		switchToWindow(1);
		
		//locate the lead ID and send inputs	
		type(locateElement("xpath", "//form/div[@class='x-tab-panel']/div[2]/div/div/div/div/div[1]/div/input"), "11206");

		//locate the find leads button and click
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(5000);

		//locate the first value of the search result and click
		click(locateElement("xpath", "//div[@class='x-grid3-body']/div[1]/table/tbody/tr/td[1]/div/a"));

		Thread.sleep(5000);

		//switch to child window
		switchToWindow(0);

		//Locate the button of To lead and click
		click(locateElement("xpath", "//table[@class='twoColumnForm'][1]/tbody/tr[2]/td[2]/a"));

		//switch to child window
		switchToWindow(1);

		//locate the lead ID and send inputs
		type(locateElement("xpath", "//form/div[@class='x-tab-panel']/div[2]/div/div/div/div/div[1]/div/input"), "11207");

		
		//locate the find leads button and click
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		Thread.sleep(5000);

		//locate the first value of the search result and click
		driver.findElementByXPath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr/td[1]/div/a").click();

		Thread.sleep(5000);
		
		switchToWindow(0);
		//driver.switchTo().window(parentWindow);

		//locate the Merge button and click
		click(locateElement("linkText", "Merge"));

		//Accept the alert
		acceptAlert();

		
		//Locate the link text Find Leads Lead and click
		click(locateElement("linkText", "Find Leads"));

		//locate the lead id and send the input
		type(locateElement("xpath", "//form/div[@class='x-tab-panel']/div[2]/div/div/div/div/div/div/input"), "11206");

		//locate the find leads button and click
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));

		//verify the error message
		verifyExactText(locateElement("xpath", "//div[contains(text(),'No records to display')]"), "No records to display");
		
		closeBrowser();
		
	}

}
