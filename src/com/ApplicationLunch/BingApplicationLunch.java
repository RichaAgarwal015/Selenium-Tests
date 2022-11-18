package com.ApplicationLunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingApplicationLunch {
	
	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		
		ChromeDriver chrome= new ChromeDriver();
		
		chrome.get("https://www.bing.com/");
		
		chrome.get("https://www.Facebook.com/");
		 
		chrome.quit();
	}
}