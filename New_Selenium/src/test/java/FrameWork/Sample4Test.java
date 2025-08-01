package FrameWork;

import org.testng.annotations.Test;

public class Sample4Test {
	
	

	@Test(priority = 2)
	public void createproduct()
	{
		
		System.out.println("product created");
	}
	
	
	
	@Test(dependsOnMethods = "createproduct" , priority = 3)
	public void modifyproduct()
	{
		 System.out.println("product modified");
	}
     
	
	
	@Test(priority = 1 , dependsOnMethods = "createproduct" )
	public void deleteproduct()
	{
		System.out.println("product deleted");

	}
	

}
