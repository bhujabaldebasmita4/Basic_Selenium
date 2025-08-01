package POM_Repo;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repo.FlipkartPage;

public class POMImplementation {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//implemented using getters
//		FlipKartPage page = new FlipKartPage(driver);
//		page.getSearchBar().sendKeys("puma");
//		page.getSearchIcon().click();
		
		//implemented using Business Logics
		FlipkartPage page = new FlipkartPage(driver);
		page.searchPrd("Nike");
		
	}

}

	