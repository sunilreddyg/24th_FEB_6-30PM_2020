package webdriver_Scripts.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    //Selecting Roundtrip radio button
	    driver.findElement(By.id("RoundTrip")).click();
	    
	    //Identify From Editbox and Type reference City Name
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
	    Thread.sleep(5000);   //Static timeout to load sugesstions
	    //Select any one sugessition from AutoComplete list
	    driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
	    
	    
	    //Identify To Editbox and type referrence City name
	    driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
	    Thread.sleep(5000);   //Static timeout to load sugesstions
	    driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	    
	    //Select Date From DataPicker
	    driver.findElement(By.linkText("26")).click();
	    Thread.sleep(5000);
	    
	    
	    //Type Date at Returndate Editbox
	    //Only type Date When Editbox is in Writable Mode...
	    driver.findElement(By.id("ReturnDate")).clear();
	    driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 19 Jun, 2020",Keys.ESCAPE);
	    
	    

	}

}
