package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JustTry {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Sign up']"));
		findElement.click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rajibnec@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Archuma01@");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		loginbtn.click();

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement home = driver.findElement(By.xpath("//path[@fill='currentColor']"));
		home.click();
		
//		WebElement element = driver.findElement(By.xpath("//a[text()='Grooming']"));
//		element.click();
//		
//		Actions acc = new Actions(driver);
//		acc.moveToElement(element).perform();
//		
//		WebElement mouseoption = driver.findElement(By.xpath("//a[text()=' Test Practice ']"));
//		mouseoption.click();
//		
//		JavascriptExecutor je = (JavascriptExecutor)driver;
//		je.executeScript("Window.scrollBy(0,500)");		
//
//		WebElement newcourse = driver.findElement(By.xpath("//a[text()='New Course!']"));
//		newcourse.click();
		
		
		
	}

}
