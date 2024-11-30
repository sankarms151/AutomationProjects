package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethod;


public class CreateLead1 extends ProjectMethod {
	
	@Test(groups="smoke",dataProvider="fetchData",dataProviderClass=wdMethods.ProjectMethod.class)
	
	
	public void login(String cName,String fName,String lName) throws InterruptedException {
		
		click(locateElement("linkText", "Create Lead"));
		
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		
		selectDropDownUsingValue(locateElement("id", "createLeadForm_dataSourceId"), "LEAD_EMPLOYEE");
		
		//Locate the select for Marketing campaign and select an item.
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");
		
		//Locate the id of firstNameLocal and send input.
		type(locateElement("id", "createLeadForm_firstNameLocal"), "Satheesh");
		
		//Locate the id of lastNameLocal and send input.
		type(locateElement("id", "createLeadForm_lastNameLocal"), "Kumar");
		
		//Locate the id of salutation and send input.
		type(locateElement("id", "createLeadForm_personalTitle"), "Dear");
		
		//Locate the id of Title and send input.
		type(locateElement("id", "createLeadForm_generalProfTitle"), "Mr");
		
		//Locate the id of Deaprtment and send input.
		type(locateElement("id", "createLeadForm_departmentName"), "Testing");
		
		//Locate the id of Annual revenue and send input.
		type(locateElement("id", "createLeadForm_annualRevenue"), "3000");
		
		//Locate the select for Preferred currency and select an item.
		selectDropDownUsingValue(locateElement("id", "createLeadForm_currencyUomId"), "USD");
		
		//Locate the select for Industry and select an item.
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), 3);
		
		//Locate the id of No of employees and send input.
		type(locateElement("id", "createLeadForm_numberEmployees"), "1000");
		
		//Locate the select for Industry and select an item.
		selectDropDownUsingValue(locateElement("id", "createLeadForm_ownershipEnumId"), "OWN_PROPRIETOR");
		
		//Locate the id of sic code and send input.
		type(locateElement("id", "createLeadForm_sicCode"), "SIC_CODE_A");
		
		//Locate the id of ticker symbol and send input.
		type(locateElement("id", "createLeadForm_tickerSymbol"), "AAA");
		
		//Locate the id of Description and send input.
		type(locateElement("id", "createLeadForm_description"), "Desciption Desciption Desciption");
		
		//Locate the id of Important note and send input.
		type(locateElement("id", "createLeadForm_importantNote"), "Notes Notes Notes");
		
		//Locate the id of country code and send input.
		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "91");
		
		//Locate the id of Area code and send input.
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "044");
		
		//Locate the id of Phone number and send input.
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "23232323");
		
		//Locate the id of Extension and send input.
		type(locateElement("id", "createLeadForm_primaryPhoneExtension"), "8484");
		
		//Locate the id of Person to ask for and send input.
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "Satheesh");
	
		//Locate the id of Email id and send input.
		type(locateElement("id", "createLeadForm_primaryEmail"), "abc@gmail.com");
		
		//Locate the id of Web URL and send input.
		type(locateElement("id", "createLeadForm_primaryWebUrl"), "http://www.leaftaps.com");
		
		//Locate the id of To Name and send input.
		type(locateElement("id", "createLeadForm_generalToName"), "R.Satheesh Kumar");
		
		//Locate the id of ATtention Name and send input.
		type(locateElement("id", "createLeadForm_generalAttnName"), "RSK");
		
		//Locate the id of Address 1 and send input.
		type(locateElement("id", "createLeadForm_generalAddress1"), "College Road");
		
		//Locate the id of Address 2 and send input.
		type(locateElement("id", "createLeadForm_generalAddress2"), "Nanganallur");
		
		//Locate the id of City and send input.
		type(locateElement("id", "createLeadForm_generalCity"), "Chennai");
		
		//Locate the select for Country and select an item.
		selectDropDownUsingValue(locateElement("id", "createLeadForm_generalCountryGeoId"), "IND");
		
		//Locate the select for State/Province and select an item.
		selectDropDownUsingValue(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), "IN-TN");
		
		//Locate the id of Postal code and send input.
		type(locateElement("id", "createLeadForm_generalPostalCode"), "600033");
		
		//Locate the id of Postal code extension and send input.
		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), "600033");
		
		//Locate the create lead button and click
		click(locateElement("name","submitButton"));
		
		//close the browser
		//closeBrowser();
	}
	
	
			
		
		
		
		
		
		
	}


