package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenshotHomePage {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		
		File bingScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(bingScreenshot, new File("./Screenshot/bingHomepage.png"));
		
		driver.quit();
		

}
}
