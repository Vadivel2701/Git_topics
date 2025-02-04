package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day15_fileupload {
	
	public static void main(String[] args) {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.automationtesting.in/FileUpload.html"); // Frame test site
        driver.manage().window().maximize();
		

        // Locate the file input element
        WebElement uploadElement = driver.findElement(By.id("input-4")); // Replace with actual ID

        // Provide the file path
        uploadElement.sendKeys("///home/sparkout/Downloads/blockchainx 1-tim -ticket.pdf");

     

        // Close the browser
        driver.quit();
		
		
	}

}
