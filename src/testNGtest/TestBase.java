package testNGtest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	static WebDriver driver;
	
	@BeforeSuite
	public void initialize() throws IOException{
			
		System.setProperty("webdriver.gecko.driver","D:\\Gaurav\\Jars\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.get("https://www.toolsqa.com/automation-practice-form/");
		
	}
	
	@AfterSuite
	//Test cleanup
	public void TeardownTest()
    {
        TestBase.driver.quit();
    }
}
