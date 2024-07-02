package org.day2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
			
		    WebDriver driver= new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");
	}
}
