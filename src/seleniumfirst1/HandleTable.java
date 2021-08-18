package seleniumfirst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class HandleTable {

	public static void main(String[] args) {
		
		//static table
		System.setProperty("WebDriver.driver.crome", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String innerCell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();

		System.out.println(innerCell);

		//*[@id="leftcontainer"]/table/thead/tr/th[1]

		//dynamic table 

		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    driver.close();
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		
	
		

		
	}

}
