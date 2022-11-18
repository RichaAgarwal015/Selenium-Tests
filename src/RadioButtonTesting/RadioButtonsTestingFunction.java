package RadioButtonTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsTestingFunction {

	WebDriver driver;
	
	String applicationUrlAddress ="https://echoecho.com/htmlforms10.htm";
	
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
		WebElement e= driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		
	}
	
}
