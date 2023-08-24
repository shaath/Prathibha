package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenShotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String prPath = System.getProperty("user.dir");
		System.out.println(prPath);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://bing.com");
		Thread.sleep(10000);
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(prPath + "\\src\\screenshots\\bingFullPage.png"));

	}

}
