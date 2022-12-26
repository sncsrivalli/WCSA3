package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void suiteSetup() {
		System.out.println("suiteSetup");
	}
	
	@BeforeTest
	public void testSetup() {
		System.out.println("testSetup");
	}

	@BeforeClass
	public void classSetup() {
		System.out.println("classSetup");
	}
	
	@BeforeMethod
	public void methodSetup() {
		System.out.println("methodSetup");
	}
	
	@AfterMethod
	public void methodTeardown() {
		System.out.println("methodTeardown");
	}
	
	@AfterClass
	public void classTeardown() {
		System.out.println("classTeardown");
	}
	
	@AfterTest
	public void testTeardown() {
		System.out.println("testTeardown");
	}
	
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("suiteTeardown");
	}
}
