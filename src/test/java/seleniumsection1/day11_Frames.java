package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day11_Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		 // Setup ChromeDriver
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.automationtesting.in/Frames.html"); // Frame test site
        driver.manage().window().maximize();

        // 1️⃣ Switch to frame using WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));

        // 2️⃣ Find text box inside the frame and enter text
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Hello, Frame!");

        // 3️⃣ Switch back to the main page
        driver.switchTo().defaultContent();

        // Print confirmation
        System.out.println("Frame interaction successful!");
        
        
        
        Thread.sleep(10000);

        // Close browser
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
		
	    driver.get("https://demo.automationtesting.in/Frames.html"); // Frame test site
        driver.manage().window().maximize();

        
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement IN_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(IN_Frame);
		Thread.sleep(6000);
		WebElement in_most = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(in_most);
		WebElement frame_text2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame_text2.sendKeys("selenium");
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
        
		driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}