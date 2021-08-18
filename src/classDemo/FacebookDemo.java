package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.crome", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("xyzuebdj");
	    //driver.findElement(By.xpath("//a[contails(text(),'Forgotten password?')]"));

		
	}

}
