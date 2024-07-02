package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		driver.get("http://greenstech.in/selenium-course-content.html");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][2] "));
		
		String text = txtprint.getText();
		System.out.println(text);
		
	}
}
