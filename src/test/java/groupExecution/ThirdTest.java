package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups ="System")
	public void third1Test() {
		Reporter.log("Third1 test", true);
	}
	
	@Test(groups = {"Smoke","Sanity","System"})
	public void third2Test() {
		Reporter.log("Third2 test", true);
	}
	
	@Test(alwaysRun = true)
	public void third3Test() {
		Reporter.log("Third3 test", true);
	}
	

}
