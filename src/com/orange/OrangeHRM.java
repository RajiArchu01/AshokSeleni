package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		Thread.sleep(5000);
	   
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(" Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(" admin123");
	
	
	
	
	}
	
}
