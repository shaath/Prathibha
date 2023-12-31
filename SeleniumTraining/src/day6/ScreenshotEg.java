package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\PrathibhaRecordings\\Workspace\\SeleniumTraining\\src\\screenshots\\google.png"));

		File src = driver.findElement(By.linkText("Images")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\PrathibhaRecordings\\Workspace\\SeleniumTraining\\src\\screenshots\\images.png"));
	}

}
