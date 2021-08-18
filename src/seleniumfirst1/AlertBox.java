package seleniumfirst1;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
		
		
		/*
		 * ---> void dismiss()
		 * ---> void accepts()
		 * ---> String getText()
		 * ---> void sendKeys(String stringToSend)
		 * ---> switchTo()
		 */
		

		System.setProperty("WebDriver.driver.crome", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("happy");
		driver.findElement(By.name("submit")).click()  ;
		
		 Alert alert = driver.switchTo().alert();  //Alert class is avaiable and its alert().  or pop- up
		 String alertMessage= driver.switchTo().alert().getText();
		 //System.out.println(driver.switchTo().alert().getText());
		 System.out.println(alertMessage);
		 Thread.sleep(3000);
		 
	      alert.accept();
		//alert.dismiss();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		Thread.sleep(3000);
		popup.accept();
		
	driver.close();

	}

}
