package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/Features/Login.feature"},
				 glue = {"week7.day1","hooks"},
				 publish = true,
				 monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
