
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Handling {
	static WebDriver driver;

	public static void initiatedriver() {
		System.setProperty("webdriver.gecko.driver", "D:\\Gaurav\\Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	public static void main(String[] args) throws InterruptedException {
		{
		initiatedriver();
		// Click on OK
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		// clicked on 'show me alert' button
		Alert a1 = driver.switchTo().alert();
		String alert1 = a1.getText();
		System.out.println("Alert1 : " + alert1);
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
		driver.close();
		}
		{
		initiatedriver();
		// Click on Cancel
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		// clicked on 'show me confirmation' button
		Alert a2 = driver.switchTo().alert();
		String alert2 = a2.getText();
		System.out.println("Alert2 : " + alert2);
		Thread.sleep(2000);
		a2.dismiss();
		Thread.sleep(2000);
		driver.close();
		}
		// Getting text and Sending some text information to alert
		{
		driver.findElement(By.xpath("//button[contains(.,'Show Me Prompt')]")).click(); // clicked on 'show me prompt'
																						// button
		Alert a3 = driver.switchTo().alert();
		String alert3 = a3.getText();
		System.out.println("Alert3 : " + alert3);
		a3.sendKeys("This Is John");
		System.out.println("Entered text 'This Is John'");
		Thread.sleep(2000);
		a3.accept();

		Thread.sleep(2000);
		driver.close();
		}
	}
}