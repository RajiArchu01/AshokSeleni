package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		txtprint.sendKeys("mobiles");
		
		WebElement txtsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		txtsearch.click();
		driver.quit();
		
//		WebElement txtpassword = driver.findElement(By.xpath("//img[@class='product-image '][1]"));
//		txtpassword.click();
	}


}
