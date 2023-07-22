package org.combined;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass1 {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;
		@FindBy (id="password")
	private WebElement txtPassWord;
	
	@FindBy (id="login")
	private WebElement BtnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return BtnLogin;
	}
	public  void logIn(String username,String password) {
		sendKeys(getTxtUserName(), username);
		sendKeys(getTxtPassWord(), password);
		click(BtnLogin);
		
		
}}
