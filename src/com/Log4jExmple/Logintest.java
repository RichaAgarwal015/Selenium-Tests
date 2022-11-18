package com.Log4jExmple;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Logintest {

	Logger log = Logger.getLogger(Logintest.class);

	WebDriver driver;

	String applicationUrlAddress = "https://register.rediff.com/register/register.php?FormName=user_details";

	@Test
	public void setup()

	{
		PropertyConfigurator.configure("C:\\Users\\Rajesh\\Desktop\\Testing\\Test\\src\\com\\Log4jExmple\\Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);

		log.info("Chrome Browser Opened Successfully");
		
		log.error("Error");
		
		log.debug("Debug");
	}

	@AfterTest
	public void RediffClose() {
		driver.close();

		log.info("Application Closed Successfully");

	}
}
