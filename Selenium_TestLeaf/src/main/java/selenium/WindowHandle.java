package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		String parentWindow=driver.getWindowHandle();

		WebElement firstButton=driver.findElement(By.id("home"));

		firstButton.click();

		Set<String> handles=driver.getWindowHandles();

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);	
		}

		WebElement editButton=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));

		editButton.click();

		Thread.sleep(3000);

		driver.close();

		driver.switchTo().window(parentWindow);

		WebElement secondButton=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		secondButton.click();
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Windows:" +numberOfWindows);

		Set<String>allWindows=driver.getWindowHandles();

		for (String childWindows : allWindows) {

			if(!childWindows.equals(parentWindow)){
				driver.switchTo().window(childWindows);
				Thread.sleep(3000);
				driver.close();
			}

		}

	}

}
