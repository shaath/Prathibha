package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("hyd");
		Thread.sleep(5000);
		
//		List<WebElement> cities = driver.findElement(By.id("homeV2-root")).findElements(By.tagName("li"));
		List<WebElement> cities = driver.findElements(By.xpath("//div[@id='homeV2-root']//li"));
		
		System.out.println(cities.size());
		
		for(int i = 0; i < cities.size(); i++){
			String cName = cities.get(i).findElement(By.tagName("text")).getText();
			System.out.println(cName);
			
			if(cName.equals("Miyapur")){
				cities.get(i).click();
				break;
			}
		}
		
	}

}
