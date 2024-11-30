package week8.day1;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

    
    public static void main(String[] args) throws IOException {
        
//   1. Set the path for the report
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
        //reporter.setAppendExisting(true);// to maintain report history
//   2. Start the report 
        ExtentReports extent = new ExtentReports();
//   3. Attach the report path file into the report.
        extent.attachReporter(reporter);
//   4. Start testcase for report
        ExtentTest test1 = extent.createTest("TC_001_Login");
//   5. Assign the information like author, category
        test1.assignAuthor("Gokul");
        test1.assignCategory("Regression");
//   6. Log the test step status with or without snap 
        test1.pass("The username entered successfully");
        test1.pass("The password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/IMG1.jpg").build());
        
        
        ExtentTest test2 = extent.createTest("TC_002_Logout");
        test2.assignAuthor("Gokul");
        test2.assignCategory("smoke");
        test2.fail("unable to enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/IMG1.jpg").build());
        test2.pass("login button clicked successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/IMG2.jpg").build());
        
        ExtentTest test3 = extent.createTest("TC_003_Logout");
        test3.assignAuthor("Gokul");
        test3.assignCategory("smoke");
        test3.fail("unable to enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/IMG1.jpg").build());
        test3.pass("login button clicked successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/IMG2.jpg").build());
        
//   7. close the report
        extent.flush();
        System.out.println("Completed");
        
    }
    
    
}