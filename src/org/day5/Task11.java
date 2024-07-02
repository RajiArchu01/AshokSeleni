package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		WebElement mouse= driver.findElement(By.xpath("//a[text()='All Departments']")); //first option
		WebElement mouse2= driver.findElement(By.xpath("//a[text()='Heating, Cooling & Air Quality']")); //2nd
		WebElement mouse3= driver.findElement(By.xpath("//a[text()='Air Conditioners'][1]")); //3rd
		WebElement mouse4= driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")); //4th
		mouse4.click();
		
		Actions acc = new Actions(driver);
		
		acc.moveToElement(mouse).perform();
		acc.moveToElement(mouse2).perform();
	    acc.moveToElement(mouse3).perform();
	    //use this task11,12
}

}
