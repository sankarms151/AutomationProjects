package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod{

	
	@Test
	public void runLogin() {
		LoginPage lp  = new LoginPage(driver);
		/*
		 * lp.enterUsername(); lp.enterPassword(); lp.clickLoginButton();
		 */
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
	}
	
}
