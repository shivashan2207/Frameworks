package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends BaseClass1 {
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement textHotelmsg;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement clkContinue;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}
	
	public WebElement getTextHotelmsg() {
		return textHotelmsg;
	}

	public void selectHotels() {
		click(getRadioButton());
		click(getClkContinue());
		
}}
