package assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPracticeTest {

	@Test
	public void demo() {
		String s1 ="Hello";
		String s2 = "Hi";
		SoftAssert s = new SoftAssert();
		s.assertTrue(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
		s.assertAll();
	}
	
	@Test
	public void demo2() {
		Reporter.log("In demo2",true);
	}

}
