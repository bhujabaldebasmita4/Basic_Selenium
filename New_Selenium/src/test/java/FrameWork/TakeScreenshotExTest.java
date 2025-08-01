package FrameWork;

import java.io.File;
import java.io.IOException;
import java.lang.classfile.instruction.NewMultiArrayInstruction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshotExTest {
	
	@Test
	public void m1() throws Throwable {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		//downcast
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./testngscrnshot.png");
		FileUtils.copyFile(src, dest);
	}

}
