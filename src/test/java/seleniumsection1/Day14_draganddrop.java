package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day14_draganddrop {

		
public static void main(String[] args) {
	
	  // Setup ChromeDriver
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Open jQuery UI Droppable page
    driver.get("https://jqueryui.com/droppable/");
    
    // Switch to the frame that contains the draggable and droppable elements
    driver.switchTo().frame(0);

    // Locate source (draggable) and target (droppable) elements
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement target = driver.findElement(By.id("droppable"));

    // Perform drag and drop
    Actions actions = new Actions(driver);
    actions.dragAndDrop(source, target).perform();

    System.out.println("Drag and Drop action performed successfully!");

    // Close the browser
    driver.quit();
	
}
		    
		
		
	
	
	
	
}
