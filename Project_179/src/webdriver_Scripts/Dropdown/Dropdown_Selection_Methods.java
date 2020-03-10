package webdriver_Scripts.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Methods {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	   //Select dropdown using visible option name
	    new Select(driver.findElement(By.id("customState")))
	    .selectByVisibleText("Telangana");
	   Thread.sleep(5000);  //Static timeout to laod Cities list
	   
	    //Select dropdown option using Dropdown Value Property
	   new Select(driver.findElement(By.id("customCity")))
	   .selectByValue("hyderabad");
	   
	   //Type Text into Location editbox
	   driver.findElement(By.id("customLocality")).clear();
	   driver.findElement(By.id("customLocality")).sendKeys("Chaitanyapuri");
	   
	   //Select Dropdown Option using index number
	   new Select(driver.findElement(By.id("customRadius")))
	   .selectByIndex(3);
	   
	   //Select Checkbox
	   driver.findElement(By.id("amenity_category_order_types50")).click();
	   
	   
	   //click Signin button using xpath locator
	   driver.findElement(By.xpath("//*[@id=\"SearchCustomAddress\"]/ul/li[7]/input")).click();
	   
	}

}
