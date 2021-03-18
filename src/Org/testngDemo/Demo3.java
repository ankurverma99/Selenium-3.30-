package Org.testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {

	@Test(dependsOnMethods = "TC3")
	public void TC1() {
		System.out.println("Hi1");
	}

	@Test()
	public void TC2() {
		System.out.println("Hi2");
	}

	@Test(dependsOnMethods = "TC2")
	public void TC3() {
		System.out.println("Hi3");
	}

}
