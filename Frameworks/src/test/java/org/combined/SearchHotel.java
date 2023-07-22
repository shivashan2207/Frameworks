package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass1 {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username_show")
	private WebElement textWelcomeMsg;

	public WebElement getTextWelcomeMsg() {
		return textWelcomeMsg;
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return dDnLocation;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	public void searchHotels(String location,String Hotels,
			String roomType,String roomsnos,String checkIndate,String checkoutdate,String adultroom,String childroom ) {
		
		selectByTextDropdown(getLocation(), location);	
		selectByTextDropdown(getHotels(), Hotels);
		selectByTextDropdown(getRoomType(),roomType);
		selectByIndex(getRoomNos(), 2);
		sendKeys(getCheckInDate(), checkIndate);
		sendKeys(getCheckOutDate(), checkoutdate);
		sendKeys(getAdultRoom(), adultroom);
		selectByIndex(getChildRoom(), 3);
		click(getSubmit());
}}
