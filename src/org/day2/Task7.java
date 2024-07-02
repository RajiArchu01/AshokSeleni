package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task7 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/signup/");
	
//	WebElement single = driver.findElement(By.id("day"));
//	WebElement single1 = driver.findElement(By.id("month"));
//	WebElement single2 = driver.findElement(By.id("year"));
	
	
//	Select s = new Select(single);
//	s.selectByIndex(4);
	
//	Select s1 = new Select(single1);
//    s1.selectByVisibleText("Aug");
//    
//	Select s2 = new Select(single2);
//	s2.selectByVisibleText("1994");
	

}
}