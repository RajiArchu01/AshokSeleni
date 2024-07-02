package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.snapdeal.com/");	
		//driver.manage().window().maximize();
		WebElement txtlogin = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"));
		txtlogin.click();
		
		Thread.sleep(3000);
		WebElement txtuser = driver.findElement(By.id("userName"));
		txtuser.sendKeys("raajalakshmi");
		WebElement txtnext = driver.findElement(By.id("checkUser"));
		txtnext.click();	
	}
}
