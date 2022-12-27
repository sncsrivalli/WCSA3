package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsPracticeTest {
	
	@Test
	public void test1() {
		Reporter.log("test1",true);
	}
	

	@Test(dependsOnMethods = "test1")
	public void test2() {
		Reporter.log("test2",true);
	}
	

	@Test(dependsOnMethods =  {"test1","test2"})
	public void test3() {
		Reporter.log("test3",true);
	}
	
	

}
