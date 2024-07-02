package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	//URL :https://www.snapdeal.com/login
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		
		WebElement txtid = driver.findElement(By.id("userName"));
       	txtid.sendKeys("purchase");
    
}

}




