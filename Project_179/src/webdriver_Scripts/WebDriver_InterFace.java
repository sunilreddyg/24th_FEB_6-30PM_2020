package webdriver_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace {

	public static void main(String[] args) 
	{
		
		/*
		 * WebDriver is a interface class, It is implementing all
		 * browser instances...
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();   
		
		
		
		/*
		 * WebDriver Exceptions:-->
		 * 	
		 * 			1. WebDriver driver=new ChromeDriver();
		 * 
		 * 					IllegalStateException:-->
		 * 							This exception throw by webdriver when
		 * 							browser driver path not located before
		 * 							launch browser..
		 * 
		 * 			2. driver.get("http://facebook.com");
		 * 			
		 * 					SessionNotCreatedException:-->
		 * 							This exception throw by webdriver when
		 * 							browser version and browser driver version
		 * 							mismatch.
		 * 
		 * 			3. driver.get("www.facebook.com");
		 * 						InvalidSelectorException:-->
		 * 							This Exception throw by webdriver when
		 * 							url define with wrong protocal. WebDriver
		 * 							launch application with valid protocals
		 * 							are http://   or https://
		 * 							[driver.get("https://facebook.com")]
		 * 			
		 */
		
		
		
	}
	}


