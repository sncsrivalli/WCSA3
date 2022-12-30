package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;

@Listeners(genericUtility.ListenerImplementation.class)
public class ListenerPracticeWithAnnotation extends BaseClass{
	
	@Test
	public void demo() {
		Reporter.log("@Test method",true);
	}

}
