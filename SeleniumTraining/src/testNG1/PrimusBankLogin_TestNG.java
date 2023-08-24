package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankLogin_TestNG {
	FirefoxDriver driver;
	@BeforeClass
	public void LaunchBr(){
		System.setProperty("webdriver.gecko.driver", "D:\\PrathibhaRecordings\\Jars/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void launchApp(){
		driver.get("http://primusbank.qedgetech.com");
		
	}
	
	@Test
	public void login(){
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void logout(){
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
