package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_POM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		OrgHRMHomePage ohp = PageFactory.initElements(driver, OrgHRMHomePage.class);
		
		driver.get(ohp.url);
		ohp.orgLogin();
		
		Thread.sleep(5000);

		MenuItemsAdminhomePage mi = PageFactory.initElements(driver, MenuItemsAdminhomePage.class);
		
		mi.welcomeclick();
		mi.logoutclick();
		
		driver.close();
	}

}
