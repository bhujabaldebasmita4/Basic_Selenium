package FrameWork;

import org.testng.annotations.Test;


public class Sample2Test {


	@Test(priority = 3)
	public void createproduct()
	{
		System.out.println(" product created");
	}
	
	@Test(priority = 0)
	public void modifyproduct()
	{
		 System.out.println("product modified");
	}
     
	@Test(priority = -1)
	public void deleteproduct()
	{
		System.out.println("product deleted");
	}
}
