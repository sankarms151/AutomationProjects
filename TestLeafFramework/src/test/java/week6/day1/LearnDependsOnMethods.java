package week6.day1;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(priority = 1)
	public void runLogin() {
		System.out.println("Login TC");
	}
	
	@Test(priority = 2, dependsOnMethods = "runLogin")
	public void createAccount() {
		
		System.out.println("Account created");
	}
	
	@Test(priority = 3, invocationCount = 3)
	public void runLead() {
		System.out.println("CreateLead TC");
	}
	
	
}
