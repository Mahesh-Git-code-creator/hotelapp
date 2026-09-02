package Logincases_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCases extends stepDefinition {

	public LoginCases() {
		super();
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernametextbox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordtextbox;

	@FindBy(xpath = "//input[@name='login']")
	WebElement LoginButton;

	public void UserName(String text) {
		type(usernametextbox, text);
	}

	public void PasswordName(String text) {
		type(passwordtextbox, text);
	}

	public void Clicking() {

		clickelement(LoginButton);
	}

}
