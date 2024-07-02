package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.snapdeal.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.xpath("//input[@name='keyword'][1]"));
		txtprint.sendKeys("mobiles");
		
	    WebElement txtsearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	    txtsearch.click();
	
 		WebElement txtpassword = driver.findElement(By.xpath("//img[@class='product-image '][1]"));
    	txtpassword.click();
	}


}
