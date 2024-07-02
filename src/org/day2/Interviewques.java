package org.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewques {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		for(int i=5;i>=cb.size()-2;i--) {
//		WebElement box = cb.get(i);
//		box.click();
//	}
//		
//		Thread.sleep(2000);
//		for(int i=cb.size()-6;i<=cb.size()-5;i++) {
//			WebElement box = cb.get(i);
//			box.click();
//		}
     	for(int i=0;i<cb.size();i++)
		if(i!=2&&i!=3) {
			WebElement we = cb.get(i);
			we.click();
			}
}
}