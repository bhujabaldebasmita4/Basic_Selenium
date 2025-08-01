package FrameWork;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample5Test {
	
	@Ignore
	@Test
	public void createproduct()
	{
		
		System.out.println("product created");
	}
	
	
	
	@Test(enabled = false )
	public void modifyproduct()
	{
		 System.out.println("product modified");
	}
     
	
	
	@Test(invocationCount = 3)
	public void deleteproduct()
	{
		System.out.println("product deleted");

	}
	

}


