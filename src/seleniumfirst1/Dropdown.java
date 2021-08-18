package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver");					
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        // select is a class and we need to create the object .
        Select dropCountry = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
        
        dropCountry.selectByVisibleText("ANTARCTICA");
        //dropCountry.selectByIndex(0);
        driver.quit();
        
       

	}

}
