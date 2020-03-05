package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Navigation to Downlaod ChromeDriver.exe file
		 * 			
		 * 		=> URL :--> https://sites.google.com/a/chromium.org/chromedriver/
		 * 		=> Downlaod chrome driver w.r.t chrome browser version
		 * 		=> At Index page select operating system and download zipformat file
		 * 		=> Unzip  chromedriver_win32.zip file 
		 * 		=> After unzip we receive chromedriver.exe file
		 * 		=> Set Environment Variable for chromedriver.exe before launching
		 * 				chrome browser using selenium..	
		 */
		
		//Setting Runtime Environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		//launching chrome browser and storing into reference variable
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");   //Navigate to webpage
		
		Thread.sleep(5000);   
		chrome.close();
	}

}
