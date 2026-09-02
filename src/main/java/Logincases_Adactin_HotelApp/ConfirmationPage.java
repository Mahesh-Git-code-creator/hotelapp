package Logincases_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 

public class ConfirmationPage extends stepDefinition {

	public ConfirmationPage() {
		super();
	}

	@FindBy(css = "input[name='my_itinerary']")
	WebElement clickIternary;

	public void submitButton() {

		waitForElement(clickIternary);

		ScrollBypage("arguments[0]");

		clickelement(clickIternary);
	}

}
