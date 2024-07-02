package org.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\karthickrajan\\eclipse-workspace\\Testing1\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			
//			 simple alert
//			WebElement simple = driver.findElement(By.id("alertButton"));
//			simple.click();
//			Thread.sleep(2000);
//			
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
			
//           confirm alert
			
//			WebElement confirm = driver.findElement(By.id("alertButton"));
//			confirm.click();
//			Alert alert = driver.switchTo().alert();
//     		alert.accept();
     		
//          prompt alert
			
     		WebElement prompt = driver.findElement(By.id("promtButton"));
     		prompt.click();
     		
			Alert alert = driver.switchTo().alert();
			
			String text = alert.getText();
			System.out.println(text);
			
     		alert.sendKeys("alert example");
     		alert.accept();
				
}
}
