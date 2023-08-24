package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.bing.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links count in gmail page is "+links.size());
		
		for(int i = 0; i < links.size(); i++){
			String lName = links.get(i).getText();
			System.out.println(lName);
			if (lName.equals("News")) {
				System.out.println("Expected link available");
				break;
			}
		}

	}

}
