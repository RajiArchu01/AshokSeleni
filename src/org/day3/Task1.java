package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://www.redbus.in/");	

		driver.manage().window().maximize();

		WebElement txtid = driver.findElement(By.className("name_rb_secondary_item"));
		txtid.click();
		Thread.sleep(5000);
		
		WebElement txtsign = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		txtsign.click();

		// 	WebElement txtmob = driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));

		//Thread.sleep(5000);

	//	WebElement txtmob = driver.findElement(By.id("mobileNoInp"));
		//txtmob.sendKeys("9080362066");

		// 	WebElement txtlogin = driver.findElement(By.xpath("selectedPhCode"));
		//	txtlogin.click();


	}
}
