package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.driver.crome", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file");
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/shubhambhardwaj/Downloads");
		

	}

}
