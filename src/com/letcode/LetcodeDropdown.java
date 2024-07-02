package com.letcode;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LetcodeDropdown {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fruits = driver.findElement(By.id("fruits"));		
		Select Myfruits = new Select(fruits);
		Myfruits.selectByIndex(1);
		Myfruits.selectByVisibleText("Banana");
		System.out.println(Myfruits.isMultiple());

		WebElement heros = driver.findElement(By.id("superheros"));
		Select mtheros = new Select(heros);
		boolean multiple = mtheros.isMultiple();
		System.out.println("is multiple? = " + multiple);
		mtheros.selectByVisibleText("Ant-Man");
		mtheros.selectByVisibleText("Captain America");
		mtheros.selectByVisibleText("The Avengers");
		mtheros.selectByVisibleText("Batwoman");
		mtheros.deselectByVisibleText("Captain America");
		//		mtheros.selectByIndex(2);
		//		mtheros.selectByIndex(4);
		List<WebElement> options = mtheros.getOptions();
		options.forEach(i-> System.out.println(i.getText()));

		WebElement javascript = driver.findElement(By.id("lang"));
		Select lang = new Select(javascript);
		lang.selectByIndex(2);

		WebElement country = driver.findElement(By.id("country"));		
		Select mycountry = new Select(country);
		mycountry.selectByValue("Peru");
		mycountry.selectByValue("Colombia");
		WebElement selectedcountry = mycountry.getFirstSelectedOption();
		System.out.println(selectedcountry.getText());

		driver.quit();




	}

}
