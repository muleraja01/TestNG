package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{
	@Test(priority = 1,groups= {"Smoke","Regression","functional"})
	public void doUserReg() {
		System.out.println("Executing User Reg Test");
		Assert.fail("User not registered Successfully");
	}

	@Test(priority = 2,dependsOnMethods="doUserReg",groups= {"Regression","functional"})
	public void doLogin() {
		System.out.println("Executing Login Test");
	}
	
	@Test(priority = 3,dependsOnMethods="doUserReg",alwaysRun=true,groups= {"Smoke","functional"})
	public void thirdTest() {
		System.out.println("Executing Login Test");
	}
	@Test(priority = 4,groups="bvt")
	public void fourthTest() {
		System.out.println("Executing Login Test");
	}
}
