package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetCodeInput {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/");
		WebElement workspacebtn = driver.findElement(By.id("testing"));
		workspacebtn.click();

		WebElement inputedit = driver.findElement(By.xpath("//a[text()='Edit']"));
		inputedit.click();

		driver.manage().window().maximize();

		WebElement fullname = driver.findElement(By.id("fullName"));
		fullname.sendKeys("Raajalakshmi");


		WebElement appendtext = driver.findElement(By.id("join"));
		appendtext.sendKeys("candidate ", Keys.TAB);

		String insidebox = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(insidebox);


		WebElement cleartext = driver.findElement(By.id("clearMe"));
		cleartext.clear();
		

		boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enabled);

		String confirmtext = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(confirmtext);

        driver.quit();
























	}
}
