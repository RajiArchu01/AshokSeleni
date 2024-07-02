package com.letcode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetcodeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\karthickrajan\\eclipse-workspace\\SeleniumTasks\\screenshotproof.png");
		FileUtils.copyFile(screenshot, f);

		File homebtn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\karthickrajan\\eclipse-workspace\\SeleniumTasks\\homebutton2.png");
		FileUtils.copyFile(homebtn, f2);
		driver.quit();

	}

}
