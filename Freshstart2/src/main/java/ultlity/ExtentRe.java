package ultlity;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basePackage.BaseTest;



public class ExtentRe {
	

	public static ExtentHtmlReporter htmlRepoter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	
	public static void setExtent() {
		
		
		htmlRepoter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReport/"+"MyReport_"+BaseTest.getCurrentTime() +".html");
		
		htmlRepoter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		//htmlRepoter.config().setDocumentTitle("Automation Test Report");
		//htmlRepoter.config().setReportName("OrangeHRM Test Automation Report");
		//htmlRepoter.config().setTheme(Theme.STANDARD);
		
		
	    extent = new ExtentReports();
	    extent.attachReporter(htmlRepoter);
	    
	    extent.setSystemInfo("HostName", "MyHost");
	    extent.setSystemInfo("ProjectName", "OrangeHRM");
	    extent.setSystemInfo("Tester", "Rich");
	    extent.setSystemInfo("Browser", "Chrome");
	
		
		
	}
	
    
	public static void endReport() {
		extent.flush();
		
		
		
	}
	
}
