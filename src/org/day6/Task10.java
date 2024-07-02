package org.day6;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		  WebDriver driver= new ChromeDriver();
	      driver.get("https://www.snapdeal.com/offers/quirky");
	      
	      WebElement login = driver.findElement(By.xpath("//div[text()='Fashion']"));
	      login.click(); 
	      
	      Thread.sleep(3000);
	      Actions ac = new Actions(driver);
        ac.doubleClick(login).perform();
	      WebElement signin = driver.findElement(By.xpath("email"));
        signin.sendKeys("rajibnec@gmail.com");
}
}