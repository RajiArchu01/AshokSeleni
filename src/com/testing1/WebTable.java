package com.testing1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		List<WebElement>allrows = driver.findElements(By.id("customers"));
//		for(WebElement ele: allrows) {
//		String text = ele.getText();
//		System.out.println(text);
		
		List<WebElement> allrows = driver.findElements(By.xpath("(//table[@id='customers']//tr)[3]"));
		for(WebElement srow: allrows) {
			String text = srow.getText();
			System.out.println(text);
}
}
}