package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement s = driver.findElement(By.id("credit2")); //bank
		WebElement b = driver.findElement(By.id("bank"));  //account space 
		
		WebElement s1 = driver.findElement(By.id("fourth")); //5000 
		WebElement b1 = driver.findElement(By.id("amt7")); //amount space
		
		WebElement s2 = driver.findElement(By.id("credit1")); //sales
		WebElement b2 = driver.findElement(By.id("loan")); //account space
		
		WebElement s3 = driver.findElement(By.id("fourth"));  //5000
		WebElement b3 = driver.findElement(By.id("amt8"));  //amount space
		
		Actions act= new Actions(driver);
		act.dragAndDrop(s,b).perform();
		act.dragAndDrop(s1,b1).perform();
		act.dragAndDrop(s2,b2).perform();
		act.dragAndDrop(s3,b3).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}