package com.letcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetcodeFrame {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();

		WebElement Myframe = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(Myframe);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("fname")).sendKeys("raaja");
		driver.findElement(By.name("lname")).sendKeys("lakshmi");

		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("rajinec@gmail.com");
		driver.close();

	}
}

