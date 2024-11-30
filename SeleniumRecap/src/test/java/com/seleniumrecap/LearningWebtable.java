package com.seleniumrecap;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWebtable {


	private static WebDriver driver;

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRecap\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2021/08/");

		driver.manage().window().maximize();

		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));

		List<WebElement> Columns=table.findElements(By.xpath("//table[@id='customers']//th"));

		int totalColumns = Columns.size();

		System.out.println("Total columns are : " + totalColumns);

		//Assert.assertEquals(totalColumns, 5, "Values are not matched");

		boolean status=false;

		for (WebElement ele : Columns) {

			String values = ele.getText();

			System.out.println(values);


			if (values.contains("country")) {

				status=true;
				break;

			}


		}

		//Assert.assertTrue(status);


		List<WebElement> rows = table.findElements(By.xpath("//table[@id='customers']//tr"));

		int totalRows = rows.size();

		System.out.println("Total rows are : " + totalRows);



		for (WebElement rowsValues : rows) {

			String value = rowsValues.getText();

			System.out.println(value);
		}

		WebElement element=driver.findElement(By.xpath("//td[contains(text(),'Jenkins')]//preceding-sibling::td//input"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.click();

		driver.findElement(By.xpath("//td[contains(text(),'Java')]//following-sibling::td[3]//a")).click();

		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();








































	}

}
