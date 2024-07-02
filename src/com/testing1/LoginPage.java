package com.testing1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		String prtwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(prtwin);
		System.out.println(allwin);
		
		for(String win:allwin) {
			String title = driver.switchTo().window(win).getTitle();
			if(title.contains("facebook")) {
				Thread.sleep(3000);
				driver.findElement(By.id(":rj:")).sendKeys("rajibnec");
				driver.findElement(By.id(":rl:")).sendKeys("9003595686");
			}
		}
		driver.switchTo().window(prtwin);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
}
