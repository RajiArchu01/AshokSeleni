package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://adactinhotelapp.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.id("username"));
		txtprint.sendKeys("raji");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("123569");
	}
}
