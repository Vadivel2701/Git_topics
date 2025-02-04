package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;


public class Day5_SeleniumWaits {
	
	public static void main(String[] args) {
		
	
	
    // Setup ChromeDriver
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    //  Implicit Wait (applies globally)
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Open Facebook login page
    driver.get("https://www.facebook.com/login/");

    // 2️⃣ Explicit Wait for email field
    WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement emailField = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
    emailField.sendKeys("your_email@example.com");

    // Enter password
    WebElement passwordField = driver.findElement(By.id("pass"));
    passwordField.sendKeys("your_password");

    // 3️⃣ Fluent Wait for login button
    FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(15))  // Maximum wait time
            .pollingEvery(Duration.ofSeconds(2)) // Check every 2 seconds
            .ignoring(NoSuchElementException.class);

    
    WebElement login = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));


    // Click login button
    login.click();

    // Print Page Title (to verify login attempt)
    System.out.println("Page Title: " + driver.getTitle());

    // Close browser
    driver.quit();

}
	
}
