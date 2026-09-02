package Logincases_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAdress extends stepDefinition {

	public BillingAdress() {
		super();
	}

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//textarea[@name='address']")
	WebElement Address;

	@FindBy(xpath = "//input[@name='cc_num']")
	WebElement creditCardNo;

	@FindBy(xpath = "//select[@name='cc_type']")
	WebElement TypeOfcreditCard;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	WebElement selectMonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	WebElement selectYear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	WebElement CVVnumber;

	@FindBy(xpath = "//input[@name='book_now']")
	WebElement BookNowClick;

	public void EnterFirstName(String text) throws Exception {

		Thread.sleep(3000);

		ScrollBypage("scroll[0,1000]");

		ScrollBypage("arguments[0]");

		Thread.sleep(5000);

		type(firstName, text);

	}

	public void EnterLastName(String text) throws Exception {

		Thread.sleep(5000);

		type(lastName, text);
	}

	public void addressLine(String text) throws Exception {
		Thread.sleep(5000);
		type(Address, text);
	}

	public void creditcard(CharSequence num) throws Exception {

		Thread.sleep(5000);
		IntegerValue(creditCardNo, num);
	}

	public void creditcardType(String text) throws Exception {

		ActionKey(TypeOfcreditCard);

		Thread.sleep(5000);

		selectMethod(TypeOfcreditCard, text);

	}

	public void MonthSelectedBy(String text) throws Exception {
		ActionKey(selectMonth);

		Thread.sleep(5000);

		selectMethod(selectMonth, text);
	}

	public void YearSelectedBy(String text) throws Exception {

		ActionKey(selectYear);

		Thread.sleep(5000);

		selectMethod(selectYear, text);
	}

	public void cvvNumber(String text) throws Exception {

		Thread.sleep(5000);
		type(CVVnumber, text);
	}

	public void Bookingpage() throws Exception {
		clickelement(BookNowClick);
		waitForElement(BookNowClick);
		Thread.sleep(10000);
	}

}
