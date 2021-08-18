package seleniumfirst1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		
//   handle frames in Selenium using 3 ways.		
//		By Index       ---> driver.switchTo().frame(0,1,2,3,....n);
//		By Name or Id  --->driver.switchTo().frame("iframe1"); --->  driver.switchTo().frame("id of the element");
//		By Web Element

		
		System.setProperty("WebDriver.driver.crome", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		System.out.println("********We are switch to the iframe*******");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		System.out.println("*********We are done***************");
		
		

	}

}
