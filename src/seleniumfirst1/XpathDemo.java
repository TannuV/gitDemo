package seleniumfirst1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * What is XPath?  --> XML path used for navigation through the HTML structure of the page 
			Types of X-path  -> Xpath=//tagname[@attribute='value']
				Absolute XPath --> html/body/div[1]/section/td[2]........ (/)
				Relative XPath --> start from the middel of the HTML DOM structure (//)
			Basic XPath
				Contains()
				Using OR & AND
				Starts-with function --> //label[starts-with(@id,'message')]
				Text()
			XPath axes methods -->>> Axes methods are used to find those elements, which dynamically change on refresh or any other operations
				Following
				Ancestor
				Child
				Preceding
				Following-sibling
				Parent
				Self
				Descendant
				
			 // --> used for the current node 
			 / --> used for select the element from the root node.
				
		 */
		
		System.setProperty("WebDriver.driver.chrome" , "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/test/selenium-xpath.html");
		String text =  driver.findElement(By.xpath("//div[@class = 'featured-box cloumnsize1']//h4[1]//b[1]")).getText();
		//String text =  driver.findElement(By.xpath("//*[@class = 'featured-box']//*[Text()='TESTING']")).getText();
		
		
		if(text.contains("TESTING")) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
		
		
		//driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name ='uid']")).sendKeys("hello");
	    //String txt = driver.findElement(By.xpath("//*[@class='barone']")).getText();
		
		System.out.println( driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div")));
		
		
//		driver.close();

	}

}
