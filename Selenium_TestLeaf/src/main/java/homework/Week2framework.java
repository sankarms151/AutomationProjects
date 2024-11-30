package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week2framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the driver
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().accept();
		String output = driver.findElementById("demo").getText();
		System.out.println(output.contains("abc"));
	}

}
