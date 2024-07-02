package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		WebElement txtid = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
       	txtid.sendKeys("rajibnec@gmail.com");
       	
       	String attribute = txtid.getAttribute("id");
       	System.out.println(attribute);
       	
       	WebElement txtid2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
       	txtid2.sendKeys("15512");   	
	}
}

