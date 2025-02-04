package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_Actions {
	
	public static void main(String[] args) throws InterruptedException {
	
	 // Setup ChromeDriver
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://artoftesting.com/samplesiteforselenium");
    driver.manage().window().maximize();

    
  
    Actions actions = new Actions(driver);
   
    // Find an element
    WebElement button = driver.findElement(By.id("dblClkBtn"));
    
    // Perform different actions
    actions.click(button).perform();  // Click
   // actions.contextClick(button).perform();  // Right Click
   actions.doubleClick(button).perform();  // Double Click
   // actions.moveToElement(button).perform();  // Hover
   
   
   
   Thread.sleep(5000);

    driver.quit();
    

}
	
}
