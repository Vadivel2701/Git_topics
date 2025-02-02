package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Loginscreen {
	
	public static void main(String[] args) {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

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
