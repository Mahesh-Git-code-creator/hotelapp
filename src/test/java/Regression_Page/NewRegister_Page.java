package Regression_Page;

import org.testng.annotations.Test;
import BrowserPage.chromeBrowser;
import NewRegistration_Adactin_HotelApp.NewRegistration;

public class NewRegister_Page extends chromeBrowser {

	@Test

	public void NewRegister() throws Exception {

		NewRegistration newCustomer = new NewRegistration();

		newCustomer.Registerclick();
		newCustomer.VerifyTitle("Adactin.com - New User Registration");
		newCustomer.registerUserName("swamy");
		newCustomer.registerPassword("swamy@123");
		newCustomer.registerConfirmPassword("swamy@123");
		newCustomer.registerfullName("swamychinnu");
		newCustomer.newEmail("maheshkolluboina114@gmail.com");
		newCustomer.EnterCaptcha("");
		newCustomer.termcond();
		newCustomer.clickToConformNewRegister();

	}

}
