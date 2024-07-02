package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtlogin = driver.findElement(By.xpath("//a[text()='Login']"));
		txtlogin.click();
		
		Thread.sleep(3000);
		WebElement txtsearch = driver.findElement(By.xpath("//input[@type='text'][2]"));
		txtsearch.sendKeys("archuma01@");
	}

}
