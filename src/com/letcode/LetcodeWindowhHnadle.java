package com.letcode;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetcodeWindowhHnadle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		String tab1 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String tab2 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com/");
		String tab3 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		String tab4 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ajio.com/");
		String tab5 = driver.getWindowHandle();

	//	window handle in parentwin
		//	driver.switchTo().window(tab2);

	//window handle in default content
	driver.switchTo().defaultContent();

		Set<String> allwindowhandles = driver.getWindowHandles();
		int count = 0;
		for(String newwin : allwindowhandles) {
			if(count==4) {
			driver.switchTo().window(newwin);
			}
			count=count+1;		
		}
			int size = driver.getWindowHandles().size();
			System.out.println("no of win :"  + size);		
}
}
