package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		driver.get("http://greenstech.in/selenium-course-content.html");	
		//driver.manage().window().maximize();
		
		WebElement txtlogin= driver.findElement(By.xpath("//div[@class='col-lg-7']"));

		String text = txtlogin.getText();
		System.out.println(text);
		
	}
}
