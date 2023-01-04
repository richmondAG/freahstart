package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	WebDriver driver= null;
	Properties prop = new Properties();
	
	
      @BeforeMethod
	public void basetest() throws IOException {
    	  
    		try {
    	  
    	  FileInputStream fil = new FileInputStream("C:\\Users\\richm\\git\\Fresh\\Freshstart2\\Configuration\\config.properties");
  	      	prop.load(fil);
    	  String browsername= prop.getProperty("browser");
		
			
			  if(browsername.equals("Chrome")) {
		  			
		  			
		  			WebDriverManager.chromedriver().setup();
		  			driver= new ChromeDriver();
		  			
		  		}
		  		
		  		else if(browsername.equalsIgnoreCase("Firefox")) {
		  			WebDriverManager.firefoxdriver().setup();
		  			driver= new FirefoxDriver();
		  			
		  		}
		  		
		  		else if(browsername.equalsIgnoreCase("IE")) {
		  			
		  			WebDriverManager.iedriver().setup();
		  			driver= new InternetExplorerDriver();
		  		}
			
				driver.get("https://www.google.com/");

				driver.manage().window().maximize();
				
			
	
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
		
    	
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		System.out.println("Quit success");
		
	}
	
	
	
	
	

}
