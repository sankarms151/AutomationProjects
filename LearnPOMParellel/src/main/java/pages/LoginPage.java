package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public LoginPage(ChromeDriver driver) {
		
		System.out.println("Driver value is :" + driver);
		this.driver=driver;
		
	}

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
//		LoginPage lp = new LoginPage();
//		return lp;
//		return new  LoginPage();
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
}
