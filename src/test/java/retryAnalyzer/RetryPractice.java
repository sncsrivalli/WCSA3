package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPractice {

	@Test(retryAnalyzer = genericUtility.RetryImplementation.class)
	public void test() {
		System.out.println("In test");
		Assert.fail();
	}
}
