package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAHotel extends BaseClass1{
	@FindBy(xpath="//*[text()='Book A Hotel ']")
	private WebElement txtbookHotelMsg;
	
	
	public WebElement getTxtbookHotelMsg() {
		return txtbookHotelMsg;
	}

	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditCard;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	public void bookHotel(String firstName, String lastName,String billingAddress,String creditCard,
			String creditCardType,String expiryMonth,String expiryYear,String cvvNumber) {
		sendKeys(getFirstName(), firstName);
		sendKeys(getLastName(), lastName);
		sendKeys(getBillingAddress(), billingAddress);
		sendKeys(getCreditCard(), creditCard);
		selectByTextDropdown(getCreditCardType(),creditCardType);
		selectByTextDropdown(getExpiryMonth(), expiryMonth);
		selectByIndex(getExpiryYear(), 2);
		sendKeys(getCvvNumber(), cvvNumber);
		click(getBookNow());
		
	}
}
