package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(groups = "Smoke")
	public void first1Test() {
		Reporter.log("First1 test", true);
	}
	
	@Test(groups = "Sanity")
	public void first2Test() {
		Reporter.log("First2 test", true);
	}
	
	@Test(groups = {"Smoke","Sanity"})
	public void first3Test() {
		Reporter.log("First3 test", true);
	}
}
