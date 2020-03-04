package New;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTests {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe"); 
			driver = new ChromeDriver(); 
			driver.get("http://demo.guru99.com/test/guru99home/");
		    
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
