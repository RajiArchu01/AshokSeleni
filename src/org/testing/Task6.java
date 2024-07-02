package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
//URL : https://www.swiggy.com/
//NOTE: Enter the location.
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement txtid = driver.findElement(By.id("location"));
       	txtid.sendKeys("bdhjdsbhvdb");
    
}

}
