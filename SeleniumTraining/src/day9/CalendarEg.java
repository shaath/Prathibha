package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarEg {

	public static void main(String[] args) throws InterruptedException {
		
		String d = "02/September/2023";
		String[] s = d.split("/");
		String exp_m_y = s[1]+" "+s[2];
		String exp_d = " "+s[0]+" ";
		System.out.println(exp_m_y+"------"+exp_d);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");

		Thread.sleep(10000);
		driver.findElement(By.className("closeit")).click();
		Thread.sleep(5000);
		WebElement pop = driver.findElement(By.xpath("//div[text()='My trips']"));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", pop);
		
		driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]//*[local-name()='g']/..")).click();
		Thread.sleep(5000);
		String act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		
		while(!exp_m_y.equalsIgnoreCase(act_m_y)){
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		}
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='DayPicker-Day' or contains(@class, 'leftEdge') or contains(@class, 'rightEdge')]"));
		
		for(int i = 0; i < list.size();i++){
			String act_d = list.get(i).getAttribute("aria-label");
			System.out.println(act_d);
			
			if(act_d != null && act_d.contains(exp_d)){
				list.get(i).click();
				break;
			}
		}
	}

}
