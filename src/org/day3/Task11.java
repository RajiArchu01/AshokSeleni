package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");	

		//driver.manage().window().maximize();
	
		WebElement txtlogin = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtlogin.sendKeys("raaja");
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtuser.sendKeys("lakshmi");
		
		Thread.sleep(3000);
		WebElement txtnext = driver.findElement(By.className("VfPpkd-RLmnJb"));
		txtnext.click();
		
		

	}
}
