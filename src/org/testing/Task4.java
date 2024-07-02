package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	//URL : https://infinity.icicibank.com/corp/Login.jsp

//NOTE: Enter username and password. 
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		 
	WebElement txtuserid = driver.findElement(By.id("DUMMY1"));
    txtuserid.sendKeys("Archana");
       	
       	

      
	 
	    
	}
}


