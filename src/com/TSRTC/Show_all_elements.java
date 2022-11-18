package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Show_all_elements {
	
	public static void main(String[] args) {
	 
		String applicationUrlAddress= "https://www.tsrtconline.in/oprs-web/";
		
						
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.tsrtconline.in/oprs-web/");
	
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">

	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int links_length = links.size();
	
	System.out.println(" the no of link:" +links_length);
	
	for(int i=0; i<links.size(); i++)
		
	{
		System.out.println(i+ " " +links.get(i).getText());
		
	}
	
	driver.quit();

}
}

