package seleniumfirst1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  
		 * Actions and Action are class  --> handling for the keyboard and mouse events.
		 *  --> clickAndHold()
		 *  --> contextClick()
		 *  --> doubleClick()
		 *  --> dragAndDrop(source, target)
		 *  --> dragAndDropBy(source, x-offset, y-offset)
		 *  --> keyDown(modifier_key) &  keyUp(modifier _key)
		 *  --> moveByOffset(x-offset, y-offset)
		 *  --> moveToElement(toElement)
		 *  --> release()
		 *  --> sendKeys(onElement, charsequence)
		 *  -->perform()
		 *  -->build()   
		 */
		
		
		/*
		 * WAIT in selenium  (Exception throw if element is not found on web page -->ElementNotVisibleException )
		 * --> implicit Wait  -->>> driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		 * --> Explicit Wait  -->>> WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		 * --> Fluent Wait
		 */
		
		System.setProperty("WebDriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement link_Home =  driver.findElement(By.linkText("Home"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement toMove = driver.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"));
		
		Actions builder  = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		
		String bgcolor = toMove.getCssValue("color");
		System.out.println("Before hover : " + bgcolor );
		mouseOverHome.perform();
		bgcolor = toMove.getCssValue("background-color");
		System.out.println("After hover : " + bgcolor);
		
		
		//perform all methods on it 
		
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		
		Actions builder1 = new Actions(driver);
		Action multiAction = builder1.moveToElement(txtUser).click().keyDown(txtUser, Keys.SHIFT).sendKeys(txtUser, "Hello").keyUp(txtUser, Keys.SHIFT).doubleClick(txtUser).contextClick().build();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		multiAction.perform();
		
		
		
		driver.close();
		
		

	}

}
