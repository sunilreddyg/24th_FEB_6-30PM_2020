package webdriver_Scripts.ObjectIDentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Location_At_Webpage {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Enter Email into textbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Enter password and press submition keyword using keyboard shortcut.
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello123456"+Keys.RETURN);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
