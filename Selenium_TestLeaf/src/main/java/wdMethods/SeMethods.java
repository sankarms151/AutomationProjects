package wdMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {
	public RemoteWebDriver driver=null;
	
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" has been Launched Successfully");

	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele =null;
		switch (locator) {
		case "id":
			ele = driver.findElementById(locValue);			
			break;
		case "name":
			ele = driver.findElementByName(locValue);			
			break;
		case "class":
			ele =driver.findElementByClassName(locValue);
			break;
		case "linkText":
			ele = driver.findElementByLinkText(locValue);
			break;
		case "xpath":
			ele = driver.findElementByXPath(locValue);
			break;
		}
		
		return ele;
	}

	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Value have been entered Successfully "+data);
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("Element is clicked Successfully");
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String value  = ele.getText();
		return value;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select source = new Select(ele);
		source.selectByVisibleText(value);

	}
	
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select source = new Select(ele);
		source.selectByValue(value);

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select source = new Select(ele);
		source.selectByIndex(index);

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		System.out.println("Actual Text-->" + ele.getText());
		System.out.println("Expected Text-->" + expectedText);
		if(ele.getText().equals(expectedText)) {
			System.out.println("Exact Text Verification Successful");
		}else {
			System.out.println("Exact Text Verification Failed");
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText)) {
			System.out.println("Partial Text Verification Successful");
		}else {
			System.out.println("Partial Text Verification Failed");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();

		List<String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(allWindows);

		String childWindow = listOfWindows.get(index);

		driver.switchTo().window(childWindow);


	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		alert.dismiss();;

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void takeSnap() {
		// TODO Auto-generated method stub

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
