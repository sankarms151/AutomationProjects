package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WeekWindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the driver
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allwindowlist = driver.getWindowHandles();
		List<String> orderedlist = new ArrayList<String>();
		
		
		orderedlist.addAll(allwindowlist);
		
		String childwindow = orderedlist.get(1);
		
		driver.switchTo().window(childwindow);
		
	    
		
		
		
		
		
		
		
		
		

	}

}
