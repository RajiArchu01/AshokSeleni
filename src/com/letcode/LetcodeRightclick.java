package com.letcode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LetcodeRightclick {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions builder = new Actions(driver);
		builder.contextClick(rc).perform(); //Right click

		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();
		driver.quit();
		
		
		
		
		
			
		
		
	}

}
