package Org.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDataP {

	@Test(dataProviderClass = Org.testngDemo.ReadData.class, dataProvider = "read")
	public void TC(String user, String pass) {
		Reporter.log(user + "   " + pass, true);
	}

}
