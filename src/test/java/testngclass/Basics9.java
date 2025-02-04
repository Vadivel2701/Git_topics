package testngclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics9 {
	
	WebDriver driver;
	

	@Test(timeOut = 5000)
	public void register() {
		
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
