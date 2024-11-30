package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {

	
	public HomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("Logged out successfully");
		return new LoginPage();
	}
	
}
