package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import ultlity.ExtentRe;

public class Testcase1 extends BaseTest{
	
	@Test
	public void test1() {
		
	  
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Google");
		System.out.println(Title);
		
	}
	
	
	@Test
	public void test2() {
		ExtentRe.test.createNode("Validation 1");
		Assert.assertTrue(true);
		System.out.println("sucesss");
		//driver.findElement(By.className("gLFyf")).sendKeys("Reanna");
		ExtentRe.test.createNode("Validation 2");
		Assert.assertTrue(true);
		System.out.println("final");
	}
	

	
}