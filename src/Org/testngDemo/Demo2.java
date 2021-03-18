package Org.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeSuite
	public void BS() {
		Reporter.log("BeforeSuite", true);

	}

	@BeforeTest
	public void BT() {
		Reporter.log("BeforeTest", true);

	}

	@BeforeClass
	public void beforeC() {
		Reporter.log("BeforeClass", true);

	}

	@BeforeMethod
	public void beforeM() {
		Reporter.log("BM", true);

	}

	@Test
	public void tc1() {
		Reporter.log("hi..1", true);
	}

	@Test
	public void tc2() {
		Reporter.log("hi..2", true);
	}

	@AfterMethod
	public void afterM() {
		Reporter.log("AM", true);

	}

	@AfterClass
	public void afterC() {
		Reporter.log("AfterClass", true);

	}

	@AfterTest
	public void AT() {
		Reporter.log("AfterTest", true);

	}

	@AfterSuite
	public void as() {
		Reporter.log("AfterSuite", true);

	}
}
