package Org.testngDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGroups {

	@Test(groups = "functional")
	public void TC_01() {
		Reporter.log("TC1", true);
		Assert.fail();
	}

	@Test(groups = "integration", dependsOnGroups = "functional")
	public void TC_02() {
		Reporter.log("TC2", true);
	}

	@Test(groups = "functional")
	public void TC_03() {
		Reporter.log("TC3", true);
	}

	@Test(groups = "smoke", dependsOnGroups = { "integration", "functional" })
	public void TC_04() {
		Reporter.log("TC4", true);
	}

	@Test(groups = "functional")
	public void TC_05() {
		Reporter.log("TC5", true);
	}

	@Test(groups = "integration", dependsOnGroups = "functional")
	public void TC_06() {
		Reporter.log("TC6", true);
	}

	@Test(groups = "integration", dependsOnGroups = "functional")
	public void TC_07() {
		Reporter.log("TC7", true);
	}

}
