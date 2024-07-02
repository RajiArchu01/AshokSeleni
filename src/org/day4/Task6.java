package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.facebook.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.id("email"));
		txtprint.sendKeys("raji@bnec");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("123569");
	}
}
