package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryWithXML {
	
	@Test
	public void demo() {
		System.out.println("In demo");
		Assert.fail();
	}

}
