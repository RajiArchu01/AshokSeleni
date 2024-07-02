package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://toolsqa.com/selenium-training?q=headers#enroll-form");	
		driver.manage().window().maximize();
		
		WebElement txtname = driver.findElement(By.xpath("//input[@placeholder=' ']"));
       	txtname.sendKeys("raji");
       	
	}


}
