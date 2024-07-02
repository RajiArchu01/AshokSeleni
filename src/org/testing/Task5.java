package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		
		WebElement txtid = driver.findElement(By.name("fldLoginUserId"));
       	txtid.sendKeys("bdhjdsbhvdb");
       	
       	
       	
	//URL : https://netbanking.hdfcbank.com/ 

//NOTE: Enter customer id .


	}

}
