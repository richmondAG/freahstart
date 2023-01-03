package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void basetest() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		System.out.println("Quit success");
		
	}
	
	
	
	
	

}
