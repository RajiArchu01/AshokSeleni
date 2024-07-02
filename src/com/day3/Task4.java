package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");	
		//driver.manage().window().maximize();
		
		
		WebElement txtlogin2 = driver.findElement(By.xpath("//a[text()='Go To Registration ']"));
		txtlogin2.click();
	
		Thread.sleep(3000);
		WebElement txtlogin = driver.findElement(By.xpath("//input[@id='first-name']"));
		txtlogin.sendKeys("raji");
		
		WebElement txtpassword = driver.findElement(By.id("last-name"));
		txtpassword.sendKeys("balasubramanian");
		
		WebElement txtmail = driver.findElement(By.id("email"));
		txtmail.sendKeys("rajibnec@gmail.com");

		WebElement txtphone = driver.findElement(By.id("mobile"));
		txtphone.sendKeys("9080362066");

		WebElement txtcity = driver.findElement(By.id("city"));
		txtcity.sendKeys("chennai");  
		
		WebElement txtmsg = driver.findElement(By.id("message"));
		txtmsg.sendKeys("message");

		
		
		
		
		
		
	}
}
