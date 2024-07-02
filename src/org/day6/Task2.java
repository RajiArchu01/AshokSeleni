package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws AWTException {
	    WebDriver driver= new ChromeDriver();
	      driver.get("https://www.google.co.in/webhp");
	      
	      WebElement search= driver.findElement(By.id("APjFqb"));
	      search.sendKeys("velmurugan");
	      
//	      WebElement search= driver.findElement(By.xpath("//a[text()='Login']"));
	     // search.click();
	      
//	      WebElement notq = driver.findElement(By.xpath("//button[text()='No thanks']"));
//           notq.click();    
           
           Actions ac = new Actions(driver);
           ac.doubleClick(search).perform();
           
           
           Robot rb = new Robot();
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_A);
          
           rb.keyRelease(KeyEvent.VK_A);
           rb.keyRelease(KeyEvent.VK_CONTROL);
           
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_X);
          
           rb.keyRelease(KeyEvent.VK_X);
           rb.keyRelease(KeyEvent.VK_CONTROL);
	}      
	
}
