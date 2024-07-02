package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.amazon.in/");	

		//driver.manage().window().maximize();
		Thread.sleep(3000);		
		WebElement txtlogin = driver.findElement(By.xpath("//img[@data-a-hires='https://m.media-amazon.com/images/I/51VDUZUNMsL._AC_SY400_.jpg']"));
		txtlogin.click();

		//		WebElement txtuser = driver.findElement(By.id(""));
		//		txtuser.sendKeys("BenQ");
	}

}
