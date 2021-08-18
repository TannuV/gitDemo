package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//Webdriver is a interface
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);

		if(title.equals("amazon.in")) {
			System.out.println("its correct");
		}
		else {
			System.out.println("its not correct");
		}
		System.out.println( driver.getCurrentUrl());
		System.out.println( driver.getWindowHandles());
		
		
		// FindElement ---> it is used to locate the web element from the web page to oprate some ction on it
		//Locators 
		
		/* 1) ID
		 * 2) className
		 * 3) cssSelector  --> we can use the id and class instead of proper css :-> #{id} / .{className}
		 * 4) Type
		 * 5) xPath  --> Absolute  --->/html[1]/body[1]/div[1]/div[1]/input[1]  and relative  ---> //input[@id='ap_customer_name'](should be used this )
		 * 6) Name
		 * 7) Link Text
		 * 8) PartialLink Text
		 * 9) TagName
		 */
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.cssSelector(".{a-input-text a-span12 auth-autofocus auth-required-field}")).sendKeys("Tannu vats");
		
		driver.findElement(By.id("ap_phone_number")).sendKeys("8700478403");
		driver.findElement(By.id("ap_password")).sendKeys("Tannuvats06");
		driver.findElement(By.id("continue")).click();
		
		driver.quit();
		
	
		
		
	}

}
