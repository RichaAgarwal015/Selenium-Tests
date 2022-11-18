package com.RediffmailExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmail_test {
		
WebDriver driver;
		
String applicationUrlAddress ="https://register.rediff.com/register/register.php?FormName=user_details";
	
		
@BeforeTest

public void setup()

{
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	
	driver = new ChromeDriver();
    driver.get(applicationUrlAddress);	
	
}

@Test

public void Rediffmail_FullNameTest()

{
	//Text Box(Input)-Xpath
	///html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
	
	WebElement webElement= driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
	webElement.sendKeys("Richa Agarwal");

	
}

@AfterTest

public void tearDown() throws InterruptedException

{	
	Thread.sleep(10000);
	driver.quit();
}
}


