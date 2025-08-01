package FrameWork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExTest {
	
	@Test
	public void m1() {
		
		System.out.println("ash");
		System.out.println("grey");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, true);
		System.out.println("lucy");
		System.out.println("lony");
		soft.assertAll();
	}

}
