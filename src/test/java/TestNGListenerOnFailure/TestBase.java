package TestNGListenerOnFailure;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		if(driver==null){
		//driver = new FirefoxDriver();
			driver=getDriver("chrome");
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		
		
		}
	}

	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		
	}
	public WebDriver getDriver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}


}
