package seleniumsection1;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class chromeoptions {
	
	//ChromeOptions is a class in Selenium that allows you to customize Chrome browser settings, 
	//such as handling pop-ups, 
	//disabling notifications, running in headless mode, setting custom user agents, and more.
	
	public static void main(String[] args) {
		
	
     // Set up WebDriver
	 WebDriverManager.chromedriver().setup();
     
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--headless"); // Run in headless mode
     options.addArguments("--start-maximized"); // Maximize window
     options.addArguments("--disable-notifications"); // Block notifications
     options.addArguments("--disable-gpu"); // Disable GPU acceleration
     options.addArguments("--ignore-certificate-errors"); // Ignore SSL errors
     
 

     WebDriver driver = new ChromeDriver(options);
     driver.get("https://www.google.com");

     System.out.println("Page Title: " + driver.getTitle());
     driver.quit();
 }

}

