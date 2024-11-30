package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import testcases.Login;

public class CreateLead {	
	public static void main(String[] args) throws InterruptedException {
	
				//set the driver				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//Maximize the driver
				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("http://www.leaftaps.com/opentaps/");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Locate the username and enter the user name
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Locate the password and enter the password
				driver.findElementById("password").sendKeys("crmsfa");
				
				Thread.sleep(5000);
				//Locate the login button and click
				driver.findElementByClassName("decorativeSubmit").click();
				
				//Locate the logout button and click
				//driver.findElementByClassName("decorativeSubmit").click();
				
				
				//Locate the link text CRM/SFA and click
				driver.findElementByLinkText("CRM/SFA").click();
				
				//Locate the link text Leads and click
				driver.findElementByLinkText("Leads").click();
				
				//Locate the link text Create Lead and click
				driver.findElementByLinkText("Create Lead").click();
		      
				//Locate the id of companyName and send input
				driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
				
				//Locate the id of companyName and send input
				driver.findElementById("createLeadForm_firstName").sendKeys("Satheesh");

				//Locate the id of companyName and send input
				driver.findElementById("createLeadForm_lastName").sendKeys("R");
				
				//Locate the select for source and select an item.
				WebElement sourceElement = driver.findElementById("createLeadForm_dataSourceId");
				Select source = new Select(sourceElement);
				source.selectByValue("LEAD_EMPLOYEE");
				
				//Locate the select for Marketing campaign and select an item.
				WebElement marketingElement = driver.findElementById("createLeadForm_marketingCampaignId");
				Select marketing = new Select(marketingElement);
				
				List<WebElement> marketingOptions = marketing.getOptions();
				int count = marketingOptions.size();
				
				marketing.selectByIndex(count-2);
				
				//Locate the id of firstNameLocal and send input.
				driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Satheesh");
				
				//Locate the id of lastNameLocal and send input.
				driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
				
				//Locate the id of salutation and send input.
				driver.findElementById("createLeadForm_personalTitle").sendKeys("Dear");
				
				//Locate the id of Title and send input.
				driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
				
				//Locate the id of Department and send input.
				driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
				
				//Locate the id of Annual revenue and send input.
				driver.findElementById("createLeadForm_annualRevenue").sendKeys("3000");
				
				//Locate the select for Preferred currency and select an item.
				WebElement currencyElement = driver.findElementById("createLeadForm_currencyUomId");
				Select currencySource = new Select(currencyElement);
				currencySource.selectByValue("USD");
				
				//Locate the select for Industry and select an item.
				WebElement industryElement = driver.findElementById("createLeadForm_industryEnumId");
				Select industrySource = new Select(industryElement);
				industrySource.selectByIndex(3);
				
				//Locate the id of No of employees and send input.
				driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
				
				//Locate the select for Industry and select an item.
				WebElement ownerShipElement = driver.findElementById("createLeadForm_ownershipEnumId");
				Select ownerShipSource = new Select(ownerShipElement);
				ownerShipSource.selectByValue("OWN_PROPRIETOR");
				
				//Locate the id of sic code and send input.
				driver.findElementById("createLeadForm_sicCode").sendKeys("SIC_CODE_A");
				
				//Locate the id of ticker symbol and send input.
				driver.findElementById("createLeadForm_tickerSymbol").sendKeys("AAA");
				
				//Locate the id of Description and send input.
				driver.findElementById("createLeadForm_description").sendKeys("Desciption Desciption Desciption");
				
				//Locate the id of Important note and send input.
				driver.findElementById("createLeadForm_importantNote").sendKeys("Notes Notes Notes");
				
				//Locate the id of country code and send input.
				driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
				
				//Locate the id of Area code and send input.
				driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
				
				//Locate the id of Phone number and send input.
				driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("23232323");
				
				//Locate the id of Extension and send input.
				driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("8484");
				
				//Locate the id of Person to ask for and send input.
				driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Satheesh");
			
				//Locate the id of Email id and send input.
				driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
				
				//Locate the id of Web URL and send input.
				driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://www.leaftaps.com");
				
				
				//Locate the id of To Name and send input.
				driver.findElementById("createLeadForm_generalToName").sendKeys("R.Satheesh Kumar");
				
				//Locate the id of ATtention Name and send input.
				driver.findElementById("createLeadForm_generalAttnName").sendKeys("RSK");
				
				//Locate the id of Address 1 and send input.
				driver.findElementById("createLeadForm_generalAddress1").sendKeys("College Road");
				
				//Locate the id of Address 2 and send input.
				driver.findElementById("createLeadForm_generalAddress2").sendKeys("Nanganallur");
				
				//Locate the id of City and send input.
				driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
				

				//Locate the select for Country and select an item.
				WebElement countryElement = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select countrySource = new Select(countryElement);
				countrySource.selectByValue("IND");
				
				
				//Locate the select for State/Province and select an item.
				WebElement stateElement = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
				Select stateSource = new Select(stateElement);
				stateSource.selectByValue("IN-TN");
				
				
				//Locate the id of Postal code and send input.
				driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600033");
				
				
				//Locate the id of Postal code extension and send input.
				driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600033");
				
				
				//Locate the create lead button and click
				driver.findElementByName("submitButton").click();
				
	}


}
