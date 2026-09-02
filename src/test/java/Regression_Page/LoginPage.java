package Regression_Page;

import org.testng.annotations.Test;
import BrowserPage.chromeBrowser;
import Logincases_Adactin_HotelApp.BillingAdress;
import Logincases_Adactin_HotelApp.BookHotel;
import Logincases_Adactin_HotelApp.ConfirmationPage;
import Logincases_Adactin_HotelApp.LoginCases;
import Logincases_Adactin_HotelApp.SearchHotelPage;

public class LoginPage extends chromeBrowser  {

	@Test

	public void login() throws Exception {

		LoginCases firstpage = new LoginCases();

		firstpage.UserName("kolluboinachinna");
		firstpage.PasswordName("chinna@123");
		firstpage.Clicking();
		firstpage.VerifyTitle("Adactin.com - Search Hotel");

		SearchHotelPage HotelPage = new SearchHotelPage();

		HotelPage.locationHotel("London");
		HotelPage.hotelsSearch("Hotel Sunshine");
		HotelPage.roomTypeSearch("Double");
		HotelPage.NoOfRooms("3 - Three");
		HotelPage.CheckedInDates("01/09/2026");
		HotelPage.checkedOutDates("05/09/2026");
		HotelPage.AdultsRoomType("4 - Four");
		HotelPage.childrensRoomType("2 - Two");
		HotelPage.serchingButton();
		HotelPage.VerifyTitle("Adactin.com - Select Hotel");

		BookHotel HotelBooking = new BookHotel();

		HotelBooking.radioButoon();
		HotelBooking.ButtonClick();
		HotelBooking.VerifyTitle("Adactin.com - Book A Hotel");

		BillingAdress HotelAdress = new BillingAdress();

		HotelAdress.EnterFirstName("Chinnababu");
		HotelAdress.EnterLastName("kolluboina");
		HotelAdress.addressLine("MadhuraNagar," + " ZPP HIGH SCHOOL ROAD," + " vakalpudi ,  " + "kakinada , 533005");
		HotelAdress.creditcard("1234567891011456");
		HotelAdress.creditcardType("VISA");
		HotelAdress.MonthSelectedBy("November");
		HotelAdress.YearSelectedBy("2028");
		HotelAdress.cvvNumber("0902");
		HotelAdress.Bookingpage();
		HotelAdress.VerifyTitle("Adactin.com - Hotel Booking Confirmation");

		ConfirmationPage confirmPage = new ConfirmationPage();

		confirmPage.submitButton();
		confirmPage.VerifyTitle("Adactin.com - Select Hotel");

	}

}
