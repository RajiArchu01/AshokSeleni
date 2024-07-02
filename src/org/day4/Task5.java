package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
		driver.get("http://www.greenstechnologys.com/");	
		//driver.manage().window().maximize();
		WebElement txtprint = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'][1]"));
		String text = txtprint.getText();
		System.out.println(text);

	}


}
