package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day16_slider {
	
	
	public static void main(String[] args) {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		
		// Open the slider page
        driver.get("https://jqueryui.com/slider/");  // Example site

        // Switch to frame if the slider is inside an iframe
        driver.switchTo().frame(0);

        // Locate the slider element
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

        // Create an Actions class instance
        Actions move = new Actions(driver);

        // Drag the slider to the right by 50 pixels
        move.dragAndDropBy(slider, 50, 0).perform();
        


        // Close the browser
        driver.quit();
		
		
	}

}
