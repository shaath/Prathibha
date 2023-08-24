package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XmlReadingEg {

	WebDriver driver;
	
	@Parameters({"br", "url"})
	@Test
	public void tt(String br, String url){
		
		if(br.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (br.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "D:\\PrathibhaRecordings\\Jars\\chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
	}
}
