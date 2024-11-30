package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.ProjectSpecificMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class HooksImplementation extends ProjectSpecificMethod {

	//@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

	}

	//@After
	public void postCondition() {
		driver.quit();


	}



}
