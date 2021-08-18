package classDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("WebDriver.driver.crome", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.btes.co.in/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
		
//		verifythat the user on current page 
//		extract this text
//		enter user name in username and hit enter nextsorry ,we dont print 
		
		
		
		
	}

}
