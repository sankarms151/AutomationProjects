package com.seleniumrecap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class WebTableExample {

	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Set the path to chromedriver.exe based on your system
		//System.setProperty("webdriver.chrome.driver", "path_to_chromedriver\\chromedriver.exe");

		// Initialize ChromeDriver
		driver = new ChromeDriver();

		// Open the URL
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//header[@id='masthead']"));
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB).perform();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		actions.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scrolling down the page by pixel
        js.executeScript("window.scrollBy(0, 500)");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Country to search for
		String countryName = "Benin"; // Replace with the country you want to search

		WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));

		// Find all rows in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

		boolean found = false;

		// Iterate through each row
		for (WebElement row : rows) {
			// Find the cell containing country name (assuming it's the first column)
			WebElement countryCell = row.findElement(By.xpath(".//td[2]"));
			String actualCountryName = countryCell.getText().trim();

			// Check if the current row matches the country name we are looking for
			if (actualCountryName.equalsIgnoreCase(countryName)) {
				// Find the primary language cell (assuming it's the second column)
				WebElement languageCell = row.findElement(By.xpath(".//td[5]"));
				String primaryLanguage = languageCell.getText().trim();

				// Check if primary language is English
				if (primaryLanguage.equalsIgnoreCase("English")) {
					// Find and click the checkbox (assuming it's in the third column)
					WebElement checkbox = row.findElement(By.xpath(".//td[1]/input[@type='checkbox']"));
					checkbox.click();
					
					Thread.sleep(5000);

					System.out.println("Clicked checkbox for " + countryName);
					found = true;
					break;
				}
			}
		}

		// If country not found
		if (!found) {
			System.out.println("Country '" + countryName + "' not found or primary language is not English.");
		}

		// Close the browser
		driver.quit();
	}
}
