package NewRegistration_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Logincases_Adactin_HotelApp.stepDefinition;

public class NewRegistration extends stepDefinition {

	public NewRegistration() {
		super();
	}

	@FindBy(xpath = "//a[text()='New User Register Here']")
	WebElement NewRegisterClick;

	@FindBy(xpath = "//input[@name='username']")
	WebElement NewUserName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement NewPassword;

	@FindBy(xpath = "//input[@name='re_password']")
	WebElement NewConfirmPasword;

	@FindBy(xpath = "//input[@name='full_name']")
	WebElement NewFullName;

	@FindBy(xpath = "//input[@name='email_add']")
	WebElement NewEmail;

	@FindBy(xpath = "//input[@name='captcha']")
	WebElement CaptchaText;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement TermsConditions;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement RegisterClick;

	public void Registerclick() {

		clickelement(NewRegisterClick);

	}

	public void registerUserName(String text) {

		waitForElement(NewUserName);

		type(NewUserName, text);

	}

	public void registerPassword(String text) {

		waitForElement(NewPassword);

		type(NewPassword, text);

	}

	public void registerConfirmPassword(String text) {

		waitForElement(NewConfirmPasword);

		type(NewConfirmPasword, text);

	}

	public void registerfullName(String text) {

		waitForElement(NewFullName);

		type(NewFullName, text);

	}

	public void newEmail(String text) {

		waitForElement(NewEmail);

		type(NewEmail, text);
	}

	public void EnterCaptcha(String text) throws Exception {

		waitForElement(CaptchaText);

		Thread.sleep(30000);

		type(CaptchaText, text);

	}

	public void termcond() {

		clickelement(TermsConditions);

	}

	public void clickToConformNewRegister() {

		clickelement(RegisterClick);

	}

}
