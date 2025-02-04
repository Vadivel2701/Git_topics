package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics2 {

	@Test
	public void one()
	{
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	    // Open first tab (Facebook)
        driver.get("https://www.facebook.com/");

        // Open another tab (Google)
        driver.get("https://www.google.com/");

        // Close only the current tab (Google)
        driver.close();  
		

        // Quit will close all browser windows and end the WebDriver session
        driver.quit();  
	}
	
	
	
	
}
