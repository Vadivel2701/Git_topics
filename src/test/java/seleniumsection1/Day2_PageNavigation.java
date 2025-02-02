package seleniumsection1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2_PageNavigation {
	
	public static void main(String[] args) {
		
		        // Set up WebDriver
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        // Open Google 
		        // Waits for the page to fully load before continuing execution.
		        driver.get("https://www.google.com");
		        System.out.println("Opened Google");

		        // Navigate to YouTube
		        //Does not wait for the page to fully load before executing the next command.
		        driver.navigate().to("https://www.youtube.com");
		        System.out.println("Opened YouTube");

		        // Go back to Google
		        driver.navigate().back();
		        System.out.println("Navigated Back");

		        // Go forward to YouTube
		        driver.navigate().forward();
		        System.out.println("Navigated Forward");

		        // Refresh the page
		        driver.navigate().refresh();
		        System.out.println("Page Refreshed");

		        // Close the browser
		        driver.quit();
		    
		}



}
	

