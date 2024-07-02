package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement mouse= driver.findElement(By.xpath("//div[text()='Courses ']")); //course
		WebElement mouse2= driver.findElement(By.xpath("//div[@class='tonclickopen main-cat menu-item'][3]")); //oracle
		mouse2.click();
		
	//	WebElement mouse3= driver.findElement(By.xpath("//a[text()='Selenium Certification Training']")); //Selenium Certification Training
		
		Actions acc = new Actions(driver);
		
		acc.moveToElement(mouse).perform();
		//acc.moveToElement(mouse2).perform();
	    //acc.moveToElement(mouse3).perform();
		
		//use this page for task 8,9,10
}
}
