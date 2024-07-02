package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8 {
	public static void main(String[] args) throws AWTException {
		 WebDriver driver= new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	      login.click(); 
	      WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	      user.sendKeys("rajibnec@");
	     
	      Robot rb= new Robot();
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_A);
	     
	      rb.keyRelease(KeyEvent.VK_A);
	      rb.keyRelease(KeyEvent.VK_CONTROL);
	      
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_X);
	     
	      rb.keyRelease(KeyEvent.VK_X);
	      rb.keyRelease(KeyEvent.VK_CONTROL);
	      
//	      WebElement user1 = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//	      rb.keyPress(KeyEvent.VK_CONTROL);
//	      rb.keyPress(KeyEvent.VK_V);
//	     
//	      rb.keyRelease(KeyEvent.VK_V);
//	      rb.keyRelease(KeyEvent.VK_CONTROL);    
	}
	      
	   
	      
	}

