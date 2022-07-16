package Pojo_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver; //null driver
	
	@FindBy(id="location")
	private WebElement loca;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy (id="room_nos")
	private WebElement roomnos;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(xpath = "//span[text()='(Fields marked with Red asterix (*) are mandatory)']")
	private WebElement text1;
	public WebElement getText1() {
		return text1;
	}
	
		public WebElement getSubmit() {
		return submit;
	}

		public Search_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoca() {
		return loca;
	}
	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}


	

	
	


}
