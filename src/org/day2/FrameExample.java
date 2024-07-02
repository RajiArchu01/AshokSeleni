package org.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	 
		// driver.switchTo().frame(0);
		//driver.switchTo().frame("");
//		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
//		int size = ele.size();
//		System.out.println(size);
//		
       //driver.switchTo().frame(0);
		driver.switchTo().frame("login_page");
		
//		driver.switchTo.defaultContent 
		WebElement userid = driver.findElement(By.id("fldLoginUserId"));
		//WebElement userid = driver.findElement(By.name("fldLoginUserId"));
	    userid.sendKeys("bhuvana123");
	
	

}
}
