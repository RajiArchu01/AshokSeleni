package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://www.google.com/");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.id("APjFqb"));
		txtprint.sendKeys("greens velmurugan");

		WebElement txtpassword = driver.findElement(By.xpath("//input[@class='gNO89b'][2]"));
    	txtpassword.click();
	
		WebElement txtlink = driver.findElement(By.xpath("//button[text()='No thanks']"));
		txtlink.click();
		
		
	}


}
