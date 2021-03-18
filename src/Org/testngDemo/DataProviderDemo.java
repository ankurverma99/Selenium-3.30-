package Org.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider
	public static String[][] userValue() {
		String[][] st = new String[3][2];
		st[0][0] = "UserA";
		st[0][1] = "A";
		st[1][0] = "UserB";
		st[1][1] = "B";
		st[2][0] = "UserC";
		st[2][1] = "C";
		return st;
	}

	@Test(dataProvider = "userValue")
	public void Tc(String user, String pass) {
		Reporter.log(user + "   " + pass, true);
	}

}
