package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	//URL : http://adactinhotelapp.com/

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtid = driver.findElement(By.id("username"));
       	txtid.sendKeys("insta id");
}



}
