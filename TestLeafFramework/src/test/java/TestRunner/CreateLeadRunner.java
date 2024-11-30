package TestRunner;

import commonMethods.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/Features"},
				 glue = {"stepDef"},// step definition location
				 publish = true,
				 monochrome = true,
				 tags="@createLead"
				 )
public class CreateLeadRunner extends ProjectSpecificMethod{
	
	

}

