package parallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestBrowser {
	
	@Parameters({"browser"})
	@Test
	public void doLogin(String b) throws InterruptedException {
		Date d=new Date();
		System.out.println("Broswer name:"+b+"---"+d);
		Thread.sleep(2000);
	}

}
