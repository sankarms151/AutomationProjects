package week7.day1;

import org.openqa.selenium.By;

import commonMethods.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {

	@When("Click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on the leads tab")
	public void click_on_the_leads_tab() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on the create lead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the company name as {string}")
	public void enter_the_company_name_as_test_leaf(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("Enter the first name as {string}")
	public void enter_the_first_name_as_gokul(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@Given("Enter the last name as {string}")
	public void enter_the_last_name_as_sekar(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@Given("Enter the phone number as {string}")
	public void enter_the_phone_number_as(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Retrive and print the lead id and verify the company name as {string} and fist name as {string} and last name as {string}")
	public void retrive_and_print_the_lead_id(String cnameExpected, String fnameExpected, String lnameExpected) {
	    String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
	    System.out.println("The Lead ID is "+leadID);
	    String cnameActual = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^A-Za-z]", "");
	    if(cnameActual.equalsIgnoreCase(cnameExpected)) {
	    	System.out.println("The company name is verifed as "+cnameActual);
	    }else {
	    	System.out.println("The company name is not verifed as "+cnameExpected);
	    }
	}
	
	
	
	
}
