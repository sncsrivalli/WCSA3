package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(groups = "Smoke")
	public void second1Test() {
		Reporter.log("Second1 test", true);
	}
	
	@Test(groups = "Sanity")
	public void second2Test() {
		Reporter.log("Second2 test", true);
	}
	
	@Test(groups = "System")
	public void second3Test() {
		Reporter.log("Second3 test", true);
	}

}
