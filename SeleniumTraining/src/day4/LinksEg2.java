package day4;

import java.rmi.Remote;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.target.model.RemoteLocation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Home")).click();

//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		List<WebElement> links = driver.findElements(By.xpath("(//table[contains(@id,'Table_')])[2]//a"));
//		System.out.println(links.size());
//		
//		for(int i = 0; i < links.size();i++){
//			String lName = links.get(i).getText();
////			String lName = links.get(i).getAttribute("href");
//			System.out.println(lName);
//			
//			if(lName.equals("Home")){
//				links.get(i).click();
//				break;
//			}
//		}
		
//		driver.findElement(RelativeLocator.with(By.linkText("Home")).above(By.linkText("Personal Banking"))).click();
//		driver.findElement(RelativeLocator.with(By.linkText("About Us")).toRightOf(By.linkText("Home"))).click();
		driver.findElement(RelativeLocator.with(By.linkText("About Us")).toLeftOf(By.linkText("Contact"))).click();
		
	}

}
