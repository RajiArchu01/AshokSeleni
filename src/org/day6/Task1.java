package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws AWTException {
    WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      
      WebElement email= driver.findElement(By.id("email"));
      email.sendKeys("rajibnec");
      
      Robot rb= new Robot();
      rb.keyPress(KeyEvent.VK_CONTROL);
      rb.keyPress(KeyEvent.VK_A);
     
      rb.keyRelease(KeyEvent.VK_A);
      rb.keyRelease(KeyEvent.VK_CONTROL);
      
      rb.keyPress(KeyEvent.VK_CONTROL);
      rb.keyPress(KeyEvent.VK_X);
     
      rb.keyRelease(KeyEvent.VK_X);
      rb.keyRelease(KeyEvent.VK_CONTROL);
      
      WebElement pass= driver.findElement(By.xpath("//div[@id='passContainer']"));
      pass.click();
      
      rb.keyPress(KeyEvent.VK_CONTROL);
      rb.keyPress(KeyEvent.VK_V);
     
      rb.keyRelease(KeyEvent.VK_V);
      rb.keyRelease(KeyEvent.VK_CONTROL);    
}
}