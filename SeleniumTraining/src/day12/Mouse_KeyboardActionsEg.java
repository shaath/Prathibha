package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_KeyboardActionsEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		act.click(email).sendKeys("Test").build().perform();
		Thread.sleep(5000);
		act.doubleClick().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		act.click(driver.findElement(By.id("pass"))).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();

	}

}
