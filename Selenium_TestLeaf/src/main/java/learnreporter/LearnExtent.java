package learnreporter;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtent {
	@Test
	public void learnExtent(){
		
		ExtentReports report= new ExtentReports("./reports/result.html",false);
		report.loadConfig(new File("./extent_config.xml"));
		ExtentTest test=report.startTest("TC001_Createlead","Create a new Lead");
		test.assignCategory("Smoke");
		test.assignAuthor("Vasanth");
		
		test.log(LogStatus.PASS, "DemoSalesManager is entered successfully"+test.addScreenCapture("./../snaps/IMG_20171207_225256.jpg"));
		test.log(LogStatus.PASS, "crmsfa is entered successfully"+test.addScreenCapture("./../snaps/IMG_20171226_164224.jpg"));
		report.endTest(test);
		report.flush();
		
				
		
	}
	
	
	

}
