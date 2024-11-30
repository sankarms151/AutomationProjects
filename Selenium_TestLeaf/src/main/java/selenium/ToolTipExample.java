package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/tooltip.html");

		driver.manage().window().maximize();

		WebElement name= driver.findElement(By.id("age"));

		String toolTiptext=name.getAttribute("title");

		System.out.println(toolTiptext);

	}

}
