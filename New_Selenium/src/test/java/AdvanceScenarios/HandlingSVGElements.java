package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {
		
		//SVG :---> Scalar Vector Graphics........
		//syntax:-- //*[name()='svg' and @AttributeName='AttributeValue']
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/");
		
	//	 driver.findElement(By.xpath("//*[name()='svg' and @class='A_8a-icon']")).click();
		
		driver.findElement(By.xpath("//*[name()='svg' and @fill='inherit']")).click();
         
	}

}
