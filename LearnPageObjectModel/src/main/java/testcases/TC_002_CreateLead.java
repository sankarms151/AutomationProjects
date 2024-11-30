package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod{

	
	@Test
	public void runCreateLead() {
		LoginPage lp  = new LoginPage();
		/*
		 * lp.enterUsername(); lp.enterPassword(); lp.clickLoginButton();
		 */
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhoneNumber()
		.clickCreateLeadButton()
		.retriveLeadId();
	}
	
}
