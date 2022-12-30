package listeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstTest() {
		Reporter.log("First test", true);
	}
	
}
