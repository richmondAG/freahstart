package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



import io.github.bonigarcia.wdm.WebDriverManager;
import ultlity.ExtentRe;


public class BaseTest {

	
	
	public static WebDriver driver = null;
	public static Properties prop = new Properties();
	

	@BeforeSuite
	public void XeSetup() {
		ExtentRe.setExtent();

	}
	
	@AfterSuite
	public void flus() {
		ExtentRe.endReport();
	}
	
	
	
	
//      @BeforeMethod
//	public void basetest() throws IOException {
//    	  
//    	  FileInputStream fil= new FileInputStream(System.getProperty("user.dir")+"/Configuration/conf.properties");
//    	   prop.load(fil);
//		
//			
//			  if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
//		  			
//		  			
//		  			WebDriverManager.chromedriver().setup();
//		  			driver= new ChromeDriver();
//		  			
//		  		}
//		  		
//		  		else if(prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
//		  			WebDriverManager.firefoxdriver().setup();
//		  			driver= new FirefoxDriver();
//		  			
//		  		}
//		  		
//		  		else if(prop.getProperty("browser").equalsIgnoreCase("IE")) {
//		  			
//		  			WebDriverManager.iedriver().setup();
//		  			driver= new InternetExplorerDriver();
//		  		}
//			  
//				driver.manage().window().maximize();
//			 // driver.get(System.getProperty("url"));
//			
//				driver.get("https://www.google.com/");
//
//				driver.manage().window().maximize();
//				
//			
//	
//    		
//		
//    	
//		
//	}
	@BeforeMethod
	public void setu() {
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void teardown() throws IOException {
		
		driver.quit();
		
		
	}
	
	public static String getCurrentTime() {
		
		 String currentDate= new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		 return currentDate;
	}
	
	
	
	
	

}
