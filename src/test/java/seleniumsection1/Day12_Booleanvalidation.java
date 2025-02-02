package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day12_Booleanvalidation {
	
	public static void main(String[] args) {
		
		// Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/radio");
		// Find if the checkbox is selected?
		WebElement selectanyone = driver.findElement(By.id("yes"));
		boolean selected = selectanyone.isSelected();
		System.out.println(selected);
		
		WebElement selectanyone_displayed = driver.findElement(By.id("yes"));
		System.out.println(selectanyone_displayed.isDisplayed());
		
		WebElement selectanyone_enabled = driver.findElement(By.id("yes"));
		System.out.println(selectanyone_enabled.isEnabled());
		
		driver.quit();
		
		

		
		
	}

}
