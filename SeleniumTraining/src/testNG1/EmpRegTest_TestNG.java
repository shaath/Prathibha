package testNG1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTest_TestNG extends TestNGMaster {

	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String eid){
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
		
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Shiva";
		x[0][1] = "S";
		x[0][2] = "SS53543";
		
		x[1][0] = "Parvathi";
		x[1][1] = "P";
		x[1][2] = "PP63443";
		
		x[2][0] = "Nandi";
		x[2][1] = "N";
		x[2][2] = "NN5485";
		
		x[3][0] = "Vinay";
		x[3][1] = "V";
		x[3][2] = "VV7845";
		
		return x;
	}
}
