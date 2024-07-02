package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9 {

	
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();

	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Library\\geckodriver.exe");
	
	driver.get("https://www.facebook.com/login/");	

		String s = driver.getTitle();
		System.out.println(s);
		 
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		



}

}
