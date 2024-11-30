package gcreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();

 driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
 
 driver.findElement(By.linkText("Create account")).click();
 
 String url1=driver.getCurrentUrl();
 
 if(url1.contains("Icici bank")){
 System.out.println("1st verification point: "+"It is internal link=passed");
  }
 else
 {
	 System.out.println("1st verification point: "+"It is External link=Failed");
 }
 driver.navigate().back();
 
 driver.findElement(By.className("external text")).click();
 
 Thread.sleep(4000);
 
 String url2=driver.getCurrentUrl();
 
 if(url2.contains("seleniumhq.org")){
	 System.out.println("2nd verification point: "+"It is external link=Passed");
 }
 else
 {
	 System.out.println("2nd verification point: "+"It is internal link=Failed");
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
