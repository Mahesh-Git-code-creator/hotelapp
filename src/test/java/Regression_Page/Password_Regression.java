package Regression_Page;

import org.testng.annotations.Test;
import BrowserPage.chromeBrowser;
import ForgotPassword_Adactin_HotelApp.Forgot_password;

public class Password_Regression extends  chromeBrowser {

	@Test

	public void newpassword() throws Exception {

		Forgot_password password = new Forgot_password();
		password.ClickForgotPasswordLink();
		password.VerifyTitle("Adactin.com - Forgot Password");
		password.enterEmail("maheshkolluboina114@gmail.com");
		password.submitButton();
		password.VerifyTitle("Adactin.com - Forgot Password");
		password.ClickLoginButton();

	}

}
