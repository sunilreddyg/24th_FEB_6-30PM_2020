package webdriver_Scripts.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Multiple_Selection {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	  
	  /*
	   * using Javascript executor convert single option selection dropdown
	   * into multiple option selection dropdown...
	   */
	  ((JavascriptExecutor)driver).executeScript
	  ("document.getElementById('customState').setAttribute('multiple','multiple')");
	  Thread.sleep(5000);
	  
	    
	    
	  boolean flag=new Select(driver.findElement(By.id("customState")))
			.isMultiple();
	  System.out.println("Dropdown Multiple selection status is => "+flag);
	  
	  
	  //Decision verify Dropdown Selection state
	  if(flag==true)
	  {
		  System.out.println("Dropdown is a multiple selection type");
		  Select StateDrodpown=new Select(driver.findElement(By.id("customState")));
		  StateDrodpown.deselectAll();
		  StateDrodpown.selectByIndex(3);
		  StateDrodpown.selectByIndex(6);
		  StateDrodpown.selectByIndex(9);

		  
		  
		  //Get All Selected Option and return count of it
		  int Selection_count=StateDrodpown.getAllSelectedOptions().size();
		  if(Selection_count <=3)
		  {
			  System.out.println("Selection Count match with client requirement");
		  }
		  else
		  {
			  System.out.println("Selection Count mismatch with Client requriement");
		  }
		  
	  }
	  else
	  {
		  System.out.println("Dropdown is a single option selection type");
	  }
	  
	  

	}

}
