package com.testing1;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskScreenShot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		  WebDriver driver= new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.id("email")).sendKeys("raji@bnec");
	      driver.findElement(By.id("pass")).sendKeys("raji1234");
	      driver.findElement(By.name("login")).click();
	      
	      TakesScreenshot ts=(TakesScreenshot) driver;
	      File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	      File f = new File("C:\\Users\\karthickrajan\\OneDrive\\Desktop\\Archuma screenshot\\open.png");
	      FileUtils.copyFile(screenshotAs, f);
	}
}
