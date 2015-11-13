package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {
	
	protected WebDriver driver;
	
	@FindBy(id="name_3_firstname")
	WebElement firstName;
	
	@FindBy(id="name_3_lastname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@value='married']")
	WebElement martialStatus;
	
	@FindBy(xpath="//input[@value='dance']")
	WebElement hobby01;
	
	@FindBy(xpath="//input[@value='cricket ']")
	WebElement hobby02;
	
	@FindBy(id="dropdown_7")
	WebElement country;
	
	@FindBy(id="mm_date_8")
	WebElement month;
	
	@FindBy(id="dd_date_8")
	WebElement day;
	
	@FindBy(id="yy_date_8")
	WebElement year;
	
	@FindBy(id="phone_9")
	WebElement phoneNumber;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="email_1")
	WebElement eMail;
	
	@FindBy(id="profile_pic_10")
	WebElement profilePic;
	
	@FindBy(id="description")
	WebElement description;
	
	@FindBy(id="password_2")
	WebElement password;
	
	@FindBy(id="confirm_password_password_2")
	WebElement confirmPassword;
	
	@FindBy(name="pie_submit")
	WebElement submit;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegistrationPage clearFields() {

		firstName.clear();
		lastName.clear();
		phoneNumber.clear();
		username.clear();
		eMail.clear();
		description.clear();
		password.clear();
		confirmPassword.clear();
		return new RegistrationPage(driver);
	}
	
	public RegistrationPage registerUser(String fName, String lName, String sCountry, String sMonth, String sDay,
			String sYear, String sPhoneNo, String sUsername, String sEMail, String sUploadPath, String sDescription,
			String sPassword, String sConfirmPass) {

		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		new Select (country).selectByValue(sCountry);
		new Select (month).selectByValue(sMonth);
		new Select (day).selectByValue(sDay);
		new Select (year).selectByValue(sYear);
		phoneNumber.sendKeys(sPhoneNo);
		username.sendKeys(sUsername);
		eMail.sendKeys(sEMail);
		profilePic.sendKeys(sUploadPath);
		description.sendKeys(sDescription);
		password.sendKeys(sPassword);
		confirmPassword.sendKeys(sConfirmPass);
		return new RegistrationPage(driver);

	}
	
	public RegistrationPage clickOnFields() {

		martialStatus.click();
		hobby01.click();
		hobby02.click();
		return new RegistrationPage(driver);
	}
	
	public RegistrationPage clickOnSubmit() {

		submit.click();
		return new RegistrationPage(driver);
	}

}
