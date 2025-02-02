package seleniumsection1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10_Alerts {
	
	public static void main(String[] args) throws InterruptedException {

		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); // Sample alert page
        driver.manage().window().maximize();

        // 1️⃣ Handling **Simple Alert (OK Button Only)**
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert simpleAlert = driver.switchTo().alert(); // Switch to alert
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        Thread.sleep(2000); // Pause for viewing
        simpleAlert.accept(); // Clicks OK
        System.out.println("Simple Alert Accepted\n");

        // 2️⃣ Handling **Confirmation Alert (OK & Cancel)**
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert confirmAlert = driver.switchTo().alert(); // Switch to alert
        System.out.println("Confirmation Alert Text: " + confirmAlert.getText());
        Thread.sleep(2000); // Pause for viewing
        confirmAlert.dismiss(); // Clicks Cancel
        System.out.println("Confirmation Alert Dismissed\n");

        // 3️⃣ Handling **Prompt Alert (Input Box, OK & Cancel)**
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert promptAlert = driver.switchTo().alert(); // Switch to alert
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        Thread.sleep(2000); // Pause for viewing
        promptAlert.sendKeys("Hello Selenium!"); // Enter text in the prompt
        Thread.sleep(2000); // Pause for viewing
        promptAlert.accept(); // Clicks OK
        System.out.println("Prompt Alert Accepted with Input\n");

        // Close browser
        driver.quit();
    }
}
