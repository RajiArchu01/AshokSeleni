package com.letcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LetcodeDragDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		System.out.println("success");
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		Actions build = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		build.dragAndDropBy(ele,x+90,y+80).perform();

		System.out.println(" this is also sucess");
		driver.quit();
		


	













	}

}
