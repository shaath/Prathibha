package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 0; i < rows.size(); i++){
//			String rText = rows.get(i).getText();
//			System.out.println(rText);
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String id = cols.get(1).getText();
			System.out.println(id);
			
			if(id.equals("2484")){
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

	}

}
