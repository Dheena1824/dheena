package org.test.day1;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends BaseClass {

	public static void main(String[] args)  {
		
		browserLaunch("chrome");
		
		Maximize();
		
		dynamicWait(30);
		
		getUrl("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("dheena");
				
		getAttribute(username, "value");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1624");
				
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
