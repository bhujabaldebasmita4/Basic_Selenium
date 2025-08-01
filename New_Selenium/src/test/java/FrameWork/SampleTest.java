package FrameWork;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void createproduct()
	{
		System.out.println(" product created");
	}
	
	@Test
	public void modifyproduct()
	{
		 System.out.println("product modified");
	}
     
	@Test
	public void deleteproduct()
	{
		System.out.println("product deleted");
	}
}
