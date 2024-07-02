package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws AWTException {
	//Right Click Framework Test Papers  and Select Inspect
	
    WebDriver driver= new ChromeDriver();
      driver.get("http://greenstech.in/selenium-course-content.html");
      
      WebElement nclick = driver.findElement(By.id("heading201"));
      nclick.click();
      
      WebElement rightclick = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
      
	      Actions ac = new Actions(driver);
	       ac.contextClick(rightclick).perform();
	       rightclick.click();
	       
	       Robot rb = new Robot();
    	   rb.keyPress(KeyEvent.VK_DOWN);
    	   rb.keyPress(KeyEvent.VK_ENTER);
    	   rb.keyRelease(KeyEvent.VK_ENTER);
    	   rb.keyRelease(KeyEvent.VK_DOWN);
    	
	    
	
	}
}
