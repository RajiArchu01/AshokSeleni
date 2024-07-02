package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLighted {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.helloselenium.com/2013/10/what-is-workflow-of-selenium-webdriver.html");

	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,5000)");
    WebElement location = driver.findElement(By.id("ContactForm1_contact-form-email"));
	j.executeScript("arguments[0].setAttribute('value','raji')",location );
	
//	WebElement location = driver.findElement(By.xpath("//h1[@class='post-title']"));
//	j.executeScript("arguments[0].setAttribute('style','background:red;border:solid 2px green')",location);
	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	WebElement location2 = driver.findElement(By.id("ContactForm1_contact-form-name"));
//	js.executeScript("arguments[0].scrollIntoView()",location2);
//	
//	WebElement course = driver.findElement(By.id("heading8818"));
//	js.executeScript("arguments[0].scrollIntoview(),course");
//	Thread.sleep(2000);

}
}

