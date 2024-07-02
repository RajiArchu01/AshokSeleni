package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.cleartrip.com/trains");	

		driver.manage().window().maximize();

		WebElement txtfrom = driver.findElement(By.id("from_station"));
		txtfrom.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("madurai");
				
		WebElement txtsign = driver.findElement(By.xpath("//button[text()='Search trains']"));
		txtsign.click();
	}
}
