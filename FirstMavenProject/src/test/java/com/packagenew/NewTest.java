package com.packagenew;

import org.testng.annotations.Test;

import com.sun.tools.javac.util.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		//Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
		Assert.check(true, (title.contains("Demo Guru99 Page")));
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();

}
}
