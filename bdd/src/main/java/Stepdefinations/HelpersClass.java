package Stepdefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class HelpersClass {
     
    private static HelpersClass helperClass;
     
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
     
     private HelpersClass() {
          
    	 System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
            driver.manage().window().maximize();
 
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
     
    public static WebDriver getDriver() {
        return driver;          
    }
     
    public static void setUpDriver() {
         
        if (helperClass==null) {        
            helperClass = new HelpersClass();
        }
    }
     
     public static void tearDown() {
          
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
          
         helperClass = null;
 
     }  
}
