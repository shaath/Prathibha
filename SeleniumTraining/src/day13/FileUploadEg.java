package day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		WebElement ele = driver.findElement(By.id("photofile"));
		
		ele.sendKeys("C:\\Users\\SharatChandra\\Desktop\\3.png");
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].click();", ele);
////		driver.findElement(By.id("photofile")).click();
//		Thread.sleep(5000);
//		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUploadEg2.exe");
	}

}
