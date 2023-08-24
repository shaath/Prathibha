package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(gmail).perform();
//		Thread.sleep(5000);
//		act.contextClick().perform();
		
//		act.moveToElement(gmail).contextClick().build().perform();
		
//		act.contextClick(gmail).perform();
		
		act.click(driver.findElement(By.linkText("Images"))).perform();

	}

}
