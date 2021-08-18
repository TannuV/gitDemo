package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");					
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/test/link.html");
        
        driver.findElement(By.linkText("click here")).click();
       System.out.print("the tile of this page"+driver.getTitle()) ;
       
       
       driver.get("http://demo.guru99.com/test/newtours/ ");
       String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();		
       System.out.println(theLinkText);	
       
       theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();		
       System.out.println(theLinkText);
       
       //By.partialLinkText can use the inside and ouside means if the link is inside the block or ouside the block

	}

}
