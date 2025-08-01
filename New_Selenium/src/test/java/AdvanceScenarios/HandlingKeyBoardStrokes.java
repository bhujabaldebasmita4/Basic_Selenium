package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokes {


		public static void main(String[] args) {
			
			//Handling the keyboard keys
			//* using Keys class----->static in nature
			//* using Robot class---->Non static in nature
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize();
			
			//case1:-
//			driver.findElement(http://By.name("user-name")).sendKeys("standard_user");
//			driver.findElement(http://By.name("password")).sendKeys("secret_sauce");
			
//			WebElement PassWord = driver.findElement(http://By.name("password"));
//			PassWord.sendKeys("secret_sauce");
//			PassWord.sendKeys(Keys.ENTER);
			//or
//			PassWord.sendKeys("secret_sauce",Keys.ENTER);
			
			//or
			//case2:-
//			driver.findElement(http://By.name("user-name")).sendKeys("standard_user");
//			driver.findElement(http://By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
			
			//case3:-
//			WebElement USERNAME = driver.findElement(http://By.name("user-name"));
//			USERNAME.sendKeys("standard_user");
//			USERNAME.sendKeys(http://Keys.TAB,"secret_sauce",Keys.ENTER);
			
			//case4:-
//			driver.findElement(http://By.name("user-name")).sendKeys("standard_user",http://Keys.TAB,"secret_sauce",Keys.ENTER);

		//------------------------------------------------------------------------------------------------------------------------------
			
			//control keys
			
			WebElement USERNAME = driver.findElement(By.name("user-name"));
			USERNAME.sendKeys("Qspiders",Keys.CONTROL+"a");
			USERNAME.sendKeys(Keys.CONTROL+"c");
			USERNAME.sendKeys(Keys.TAB,Keys.CONTROL+"v");
			
			
			
		}



	}


