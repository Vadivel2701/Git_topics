package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics1 {
	
	 WebDriver driver;
	
		@Test
		public void launchfb() {
			
			System.out.println("print");
			
			 // Setup ChromeDriver
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();

	        // Open Facebook login page
	        driver.get("https://www.facebook.com/");

	        // Enter email and password
	        driver.findElement(By.id("email")).sendKeys("your-email@example.com");
	        driver.findElement(By.id("pass")).sendKeys("your-password");

	        // Click login button
	        driver.findElement(By.name("login")).click();
	        
	       //quit browser
	        driver.quit();
	        
		}

}
