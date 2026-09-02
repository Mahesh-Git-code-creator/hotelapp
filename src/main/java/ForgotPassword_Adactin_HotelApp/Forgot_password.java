package ForgotPassword_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Logincases_Adactin_HotelApp.stepDefinition;

public class Forgot_password extends stepDefinition {

	public Forgot_password() {
		super();
	}

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement paswordLink;

	@FindBy(xpath = "//input[@name='emailadd_recovery']")
	WebElement enterEmail;

	@FindBy(xpath = "//input[@id='Submit']")
	WebElement clickOfEmail;

	@FindBy(xpath = "//a[text()='Click here to login']")
	WebElement ReturnLoginButton;

	public void ClickForgotPasswordLink() {

		clickelement(paswordLink);

	}

	public void enterEmail(String Entermail) throws Exception {

		Thread.sleep(10000);

		type(enterEmail, Entermail);

	}

	public void submitButton() throws Exception {
		Thread.sleep(10000);
		clickelement(clickOfEmail);
	}

	public void ClickLoginButton() throws Exception {

		Thread.sleep(10000);
		clickelement(ReturnLoginButton);

	}

}
