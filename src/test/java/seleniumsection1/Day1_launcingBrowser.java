package seleniumsection1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_launcingBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		
		
		// Set up EdgeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
	

		// Initialize the chrome browser driver
		WebDriver driver = new ChromeDriver();
		
		//url:https://qavalidation.com/demo-form/
		
		
		 driver.manage().window().maximize();

		// Launch a URL
		driver.get("https://letcode.in/forms");
		
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id=\"firame\"]"));
		
		firstname.sendKeys("rajesh");
		
		System.out.println("firstname entered ");
		
		
		Thread.sleep(5000);
		
		WebElement button= driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		
		button.click();
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
	

		
		
		
		

	}

}
