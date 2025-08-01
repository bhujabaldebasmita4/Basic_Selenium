package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {
	
	
	
	//Initialization
	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Element Declaration
	@FindAll({@FindBy(name = "q"),@FindBy(css = "input[title='Search for Products, Brands and More']")})
	private WebElement searchBar;
	
	@FindAll({@FindBy(xpath = "//button[@type='submit']"),@FindBy(xpath = "//button[contains(@aria-label,'Search for Products, Brands and More')]")})
	private WebElement searchIcon;

	//getter methods
	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}
	
	//Business Logics
	/**
	 * This method is used to search prd
	 * @param ele
	 * @author LONY 
	 */
	public void searchPrd(String ele)
	{
		searchBar.sendKeys(ele);
		searchIcon.click();
	}
	
	
	
}
 


