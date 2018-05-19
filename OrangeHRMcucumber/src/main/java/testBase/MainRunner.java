package testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = ".\\src\\test\\resources\\smokeTestFF",glue={"smokeTestStepDef"})
		

public class MainRunner extends AbstractTestNGCucumberTests{

	
}
