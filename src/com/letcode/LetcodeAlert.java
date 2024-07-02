package com.letcode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetcodeAlert {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//simple alert
		WebElement simple = driver.findElement(By.id("accept"));
		simple.click();
		Alert getsimple = driver.switchTo().alert();
		String text = getsimple.getText();
	    System.out.println("simple alert text"+ text);
	    getsimple.accept();
	    
	    //confirm alert
	    WebElement confirm = driver.findElement(By.id("confirm"));
	    confirm.click();
	    Alert getconfirm = driver.switchTo().alert();
	    String conftext = getsimple.getText();
	    System.out.println("confirm text" + conftext );
	    getconfirm.accept();
	    
	    //prompt alert
	    WebElement prompt = driver.findElement(By.id("prompt"));
	    prompt.click();
	    Alert getprompt= driver.switchTo().alert();
	    getprompt.sendKeys("raajalakshmi karthickrajan");
	    getprompt.accept();
	    String prompttext = driver.findElement(By.id("myName")).getText();
	    System.out.println(prompttext);
	    
		driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
