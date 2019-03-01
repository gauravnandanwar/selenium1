package testNGtest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testNG.FbHomePage;
import testNG.TestQaForm;
import testNG.sampleCheck;
import utilityClass.Excel_RW;

public class FbLoginTest extends TestBase {
	@Test
	public void init() throws Exception {

		TestQaForm fillForm = PageFactory.initElements(driver, TestQaForm.class);
		// sampleCheck fillForm = PageFactory.initElements(driver, sampleCheck.class);

		fillForm.firstName("Abhishek");

		fillForm.lastName("Singh");
		fillForm.gender(1);
		fillForm.experience(2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fillForm.datePicker("11/12/2018");
		fillForm.profession(1);
		fillForm.uploadFile(); // fillForm.download();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// fillForm.autoTool(2); fillForm.continent(3); fillForm.seleniumCommand(1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fillForm.seleniumCommand(3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fillForm.seleniumCommand(2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fillForm.submitForm();
		fillForm.excelRead("FName");

		/*
		 * FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		 * homepage.clickOnProfileDropdown(); homepage.verifyLoggedInUserNameText();
		 * homepage.clickOnLogoutLink();
		 */
	}
}
