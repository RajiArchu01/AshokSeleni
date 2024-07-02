package org.day6;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task9 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		  WebDriver driver= new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      
	      WebElement login = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	      login.click(); 
	      
	      Thread.sleep(3000);
	      Actions ac = new Actions(driver);
          ac.doubleClick(login).perform();
        
	      driver.findElement(By.id("ap_email")).sendKeys("rajibnec@gmail.com");
          
//        WebElement signin2 = driver.findElement(By.id("continue"));
//        signin2.click();
//          
}
}
