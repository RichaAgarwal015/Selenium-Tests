package com.OrangeHRM1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMApp1 {
	
	WebDriver driver;
	
	@Test

	public void OrangeHRMkLogin_Test() throws InterruptedException, IOException
	{
		
		String applicationUrlAddress ="https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);	
		
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.className("oxd-button")).click();
		

}
}