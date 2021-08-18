package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyClass {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.safari.driver", "safariDriver.safariextz");
//		WebDriver driver = new SafariDriver(); 
		
		
		System.setProperty("webdriver.crome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); // invoke the browser

		
		driver.get("http://demo.guru99.com/test/newtours/"); // open URL in the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");//Enter username
		
//		WebElement username = driver.findElement(By.name("userName"));
//		username.sendKeys("mercury");
		
		
		driver.findElement(By.name("password")).sendKeys("mercury");//Enter Password
		
		driver.findElement(By.name("submit")).click(); // click on login
		
		String exptitle ="Login: Mercury Tours";
		String acttitle = driver.getTitle();
		
		//verification and validation
		
		if (exptitle.equals(acttitle)== true) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
		
//		System.out.println(driver.getTitle());
		driver.close();

	}

}
