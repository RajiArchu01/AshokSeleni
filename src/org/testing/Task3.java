package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String s = driver.getTitle();
		System.out.println(s);
		 
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		WebElement txtsearch = driver.findElement(By.id("APjFqb"));
       	txtsearch.sendKeys("GreensTechnology");
       	


      
	  //  WebElement txtto = driver.findElement(By.className("sc-ifAKCX gLwVlD"));
	    //txtto.sendKeys("chennai");
	    
	}
}
//URL : https://www.google.com/

//NOTE: Enter GreensTechnology. 
 