package AutoITimg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITLogin {
	
	WebDriver driver;
	String applicationUrlAddress="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeTest
	public void setUp()
	{

	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");

	driver= new ChromeDriver();
	driver.get(applicationUrlAddress);
}

	@Test
	public void LogInTest() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
	
	}
	
	@Test
	
	public void PimTest() throws InterruptedException
	
	{
	
		
		WebElement pim= driver.findElement(By.tagName("a"));
		Actions action = new Actions(driver);
		action.moveToElement(pim).build().perform();
		
		Thread.sleep(10000);

	}
	
	
	
	
}
