package week6.day1;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {

	
	@Test(priority = 1, invocationTimeOut = 1000)
	public void runLogin() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Login TC");
	}
	
	@Test(priority = 2, dependsOnMethods = {"runLogin"})
	public void runCreateLead() {
		System.out.println("CreateLead TC");
	}
	
	@Test(priority = -3, invocationCount = 5, invocationTimeOut = 5000, threadPoolSize = 3)
	public void runCreateAccount() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("CreateAccount TC");
	}
	
	
}
