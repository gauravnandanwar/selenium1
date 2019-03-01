package testNG;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilityClass.Excel_RW;

public class sampleCheck {
	WebDriver driver;

	public sampleCheck(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[contains(@name,'firstname')]")
	WebElement firstName;

	
	public String firstName(String TestCase) throws IOException {
		/*
		 * Excel_RW excel = new Excel_RW(); ArrayList data =excel.getData(strfName); for
		 * (i=1,i<data.)
		 */
		String fName = null;
		Excel_RW xl = new Excel_RW();
		ArrayList data = xl.getData(TestCase);
		int size = data.size();
		// System.out.println(size);
		for (int i = 1; i < size; i++) {
			System.out.println(data.get(i));
			fName = (String) data.get(i);

		}
		// firstName.sendKeys(fName);
		return fName;
	}
}