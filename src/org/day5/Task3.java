package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://www.flipkart.com");	
		//driver.manage().window().maximize();
		
		
		WebElement close= driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		WebElement mouse2= driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
		WebElement blanket = driver.findElement(By.xpath(""));
         blanket.click();
		Actions acc = new Actions(driver);
		//acc.moveToElement(mouse).perform();
		acc.moveToElement(mouse2).perform();


}
}