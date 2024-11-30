package commonMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class ProjectSpecificClass {
	
	public ChromeDriver driver;
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void openBrowserAndLogin(String url, String uname, String pwd) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		
	}

}
