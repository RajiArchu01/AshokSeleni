package org.neobank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://neo-bank.com/");
		WebElement txtuser = driver.findElement(By.id("email-3"));
		txtuser.sendKeys("rajibnec@gmail.com");
		WebElement join = driver.findElement(By.xpath("//input[@type='submit'][1]"));
		join.click();
		WebElement txtuser2 = driver.findElement(By.xpath("//input[@type='text'][1]"));
		txtuser2.sendKeys("Raji");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit'][1]"));
		submit.click();
	}
} 
