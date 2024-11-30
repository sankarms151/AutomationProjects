package testcases;

import org.junit.Test;

import wdMethods.ProjectMethod;

public class EditLead extends ProjectMethod {
	
	@Test

public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),"Swathi");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		click(locateElement("linkText","10623"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("xpath", "//a[text()='Edit']"));
		type(locateElement("id", "updateLeadForm_companyName"), "Testleaf2");
		click(locateElement("xpath", "(//input[@class='smallSubmit'])[1]"));
		verifyExactText(locateElement("id", "viewLead_companyName_sp"), "Testleaf2");
		closeBrowser();

	}
	
	

}
