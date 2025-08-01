package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingRobotClass {
 
	
	
			public static void main(String[] args) throws Throwable {
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				
				//using keys class
			//	driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
				
				//using Robot class
				driver.findElement(By.name("q")).sendKeys("puma");
				Robot rob = new Robot();
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);
				
			}

		
		 

	}


