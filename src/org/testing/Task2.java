package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtfrom = driver.findElement(By.id("src"));
       	txtfrom.sendKeys("madurai");
	
	    WebElement txtto = driver.findElement(By.id("dest"));
	    txtto.sendKeys("chennai");
	    
	}
}


//URL : https://www.redbus.in/ 
//
//NOTE: Enter from and to textbox.
