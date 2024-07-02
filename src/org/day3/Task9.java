package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/");	

		//driver.manage().window().maximize();

		WebElement txtlogin = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtlogin.click();
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtuser.sendKeys("rajibnec@gmail.com");
				
	//	WebElement txtsign = driver.findElement(By.xpath("//button[text()='Search trains']"));
	//	txtsign.click();
	}
}


