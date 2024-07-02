package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://greenstech.in/selenium-course-content.html");	
		//driver.manage().window().maximize();
		WebElement txtresume = driver.findElement(By.id("heading201"));
		txtresume.click();		
		WebElement txtsign = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		txtsign.click();
//		WebElement txtopen = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
//		txtopen.click();
		

	}
}
