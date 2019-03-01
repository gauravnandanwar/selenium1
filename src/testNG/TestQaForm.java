package testNG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import utilityClass.Excel_RW;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utilityClass.Excel_RW;

public class TestQaForm {
	WebDriver driver;

	public TestQaForm(WebDriver driver) {
		this.driver = driver;
	}

//Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'firstname')]")
	WebElement firstName;
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'lastname')]")
	WebElement lastName;
	@FindBy(how = How.XPATH, using = "//input[@name='sex']")
	List<WebElement> genderRadioButton;
	@FindBy(how = How.XPATH, using = "//input[@name='exp']")
	List<WebElement> yearsOfExperience;
	@FindBy(how = How.XPATH, using = "//input[@id='datepicker']")
	WebElement datePicker;
	@FindBy(how = How.XPATH, using = "//input[@id='profession-1']")
	WebElement prefessionSelect;
	@FindBy(how = How.XPATH, using = "//input[@name='profession']")
	List<WebElement> selectProfession;
	@FindBy(how = How.XPATH, using = "//input[@id='photo']")
	WebElement uploadFile;
	@FindBy(how = How.XPATH, using = "//input[@name='tool']")
	List<WebElement> selectAutoTool;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Selenium Automation Hybrid Framework')]")
	WebElement fileDownload;
	@FindBy(how = How.XPATH, using = "//select[@id='continents']")
	WebElement Selectcontinents;// =new Select(driver.findElement(By.xpath("//select[@id='continents']")));;
	@FindBy(how = How.XPATH, using = "//select[@id='selenium_commands']")
	WebElement Selectcommands;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement submitButton;

	// Defining all the user actions (Methods) that can be performed in the Facebook
	// home page
	// This method is to set Email in the email text box
	public void firstName(String strfName) throws IOException {
		/*
		 * Excel_RW excel = new Excel_RW(); ArrayList data =excel.getData(strfName); for
		 * (i=1,i<data.)
		 */
		/*
		 * firstName.sendKeys(strfName); Excel_RW xl = new Excel_RW(); ArrayList data
		 * =xl.getData("FName"); int size = data.size(); System.out.println(size);
		 */
		firstName.sendKeys(strfName);
	}

// This method is to set Password in the password text box
	public void lastName(String strlName) {
		lastName.sendKeys(strlName);
	}

	public void gender(int gender) {
		genderRadioButton.get(gender).click();
	}

	public void experience(int exp) {
		yearsOfExperience.get(exp).click();
		;
	}

	public void datePicker(String date) {
		datePicker.sendKeys(date);
	}

	public void profession(int pro) {
		selectProfession.get(pro).click();
	}

	public void uploadFile() throws IOException {
		/*
		 * uploadFile.click();
		 * Runtime.getRuntime().exec("D:\\Gaurav\\AutoIT\\uploader.exe");
		 */
		uploadFile.sendKeys("D:\\Gaurav\\download.png");
	}

	public void download() {
		fileDownload.click();
		/*
		 * String sourceLocation = fileDownload.getAttribute("href"); String
		 * wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " +
		 * sourceLocation; try { Process exec = Runtime.getRuntime().exec(wget_command);
		 * int exitVal = exec.waitFor(); System.out.println("Exit value: " + exitVal); }
		 * catch (InterruptedException | IOException ex) {
		 * System.out.println(ex.toString()); }
		 */
	}

	/*
	 * public void autoTool(int autoT) { selectAutoTool.get(autoT).click(); }
	 */
	public void continent(int con) {
		Select selectContinents = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		selectContinents.selectByIndex(con);
	}

	public void seleniumCommand(int commnd) {
		Select selectContinents = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		selectContinents.selectByIndex(commnd);
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.keyDown(Keys.CONTROL);
		seriesOfActions.perform();
	}

	public void submitForm() {
		submitButton.click();
	}
	
	public void excelRead(String row) throws IOException{
		Excel_RW excel = new Excel_RW();
		ArrayList data =excel.getData(row);
		
		int size = data.size();
		System.out.println(size);
		for (int i=1;i<size;i++) {
			//System.out.println(excel.getData(row));
			int index = data.lastIndexOf(row);
			//System.out.println(index);
		}
	//System.out.println(data.get(1));  
		 
	}
	
}
