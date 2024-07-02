package org.bunnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bunnings {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.bunnings.com.au/ryobi-18v-one-2-0ah-4-0ah-4-piece-combo-kit_p0344371");
	WebElement findElement = driver.findElement(By.xpath("//span[@class='mark']"));
	findElement.click();
	WebElement checkbox = driver.findElement(By.xpath("//input[@class='mark']"));
	checkbox.click();
	WebElement search = driver.findElement(By.id("custom-css-outlined-input"));
	search.sendKeys("Marquee 7 Piece Steel Sling Back Outdoor Setting");
	search.click();
	
	
	
	
}
}
