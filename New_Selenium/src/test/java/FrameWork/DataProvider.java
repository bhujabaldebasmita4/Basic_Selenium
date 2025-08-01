package FrameWork;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test
	public void bookingTickets(String src,String dest)
	{
		System.out.println("book tickects from" +src +"to---->"+dest);
	}
      
	@org.testng.annotations.DataProvider
	public  Object[][] getData(){
		
		
		 Object[][] objArr = new Object[3][2];
		 
		 objArr[0][0]="BBSR";
		 objArr[0][1]="DELHI";
		 
		 objArr[1][0]="KERALA";
		 objArr[1][1]="MUMBAI";
		 
		 objArr[2][0]="KOLKATA";
		 objArr[2][2]="BENGALURU";
		 
		return objArr ;
		 
		 
		
	}
}
