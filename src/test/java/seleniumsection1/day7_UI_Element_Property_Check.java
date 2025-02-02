package seleniumsection1;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_UI_Element_Property_Check {
	
	public static void main(String[] args) {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

		 // Open the LetCode website
        driver.get("https://letcode.in/");
        driver.manage().window().maximize(); // Maximize window

        // Navigate to the buttons page
        driver.get("https://letcode.in/buttons");

        // -------- 1. Get the position of the button --------
        WebElement btn1 = driver.findElement(By.id("position"));
        Point location = btn1.getLocation();
        System.out.println("Button Position: X = " + location.getX() + ", Y = " + location.getY());

        // -------- 2. Get the background color of the button --------
        WebElement btn2 = driver.findElement(By.id("color"));
        String color = btn2.getCssValue("background-color");
        System.out.println("Button Background Color: " + color);

        // -------- 3. Check if a button is enabled or disabled --------
        boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
        System.out.println("Is button enabled? " + enabled);

        // Close the browser
       // driver.quit();
    }
}
