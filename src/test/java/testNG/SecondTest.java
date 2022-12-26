package testNG;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class SecondTest extends BaseClass{
	
	@Test
	public void second1Test() {
		System.out.println("second1Test");
	}
	
	@Test
	public void second2Test() {
		System.out.println("second2Test");
	}

}
