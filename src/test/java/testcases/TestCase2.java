package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseTest{

	@Test(groups="Smoke")
	public void validateTitle() {
		String expected_Title="Yahoo.com";
		String actual_Title="Google.com";
		SoftAssert softAssert = new SoftAssert();
/*		if(expected_Title.equals(actual_Title)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test case Fail");
		}*/
		softAssert.assertEquals(actual_Title, expected_Title);
		softAssert.assertTrue(false, "Title Didnt Match");
		System.out.println("Ending...");
		softAssert.assertAll();
	}
}
