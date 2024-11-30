package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExamples {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/autoComplete.html");

		driver.manage().window().maximize();

		WebElement text=driver.findElement(By.id("tags"));
		text.sendKeys("s");
		Thread.sleep(4000);

		List<WebElement> optionlist=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

		for (WebElement webElement : optionlist) {

			if (webElement.getText().equals("Web Services")) {

				webElement.click();
				System.out.println("Selected");

			}else {
				System.out.println("not selected");
			}

		}


























	}

}
