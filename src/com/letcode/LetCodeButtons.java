package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetCodeButtons {
	//static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/");
		
		WebElement workspacebtn = driver.findElement(By.id("testing"));
		workspacebtn.click();

		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Click']"));
		btnclick.click();
		
		WebElement gotohome = driver.findElement(By.id("home"));
		gotohome.click();
		
		 driver.navigate().back();
		driver.manage().window().maximize();		
		
		WebElement xycoordinate = driver.findElement(By.id("position"));
		Point location = xycoordinate.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x->" + x + "y->" + y);
		
		
		WebElement btncolour = driver.findElement(By.id("color"));
		String cssValue = btncolour.getCssValue("background-color");
		System.out.println(cssValue);
		
		
		Rectangle tallfat = driver.findElement(By.id("property")).getRect();
		System.out.println(tallfat.getWidth());
		System.out.println(tallfat.getHeight());
		System.out.println(tallfat.getPoint());
		
		Dimension dime = tallfat.getDimension();
		System.out.println(dime);
		System.out.println(dime.getWidth());
		System.out.println(dime.getHeight());
		
		boolean isdisabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isdisabled);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
