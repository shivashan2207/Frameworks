package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends BaseClass1{
	public CancelBooking() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="order_no")
	private WebElement orderNumber;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnbookItinerary;
	
	@FindBy(id="order_id_text")
	private WebElement orderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement SearchHotel;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement clkcheckBox;
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement btncanelSelected;

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getBtnbookItinerary() {
		return btnbookItinerary;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getSearchHotel() {
		return SearchHotel;
	}

	public WebElement getClkcheckBox() {
		return clkcheckBox;
	}

	public WebElement getBtncanelSelected() {
		return btncanelSelected;
	}
	
	public void canelBooking(String orderId ) {
	getAttribute(getOrderNumber());
	click(getBtnbookItinerary());
	sendKeys(getOrderId(), orderId);
	click(getSearchHotel());
	click(getClkcheckBox());
	click(getBtncanelSelected());
		
		
}
}