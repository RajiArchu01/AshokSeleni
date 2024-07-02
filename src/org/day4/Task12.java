package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.shopclues.com/wholesale.html");	
		//driver.manage().window().maximize();
		
		WebElement txtprint = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		txtprint.sendKeys("mobiles");
		
    	WebElement txtsearch = driver.findElement(By.xpath("//a[text()='Search']"));
		txtsearch.click();
		
		WebElement txtlink = driver.findElement(By.xpath("//img[@id='det_img_153088200']"));
		txtlink.click();
		
		

}
}
