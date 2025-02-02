package seleniumsection1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_Dropdown {
	
	
	public static void main(String[] args) {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    // Sample dropdown page
        driver.get("https://the-internet.herokuapp.com/dropdown"); 
        driver.manage().window().maximize();

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        // Create Select object
        Select dropdown = new Select(dropdownElement);

        // 1️⃣ Check if the dropdown allows multiple selection
        boolean isMultiple = dropdown.isMultiple();
        System.out.println("Is Multi-Select: " + isMultiple);

        // 2️⃣ Select options using different methods
        dropdown.selectByIndex(1); // Selects second option (index starts from 0)
        dropdown.selectByValue("2"); // Selects option with value="2"
        dropdown.selectByVisibleText("Option 1"); // Selects option with text "Option 1"

        // 3️⃣ Fetch the first selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());
        
        // Deselect Options
        dropdown.deselectByIndex(2);
        dropdown.deselectByValue("1");
        dropdown.deselectAll(); 
        
        
        driver.quit();
	}
}

