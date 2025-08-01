package FrameWork;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	
	@Test
	public void m1() {
		
		System.out.println("step 1");
		System.out.println("step 2");
		Assert.assertEquals("a", "a", "assert is fail");
		System.out.println("assert is pass");
		System.out.println("step 4");
	}
           
	@Test
	public void m2() {
		
		 String expdata = "abcd";
		int actdata = 50;
		Assert.assertEquals(actdata, expdata);
	}
}
