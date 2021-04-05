package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void validateTitle() {
		String expected_Title="Yahoo.com";
		String actual_Title="Google.com";
/*		if(expected_Title.equals(actual_Title)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test case Fail");
		}*/
		Assert.assertEquals(actual_Title, expected_Title);
	}
}
