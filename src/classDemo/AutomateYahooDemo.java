package classDemo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateYahooDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromeDriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com");
	    String title =  driver.getTitle();
	   
		if(title.equals("Yahoo")) {
			System.out.println("Matching : We are on same page " + title);
		}
		else {
			System.out.println("not Matching ");
		}
		
		String txt = driver.findElement(By.xpath("//strong[contains(text(),'Sign in')]")).getText();
		System.out.println(txt);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("xyz@gmail.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		
		driver.close();
		
		

	}

}
