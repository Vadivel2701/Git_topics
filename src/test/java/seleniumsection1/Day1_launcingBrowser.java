package seleniumsection1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_launcingBrowser {

	public static void main(String[] args) {
		// Set up EdgeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Initialize the Edge browser driver
		WebDriver driver = new ChromeDriver();

		// Launch a URL
		driver.get("https://www.google.com");

		// Maximize the window
		driver.manage().window().maximize();

		// Print the title of the webpage
		System.out.println("Page Title: " + driver.getTitle());

		// Close the browser
		driver.quit();

	}

}
