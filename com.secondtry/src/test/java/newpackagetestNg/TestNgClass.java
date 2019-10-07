package newpackagetestNg;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;
		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class TestNgClass {		
	    private WebDriver driver;		
						
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@Test
		public void Justprint() {
			
			
			System.out.println("second test");
		}
		
		
		@Test
		public void AgainPrint() {
			
			
			System.out.println("Third test");
		}
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	