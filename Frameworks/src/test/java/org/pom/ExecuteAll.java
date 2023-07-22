package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecuteAll extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		
		getdriver();
		geturl("https://adactinhotelapp.com/");
		maximizewindow();
		
	}

	@Test
	
	public  void booking() throws IOException, InterruptedException {
		
		// LogIn
		WebElement txtuserName = findElementById("username");
		String readCellData = readCellData("Dask", 1,0);
		insertvaluetextbox(txtuserName, readCellData);
		
		WebElement txtpass = findElementById("password");
		String readCellData2 =readCellData("Dask", 1, 1);
		insertvaluetextbox(txtpass, readCellData2);
		
		WebElement btnclk = findElementById("login");
	    elementclick(btnclk);
	    
	    WebElement textLogin = findElementById("username_show");
	    String verify = getAttribute(textLogin);
	    Assert.assertEquals("verify text","Hello Akilan1008!",verify);
	    
	    //select booking
	    WebElement findLocation = findElementById("location");
		String readCellData3 = readCellData("Dask", 1, 2);
		insertvaluetextbox(findLocation, readCellData3);
		
		WebElement findHotel = findElementById("hotels");
		String readCellData4 = readCellData("dask", 1, 3);
		insertValue(findHotel, readCellData4);
		elementclick(findHotel);
		
		WebElement findRoomType = findElementById("room_type");
		String readCellData5 = readCellData("Dask", 1, 4);
		insertValue(findRoomType, readCellData5);
		elementclick(findRoomType);
		
		WebElement findRoom = findElementById("room_nos");
		String readCellData6 = readCellData("Dask", 1, 5);
		insertValue(findRoom, readCellData6);
		elementclick(findRoom);
	
        WebElement finddate = findElementById("datepick_in");
		String readCellData7 =readCellData("Dask", 1, 6);
		insertValue(finddate, readCellData7);
	
     	
		// select
		WebElement byXpath = locatorByXpath("//td[text()='Select Hotel ']");
     	String search = byXpath.getText();
		Assert.assertEquals("verify text","Select Hotel",search);
		
		WebElement clckRadioBtn = findElementById("radiobutton_0");
		elementclick(clckRadioBtn);
		
		WebElement clckContinue = findElementById("continue");
		elementclick(clckContinue);
		
		
		
		
		// personal details
		
		WebElement byXpath1 = locatorByXpath("//td[text()='Book A Hotel ']");
     	String bookingHotel = byXpath1.getText();
		Assert.assertEquals("verify text","Book A Hotel",bookingHotel);
		
		WebElement firstName = findElementById("first_name");
		String readCellData8 = readCellData("Dask", 1, 10);
		insertValue(firstName, readCellData8);
		
		WebElement lastName = findElementById("last_name");
		String readCellData9 = readCellData("Dask", 1, 11);
		insertValue(lastName, readCellData9);
		
		WebElement txtaddr = findElementById("address");
		String readCellData10 = readCellData("Dask", 1,12);
		insertValue(txtaddr, readCellData10);
		
		WebElement txtcard = findElementById("cc_num");
		String readCellData11 = readCellData("Dask", 1, 13);
		insertValue(txtcard, readCellData11);
		
		WebElement cardtype = findElementById("cc_type");
		String readCellData12 = readCellData("Dask", 1, 14);
		insertValue(cardtype, readCellData12);
		elementclick(cardtype);
		
		WebElement expirydate = findElementById("cc_exp_month");
		String readCellData13 = readCellData("Dask", 1, 15);
		insertValue(expirydate, readCellData13);
		elementclick(expirydate);
		
		WebElement expiryyear = findElementById("cc_exp_year");
    	String readCellData14 = readCellData("Dask", 1, 16);
		insertValue(expiryyear, readCellData14);
		elementclick(expiryyear);
		
		
		WebElement txtcvv = findElementById("cc_cvv");
		String readCellData15 = readCellData("Dask", 1, 17);
		insertValue(txtcvv, readCellData14);
		
		WebElement clkbooknow = findElementById("book_now");
		elementclick(clkbooknow);
		Thread.sleep(5000);
        WebElement bookingId = findElementById("order_no");
		String attribute1 = getAttribute(bookingId);
		writeCellData("Dask", 1, 18, attribute1);
		
		WebElement byXpath2 = locatorByXpath("//td[text()='Booking Confirmation ']");
     	String bookingCofirmation = byXpath2.getText();
		Assert.assertEquals("verify text","Booking Confirmation",bookingCofirmation);
		
}


	}
