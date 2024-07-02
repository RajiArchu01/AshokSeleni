package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	//URL : https://www.instagram.com/accounts/login/?hl=en) login page 

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		WebElement txtid = driver.findElement(By.className("_aa4b _add6 _ac4d"));
       	txtid.sendKeys("insta id");
    
}

}



