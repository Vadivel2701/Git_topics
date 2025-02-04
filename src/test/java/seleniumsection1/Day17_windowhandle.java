package seleniumsection1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day17_windowhandle {

	public static void main(String[] args) {
		// Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open the first website
		driver.get("https://www.example.com");

		// Store the main window handle
		String mainWindowHandle = driver.getWindowHandle();

		// Open a new window and switch to it
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Open a different URL in the new window
		driver.get("https://www.selenium.dev");

		// Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Iterate through all window handles
		for (String handle : allWindowHandles) {
			// Switch to each window
			driver.switchTo().window(handle);

			// Get the current window's title
			String title = driver.getTitle();
			System.out.println("Current window title: " + title);

			// Perform actions based on window titles (optional)
			if (title.contains("Selenium")) {
				System.out.println("window handle completed");
			}
		}

		// Switch back to the main window
		driver.switchTo().window(mainWindowHandle);

		// You can now interact with the main window again
		System.out.println("Switched back to main window");

		// Close all windows
		driver.quit();
	}







}




