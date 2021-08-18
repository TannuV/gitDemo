package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downlod {

	public static void main(String[] args) {

		System.setProperty("WebDriver.driver.crome", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		 driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\newhtml.html");
		 driver.findElement(By.id("terms")).click();
		 driver.findElement(By.id("submitbutton")).click();
		 
	}

}
