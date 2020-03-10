package webdriver_Scripts.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_SelectionType {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	  boolean flag=new Select(driver.findElement(By.id("customState")))
			  			.isMultiple();
	  
	  System.out.println("Dropdown Multiple selection status is => "+flag);
	  
	  
	  
	  /*
	   * using Javascript executor convert single option selection dropdown
	   * into multiple option selection dropdown...
	   */
	  ((JavascriptExecutor)driver).executeScript
	  ("document.getElementById('customState').setAttribute('multiple','multiple')");
	  Thread.sleep(5000);
	  
	    
	    
	  boolean flag1=new Select(driver.findElement(By.id("customState")))
			  			.isMultiple();
	  
	  System.out.println("Dropdown Multiple selection status is => "+flag1);
	  
		  

	}

}
