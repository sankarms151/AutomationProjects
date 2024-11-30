package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	public ViewLeadPage retriveLeadId() {
		String leadIdStr = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		//convert from String to int.
		int leadId = Integer.parseInt(leadIdStr);
		System.out.println("The lead id is "+leadId);
		Assert.assertTrue(leadId>0, "Failed to validate the lead id");
		return this;
	}
	
	
}
