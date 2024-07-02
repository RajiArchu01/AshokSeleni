package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://demo.automationtesting.in/Register.html");	
		driver.manage().window().maximize();
		WebElement txtname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       	txtname.sendKeys("raji");
       	WebElement txtname2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
       	txtname2.sendKeys("poorni");
       	
	}

}
