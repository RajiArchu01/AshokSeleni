package com.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		
		driver.get("http://demo.automationtesting.in/Register.html");	
		//driver.manage().window().maximize();
		
		WebElement txtlogin = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtlogin.sendKeys("raaja");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtpassword.sendKeys("lakshmi");
		
        Thread.sleep(3000);		
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		txtaddress.sendKeys("chennai");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
		txtmail.sendKeys("archuma01@");
		
		WebElement txtphone = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']"));
		txtphone.sendKeys("9080362066");
		
		
//		WebElement txtlogin2 = driver.findElement(By.xpath(""));
//		txtlogin2.click();
//	
	}
}
