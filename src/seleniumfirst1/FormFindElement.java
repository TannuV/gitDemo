package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFindElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		String baseUrl = " http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);	
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		pass.sendKeys("abcdefgh1kj1");
		System.out.println("Text Field Set");
		
		email.clear();
		pass.clear();
		System.out.println("Text Field clear");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("abcd@gmail.com");					
        pass.sendKeys("abcdefghlkjl");					
        login.click();			
        System.out.println("Login Done with Click");
        
//        driver.get(baseUrl);					
//        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
//        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
//        driver.findElement(By.id("SubmitLogin")).submit();					
//        System.out.println("Login Done with Submit");	
        driver.close();

	}

}
