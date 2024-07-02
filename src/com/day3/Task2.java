package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		driver.get("https://www.facebook.com");	
		//driver.manage().window().maximize();
		
		WebElement txtlogin = driver.findElement(By.id("email"));
		txtlogin.sendKeys("rajibnec@com");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("rajibnec123");
		
		WebElement txtlogin2 = driver.findElement(By.xpath("//button[@name='login']"));
		txtlogin2.click();
	
}
}
