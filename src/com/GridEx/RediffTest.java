package com.GridEx;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RediffTest {
	@Parameters("Browser")
	@Test
	public void LogIntest(String browserName) throws MalformedURLException {

//		DesiredCapabilities cap = null;
////
//		browserName.equals("Chrome");
//
//		cap = DesiredCapabilities.chrome();
//		cap.setBrowserName("Chrome");
//		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions cap = new ChromeOptions(); 
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.172:4444/wd/hub"), cap);

		String applicationUrlAddress = "https://register.rediff.com/register/register.php?FormName=user_details";

		driver.get(applicationUrlAddress);

	}

}
