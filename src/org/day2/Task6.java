package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.redbus.in/");	
		driver.manage().window().maximize();
		WebElement txtfrom = driver.findElement(By.xpath("//input[@placeholder='']"));
       	txtfrom.sendKeys("chennai");
       	
       	WebElement txtto = driver.findElement(By.id("dest"));
       	txtto.sendKeys("madurai");
       	
	}



}
