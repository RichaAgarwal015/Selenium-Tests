package com.RediffmailExampleWithDynamicPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmail_Fulltest {
			
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

public void Rediffmail_allfieldsTest()

	{
		//Text Box(Input)-Xpath
	
	//name="nameda78cc52"
	//name="namee2b8ad49"
	 
	//*[starts-with(@name,'name')]
	
			
 WebElement webElement= driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
 webElement.sendKeys("Richa Agarwal");
 
 //name="logine2b8ad49"
 //name="login9527049a"
 
 
 WebElement e= driver.findElement(By.xpath("//*[starts-with(@name,'login')]"));
 e.sendKeys("Richa@gmail.com");
 
 
 //name="passwd9527049a"
 //name="passwd11d9f69b"
 
 WebElement Password= driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]"));
 Password.sendKeys("richa12345");

 WebElement k= driver.findElement(By.xpath("//*[starts-with(@name,'altemail')]"));
k.sendKeys("");
 
 //name="altemail11d9f69b"
 //name="altemailaefbae4e"
 
//name="DOB_Dayaefbae4e"
//name="DOB_Day6106e053"
  
WebElement r= driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
r.sendKeys("12");

//name="DOB_Month6106e053"

WebElement p= driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]"));
p.sendKeys("jan");

//name="c49d1a73afe5cfe7480a597c8ddd2ea26106e053"
//name="ed21c2d44cb284c205aa572fa2940e2368cae7bf"

WebElement q= driver.findElement(By.className("captcha"));
q.sendKeys("HNQ4");

	}}


