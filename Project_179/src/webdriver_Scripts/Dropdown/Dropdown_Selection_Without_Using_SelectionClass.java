package webdriver_Scripts.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Without_Using_SelectionClass {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    //IDentify Option tag under select and Perform Click action inorder to select dropdown
	    driver.findElement(By.xpath("//*[@id=\"month\"]/option[9]")).click();
	    Thread.sleep(3000);
	    
	    //Dropdown Selection
	    driver.findElement(By.id("month"))
	    .findElements(By.tagName("option")).get(2).click();
	    
	    
	    /*
	     * => Findelements is a method it identify group object 
	     * 	  at webpage or any selected location under.
	     * => FindElement Identif group of elements and store all
	     * 		elements into list<WebElement> Reference.
	     * => get is a method under list interface class it access
	     * 		single object form list using inde number...
	     */
	    
	    
	    
	    //Verify Month Dropdown have 12 Options
	    int OptionCount=new Select(driver.findElement(By.id("month"))).getOptions().size();
	    if(OptionCount==13)
	    	System.out.println("Expected Option available");
	    else
	    	System.out.println("Expected Option not available");
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
