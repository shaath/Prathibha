package day1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\PrathibhaRecordings\\Jars\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
	}
	
}
