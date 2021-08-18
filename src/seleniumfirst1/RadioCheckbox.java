package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.crome", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		System.out.println("radio 1 is selected");
		driver.findElement(By.id("vfb-7-2")).click();
		System.out.println("radio 2 is selected");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		
		if(option1.isSelected()) {
			System.out.println("option1 is selected ");
			
		}else {
			System.out.println("option1 is not selected ");
		}
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement checkbox1 = driver.findElement(By.id("persist_box"));
		
		for(int i =0 ; i<2;i++) {
			checkbox1.click();
			System.out.println("Facebook Persists Checkbox Status is -  "+checkbox1.isSelected());
		}
		driver.close();
		
		
		
	}

}
