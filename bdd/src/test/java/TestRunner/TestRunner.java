package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Workspace\\bdd\\src\\main\\resources\\Features\\", //the path of the feature files
		glue={"Stepdefinations"}, //the path of the step definition files
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}, //to generate different types of reporting
		monochrome = true, 
		strict = true,
		dryRun = false,
	    tags ="@cucumber"			
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	

	
	

}
