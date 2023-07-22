package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass1{

	public void bookingConfirmation() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtBookingConfirm;
	
	@FindBy(id="order_no")
	private WebElement orderId;

	public WebElement getTxtBookingConfirm() {
		return txtBookingConfirm;
	}

	public WebElement getOrderId() {
		return orderId;
	}
	public BookingConfirmation() {
		
		
	}
	}

