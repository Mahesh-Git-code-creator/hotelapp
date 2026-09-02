package Regression_Page;

import java.util.HashMap;
import org.testng.annotations.Test;
import BrowserPage.chromeBrowser;
import Logincases_Adactin_HotelApp.BillingAdress;
import Logincases_Adactin_HotelApp.BookHotel;
import Logincases_Adactin_HotelApp.ConfirmationPage;
import Logincases_Adactin_HotelApp.LoginCases;
import Logincases_Adactin_HotelApp.SearchHotelPage;

public class TC_002LoginPage extends chromeBrowser{

	@Test(description = "To validate Login data", dataProvider = "Logindata")

	public void login(HashMap<String, String> LoginData) throws Exception {

//		JavaUnitCases  firstpage =	PageFactory.initElements(driver, JavaUnitCases.class);

		LoginCases firstpage = new LoginCases();

		firstpage.UserName(LoginData.get("username"));
		firstpage.PasswordName(LoginData.get("password"));
		firstpage.Clicking();
		firstpage.VerifyTitle(LoginData.get("exp-Title"));

		SearchHotelPage HotelPage = new SearchHotelPage();

		HotelPage.locationHotel(LoginData.get("Location"));
		HotelPage.hotelsSearch(LoginData.get("Hotels"));
		HotelPage.roomTypeSearch(LoginData.get("Room Type"));
		HotelPage.NoOfRooms(LoginData.get("Number of Rooms"));
		HotelPage.CheckedInDates(LoginData.get("Check In Date"));
		HotelPage.checkedOutDates(LoginData.get("Check Out Date"));
		HotelPage.AdultsRoomType(LoginData.get("Adults per Room"));
		HotelPage.childrensRoomType(LoginData.get("Children per Room"));
		HotelPage.serchingButton();
		HotelPage.VerifyTitle(LoginData.get("exp-Title"));

		BookHotel HotelBooking = new BookHotel();

		HotelBooking.radioButoon();
		HotelBooking.ButtonClick();
		HotelBooking.VerifyTitle(LoginData.get("Hotel-Booking"));

		BillingAdress HotelAdress = new BillingAdress();

		HotelAdress.EnterFirstName(LoginData.get("EnterFirstName"));
		HotelAdress.EnterLastName(LoginData.get("EnterLastName"));
		HotelAdress.addressLine(LoginData.get("addressLine"));
		HotelAdress.creditcard(LoginData.get("creditcardNumber"));
		HotelAdress.creditcardType(LoginData.get("creditcardType"));
		HotelAdress.MonthSelectedBy(LoginData.get("MonthSelectedBy"));
		HotelAdress.YearSelectedBy(LoginData.get("YearSelectedBy"));
		HotelAdress.cvvNumber(LoginData.get("cvvNumber"));
		HotelAdress.Bookingpage();
		HotelAdress.VerifyTitle(LoginData.get("AdressTitle"));

		ConfirmationPage confirmPage = new ConfirmationPage();

		confirmPage.submitButton();
		confirmPage.VerifyTitle(LoginData.get("confirmTitle"));

	}

}
