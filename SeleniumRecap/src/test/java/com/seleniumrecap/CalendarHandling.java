package com.seleniumrecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class CalendarHandling {

	private static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumRecap\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/search?q=Calendar");

		driver.manage().window().maximize();

		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		String month = "April";
		String year = "2023";

		String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();

		while (!(aMonth.equals(month) && (aYear.equals(year)))) {

			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		WebElement SelectedDate = driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='14']"));

		SelectedDate.click();

		Thread.sleep(5000);


		driver.close();



	}

}
