package com.OrangeHRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookApplication_Test {
	
	WebDriver driver;
	
//@Test
//
//public void Facebook_Test()
//{
//
//	String applicationUrlAddress ="https://www.Facebook.com/";
//	
//	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
//	
//	driver = new ChromeDriver();
//
//	driver.get(applicationUrlAddress);	
//	
//}

@Test

public void FacebookLogin_Test() throws InterruptedException
{
	
	String applicationUrlAddress ="https://www.facebook.com/";
	
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);	
	
	driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("Test");
	
	
	
	driver.findElement(By.className("_42ft")).click();
	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.id("approvals_code")).sendKeys("277303");
//	driver.findElement(By.id("checkpointSubmitButton")).click();
//	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.id("checkpointSubmitButton")).click();
	
	
	
	 	
}






}
