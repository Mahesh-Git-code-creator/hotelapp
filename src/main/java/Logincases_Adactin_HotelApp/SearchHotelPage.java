package Logincases_Adactin_HotelApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
 

public class SearchHotelPage  extends stepDefinition {

	public SearchHotelPage() {
		super();
	}

	@FindBy(xpath = "//select[@name='location']")
	WebElement Location;

	@FindBy(xpath = "//select[@name='hotels']")
	WebElement Hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	WebElement RoomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	WebElement NumberOfRooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	WebElement CheckInDate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	WebElement CheckOutDate;

	@FindBy(xpath = "//select[@name='adult_room']")
	WebElement AdultperRoom;

	@FindBy(xpath = "//select[@name='child_room']")
	WebElement ChildrenPerRoom;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement serachButton;
	
	

	public void locationHotel(String text) {
		
		 ActionKey(Location);
		 
		 waitForElement(Location);
		
		selectMethod(Location, text);

	}

	public void hotelsSearch(String text) {
		
		ActionKey(Hotels);
		
		waitForElement(Hotels);
		
		selectMethod(Hotels, text);

	}

	public void roomTypeSearch(String text) {

		ActionKey(RoomType);
		waitForElement(RoomType);
		selectMethod(RoomType, text);
	}

	public void NoOfRooms(String text) {
		
		ActionKey(NumberOfRooms);
		waitForElement(NumberOfRooms);
		selectMethod(NumberOfRooms, text);

	}

	public void CheckedInDates(String text) throws InterruptedException{
		
		Thread.sleep(3000);
		
		clearData(CheckInDate);
		waitForElement(CheckInDate);
		 
		type(CheckInDate, text);

	}

	public void checkedOutDates(String text) throws InterruptedException {
		
		Thread.sleep(3000);
		
		clearData(CheckOutDate);
		type(CheckOutDate, text);

	}

	public void AdultsRoomType(String text) {
		
		ActionKey(AdultperRoom);
		
		type(AdultperRoom, text);

	}

	public void childrensRoomType(String text) {
		
		ActionKey(ChildrenPerRoom);
		
		type(ChildrenPerRoom, text);
		
		

	}

	public void serchingButton() {
		
		clickelement(serachButton);

	}

}
