package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{
	//	ChromeDriver driver;

	@Given("Set the Environment")
	public void setEnvironment() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	}

	/*
	 * @Given("Enter the username as demosalesmanager") public void
	 * enter_the_username_as_demosalesmanager() {
	 * driver.findElement(By.id("username")).sendKeys("demosalesmanager"); }
	 */

	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}	


	/*
	 * @Given("Enter the username as demo123") public void enterUsername2() {
	 * driver.findElement(By.id("username")).sendKeys("demo123"); }
	 * 
	 * @Given("Enter the password as crmsfa") public void enterPassword2() {
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 */
	//}

	@When("Click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verifyLogin2() {
		System.out.println(driver.getTitle());
	}

}
