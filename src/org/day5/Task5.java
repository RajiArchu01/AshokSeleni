package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement mouse= driver.findElement(By.xpath("//a[text()='Sports & More']"));
		WebElement mouse2= driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		mouse2.click();
		Actions acc = new Actions(driver);
		acc.moveToElement(mouse).perform();
		//acc.moveToElement(mouse2).perform();
	}

}
