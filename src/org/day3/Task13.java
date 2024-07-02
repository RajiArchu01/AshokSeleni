package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.swiggy.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtlogin = driver.findElement(By.xpath("//a[text()='Sign up']"));
		txtlogin.click();
		
		WebElement txtuser = driver.findElement(By.id("mobile"));
		txtuser.sendKeys("9080362066");
		
		WebElement txtname = driver.findElement(By.id("name"));
		txtname.sendKeys("raajalakshmi");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("raji@bnec");
		
		WebElement txtregister = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		txtregister.click();	
	}
}
