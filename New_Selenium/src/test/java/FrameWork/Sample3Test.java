package FrameWork;

import org.testng.annotations.Test;

public class Sample3Test {
	

	@Test
	public void createproduct()
	{
	
		System.out.println(" product created");
	}
	
	
	
	@Test(dependsOnMethods = "createproduct" )
	public void modifyproduct()
	{
		 System.out.println("product modified");
	}
     
	
	
	@Test(dependsOnMethods = {"createproduct" ,"modifyproduct"} )
	public void deleteproduct()
	{
		System.out.println("product deleted");

	}
	
	
}



