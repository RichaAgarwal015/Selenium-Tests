package BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");

		ChromeDriver chrome = new ChromeDriver();

		chrome.get("https://google.com/");

		chrome.close();

	}

}
