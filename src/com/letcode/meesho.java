package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class meesho {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.meesho.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Jewellery & Accessories']"));
		findElement.click();
	
		/*WebElement findElement2 = driver.findElement(By.xpath("(//p[text()='Watches'])[3]']"));
		findElement2.click();
	*/

		
	}

}
