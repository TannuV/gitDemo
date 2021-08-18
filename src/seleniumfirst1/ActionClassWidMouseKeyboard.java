package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassWidMouseKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");					
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/test/newtours/");  
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td"+ "/table/tbody/tr/td" + "/table/tbody/tr/td "+ "/table/tbody/tr"));  
        
        Actions builder = new Actions (driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();
        
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);    
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
       
        
        String baseUrl = "http://www.facebook.com/";
        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));
        
        Actions builder1 = new Actions(driver);
        Action hightlight = builder1.moveToElement(txtUsername).click().keyDown(txtUsername,Keys.SHIFT).sendKeys(txtUsername,"hello").keyUp(txtUsername,Keys.SHIFT).doubleClick(txtUsername).contextClick().build();

        hightlight.perform();
	}

}
///html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]