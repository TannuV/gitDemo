package seleniumfirst1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {
	public static void main(String args[]) throws InterruptedException {
		//How to handle the popup window
		
		/*
		 * -->Driver.getWindowHandles(); --> return as ITERATOR<String>
		 * -->Driver.getWindowHandle();  ---> return as String
		 */
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href = '../articles_popup.php']")).click();
		Thread.sleep(2000);
		
		String mainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("xyz@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close(); // close the child window
				
			}
			
		}
		driver.switchTo().window(mainWindow);
	}

}
