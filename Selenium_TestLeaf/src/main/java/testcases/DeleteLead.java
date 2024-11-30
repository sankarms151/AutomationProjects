package testcases;
import org.junit.Test;


import wdMethods.ProjectMethod;

public class DeleteLead extends ProjectMethod {
	
	@Test

	public void deletelead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		click(locateElement("xpath","(//span[text()='Phone'])"));
		type(locateElement("xpath","//input[@name='phoneNumber']"),"9677794764");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String input = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("class", "subMenuButtonDangerous"));
		click(locateElement("linkText", "Find Leads"));
		Thread.sleep(3000);
		type(locateElement("xpath","//div[@class='x-form-element']/input[@name='id']"),input);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		//String error = getText(locateElement("class","x-paging-info"));
		verifyExactText(locateElement("class","x-paging-info"),"No records to display");
		
		
		
		
	}

}
