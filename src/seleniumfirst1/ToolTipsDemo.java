package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsDemo {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","chromedriver");					
		WebDriver driver = new ChromeDriver();	

//		String baseUrl = "http://demo.guru99.com/test/social-icon.html";					
//
//		driver.get(baseUrl);					
//		String expectedTooltip = "Github";	
//
//		// Find the Github icon at the top right of the header		
//		WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
//
//		//get the value of the "title" attribute of the github icon		
//		String actualTooltip = github.getAttribute("title");	
//
//		//Assert the tooltip's value is as expected 		
//		System.out.println("Actual Title of Tool Tip"+actualTooltip);							
//		if(actualTooltip.equals(expectedTooltip)) {							
//			System.out.println("Test Case Passed");					
//		}		
//		driver.close();
		
		driver.get("http://demo.guru99.com/test/tooltip.html");
		 String expectedTooltip = "What's new in 3.2";
		 WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		 
		 Actions builder = new Actions(driver);
		 builder.clickAndHold().moveToElement(download).build().perform();
		 
		 WebElement toolTipElement = driver.findElement(By.xpath("//a[contains(text(),\"What's new in 3.2\")]"));
		 String actualTooltip = toolTipElement.getText();
		 System.out.println("Actual Title of Tool Tip  "+ actualTooltip);
		 
		 if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();	
		 
		 
	}
}
