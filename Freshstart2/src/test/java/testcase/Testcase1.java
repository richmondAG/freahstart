package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest{
	
	@Test
	public void test1() {
	
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Google");	
		
	}
	
	
	@Test
	public void test2() {
		
		System.out.println("sucesss");
		//driver.findElement(By.className("gLFyf")).sendKeys("Reanna");
	}
	

	
}