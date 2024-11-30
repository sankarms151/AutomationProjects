package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium 2.0\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);


		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();

		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);


		driver.switchTo().defaultContent();

		driver.switchTo().frame(1); 

		driver.switchTo().frame("frame2");

		WebElement secondButton=driver.findElement(By.id("Click1"));
		secondButton.click();

		List<WebElement>list=driver.findElements(By.tagName("iframe"));

		int size=list.size();

		System.out.println("Total number of Frame : " +size);             



	}

}
