package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("ertyudk@gmail.com");
	
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("hghsga");
	}
}

	//	driver.quit();

//URL : https://www.facebook.com/ 

//NOTE: Enter Email or Phone and Password.
