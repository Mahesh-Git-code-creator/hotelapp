package Logincases_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel extends stepDefinition {

	public BookHotel() {
		super();
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	WebElement radioButton;

	@FindBy(xpath = "//input[@name='continue']")
	WebElement clickContinue;

	public void radioButoon() {

		clickelement(radioButton);

	}

	public void ButtonClick() {
		clickelement(clickContinue);
	}

}
