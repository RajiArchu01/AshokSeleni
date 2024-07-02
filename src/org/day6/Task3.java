package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) throws AWTException {
	    WebDriver driver= new ChromeDriver();
	      driver.get("http://greenstech.in/selenium-course-content.html");
	      WebElement notq = driver.findElement(By.id("heading20"));
           notq.click(); 
           
           for(int i=0;i<6;i++);
           {
        	   WebElement rightclick = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
        	   Actions ac = new Actions(driver);
        	   ac.contextClick(rightclick).perform();
        	   
        	   Robot rb = new Robot();
        	   rb.keyPress(KeyEvent.VK_DOWN);
        	   rb.keyPress(KeyEvent.VK_ENTER);
        	   rb.keyRelease(KeyEvent.VK_ENTER);
        	   rb.keyRelease(KeyEvent.VK_DOWN);
        	   
           }
	}
	}
