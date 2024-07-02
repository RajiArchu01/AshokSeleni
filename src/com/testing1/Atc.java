package com.testing1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Atc {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
//	driver.findElement(By.id("APjFqb")).sendKeys("KARTHI");

	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("phone",Keys.ENTER);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//div[text()='POCO C50 (Country Green, 32 GB)']")).click();
	//parent window
	String win = driver.getWindowHandle();
	System.out.println(win);
	
	//all window
	Set<String> allwin = driver.getWindowHandles();
       System.out.println(allwin);
       int i=0;
       for(String x:allwin) {
    	   System.out.println(i++ +" " +x);
    	   System.out.println(!(win.equals(x)));
    	   if(!(win.equals(x))){
    		   driver.switchTo().window(x);
    	   }
    	  driver.findElement(By.xpath("//button[text()='Add to cart']"));
       }
}

}


