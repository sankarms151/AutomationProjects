package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpIrctc {
	public static void main(String[] args) throws InterruptedException {
		
		//set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the driver
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//set implicitlyWait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Locate the id of user id and send input
		driver.findElementById("userRegistrationForm:userName").sendKeys("rskumar");
		
		//Locate the id of password and send input
		driver.findElementById("userRegistrationForm:password").sendKeys("irctc#123");
		
		//Locate the id of confirm password and send input
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("irctc#123");
		
		//Locate the select for Security question and select an item.
		WebElement sourceElement = driver.findElementById("userRegistrationForm:securityQ");
		Select source = new Select(sourceElement);
		source.selectByIndex(1);
		
		//Locate the id of security answer and send input
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Nirmala School");
		
		//Locate the select for preferred language and select an item.
		WebElement languageElement = driver.findElementById("userRegistrationForm:prelan");
		Select languageSelect = new Select(languageElement);
		languageSelect.selectByIndex(0);
		
		//Personal Details
		
		//Locate the id of First name and send input
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Satheehs");
		
		//Locate the id of Middle name and send input
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Kumar");
				
		//Locate the id of Last name and send input
		driver.findElementById("userRegistrationForm:lastName").sendKeys("R");
		
		//Locate the id of gender and click
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		//Locate the id of Marital status and click
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		//Locate the select for DOB and select an item.
		WebElement dateElement = driver.findElementById("userRegistrationForm:dobDay");
		Select dateSelect = new Select(dateElement);
		dateSelect.selectByValue("16");
		
		//Locate the select for Month of birth and select an item.
		WebElement monthElement = driver.findElementById("userRegistrationForm:dobMonth");
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByValue("11");
		
		//Locate the select for Year of birth and select an item.
		WebElement yearElement = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByVisibleText("1983");
		
		//Locate the select occupation and select an item.
		WebElement occupationElement = driver.findElementById("userRegistrationForm:occupation");
		Select occupationSelect = new Select(occupationElement);
		occupationSelect.selectByVisibleText("Private");
		
		//Locate the id of Aadhaar and send input
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789012");
		
		//Locate the id of PAN and send input
		driver.findElementById("userRegistrationForm:idno").sendKeys("XAP2355AA");
		
		//Locate the select Country and select an item.
		WebElement countryElement = driver.findElementById("userRegistrationForm:countries");
		Select countrySelect = new Select(countryElement);
		countrySelect.selectByVisibleText("India");
				
		//Locate the id of Email and send input
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
				
		//Locate the id of ISD code  and send input
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		
		//Locate the id of Mobile number and send input
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9840111592");
		
		//Locate the select Nationality and select an item.
		WebElement nationalityElement = driver.findElementById("userRegistrationForm:nationalityId");
		Select nationalitySelect = new Select(nationalityElement);
		nationalitySelect.selectByVisibleText("India");
		
		//Locate the id of Adress and send input
		driver.findElementById("userRegistrationForm:address").sendKeys("Suyambu Enclave,A,GF");
				
		//Locate the id of street and send input
		driver.findElementById("userRegistrationForm:street").sendKeys("3rd Main road");
				
		//Locate the id of locality and send input
		driver.findElementById("userRegistrationForm:area").sendKeys("Medavakkam");
						
		//Locate the id of pincode and send input
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100",Keys.TAB);
		
		//Locate the id of state and click
		//driver.findElementById("userRegistrationForm:statesName").click();
		
		Thread.sleep(2000);
		
		//Locate the select city/town and select an item.
		WebElement cityElement = driver.findElementById("userRegistrationForm:cityName");
		Select citySelect = new Select(cityElement);
		citySelect.selectByIndex(1);

		Thread.sleep(2000);
		
		//Locate the select post office and select an item.
		WebElement postOfficElement = driver.findElementById("userRegistrationForm:postofficeName");
		Select postOfficSelect = new Select(postOfficElement);
		postOfficSelect.selectByIndex(1);
		
		//Locate the id of phone and send input
		driver.findElementById("userRegistrationForm:landline").sendKeys("2323233");
		
		//Locate the id of copy office address and click
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
				
		//Locate the id of Newletter option and click
		driver.findElementById("userRegistrationForm:newsletter:1").click();
		
		//Locate the id of commercial promo option and click
		driver.findElementById("userRegistrationForm:commercialpromo:1").click();
		
		//Locate the id of IRCTC SBI card option and click
		driver.findElementById("userRegistrationForm:irctcsbicard:1").click();
				
	}

}
