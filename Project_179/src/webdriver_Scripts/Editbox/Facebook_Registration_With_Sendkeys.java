package webdriver_Scripts.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration_With_Sendkeys 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Type Text into Editbox..
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Charan");
		
		/*
		 * Note:-->
		 * 		1. Clear command only for editboxes And it clear
		 * 			existing input at editbox and allow user to 
		 * 			enter new input instead of appending characters..
		 * 
		 * 		2. Sendkeys command not only for editboxes it also
		 * 			support keyboard shortcuts to use on other locations.
		 * 				[Dropdown, listbox , RadioButton, Chekcbox --etc]
		 */
		
		
		//Identify surname location
		driver.findElement(By.name("lastname"))
		.sendKeys("acharyan"+Keys.TAB
				+"charanacharyan@gmail.com"+Keys.TAB
				+"charanacharyan@gmail.com"+Keys.TAB
				+"hello123456");
		
		
		//selecting dropdown using keyboard shortcut
		driver.findElement(By.name("birthday_day")).sendKeys("15");
		
		//selecting dropdown using keyboard functions
		driver.findElement(By.name("birthday_month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Select radio button using keyboard shortcut
		driver.findElement(By.name("birthday_year"))
		.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE);
		

	}

}
