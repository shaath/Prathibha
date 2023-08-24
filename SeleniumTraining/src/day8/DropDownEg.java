package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement cn = driver.findElement(By.name("country"));
		
		Select s = new Select(cn);
		
//		s.selectByIndex(6);
//		s.selectByValue("INDIA");
//		s.selectByVisibleText("JAPAN");
		
		List<WebElement> items = s.getOptions();
		System.out.println(items.size());
		
		for(int i = 0; i < items.size(); i++){
			s.selectByIndex(i);
			String cName = items.get(i).getText();
			System.out.println(cName);
		}
		
		
		
	}

}
