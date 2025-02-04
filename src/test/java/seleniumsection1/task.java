package seleniumsection1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
	
	public static void main(String[] args) {
		
		// Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");

List<WebElement>li=driver.findElements(By.xpath("//input[@type='checkbox']"));

for (WebElement one : li) {
	
String text=one.getText();

if(text.equalsIgnoreCase("Cricket")) {
	one.click();
}
	
}
		







//
//openjdk version "17.0.13" 2024-10-15
//OpenJDK Runtime Environment (build 17.0.13+11-Ubuntu-2ubuntu120.04)
//OpenJDK 64-Bit Server VM (build 17.0.13+11-Ubuntu-2ubuntu120.04, mixed mode, sharing)

		
		
	}

}
