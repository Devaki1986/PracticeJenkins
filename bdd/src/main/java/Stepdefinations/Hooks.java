package Stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import Stepdefinations.HelpersClass;

public class Hooks {
	public static WebDriver driver;
	
	 @Before
	    public static void setUp() {
	 
	       HelpersClass.setUpDriver();
	    }
	
	 @After
	    public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        
	         //   final byte[] screenshot = ((TakesScreenshot) HelpersClass.getDriver()).getScreenshotAs(OutputType.BYTES);
	         //   scenario.attach(screenshot, "image/png", scenario.getName()); 
	          
	     
	            HelpersClass.tearDown();
	 }
	
	/*@BeforeStep
	public void Beforestep(Scenario scenario)
	{

		System.out.println("it will run before setp Hooks");
		
	}
	
	@AfterStep
	public void Afterstep()
	{
		System.out.println("it will run After setp Hooks");
	}*/


}
