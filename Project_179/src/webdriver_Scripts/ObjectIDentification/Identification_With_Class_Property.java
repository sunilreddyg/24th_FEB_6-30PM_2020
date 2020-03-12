package webdriver_Scripts.ObjectIDentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identification_With_Class_Property 
{

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//IDentifying email with  class property
		driver.findElement(By.className("whsOnd")).clear();
		driver.findElement(By.className("whsOnd")).sendKeys("qadarshan@gmail.com");
		
		//Identify Email next button locator with class property
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		
		//Identify password editbox location with class property
		driver.findElement(By.className("whsOnd")).clear();
		driver.findElement(By.className("whsOnd")).sendKeys("hello1234567");
		
		//Identifying Password next button with class property
		driver.findElement(By.className("CwaK9")).click();
		
		
		
	}

}
