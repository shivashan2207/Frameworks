package org.combined;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class HotelBooking {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		HotelBooking a = new HotelBooking();
		a.booking();
		
	}
	private static void booking() throws IOException, InterruptedException {
		BaseClass1 base = new BaseClass1();
		base.getdriver();
		
		//geturl
		base.getUrl("https://adactinhotelapp.com/");
		base.maximize();
		
		// LogIn
		WebElement txtUserName = base.findElementById("username");
		String readCellData = base.readCellData("Dask",1,0);
		base.sendKeys(txtUserName, readCellData);
	
		WebElement txtPassword = base.findElementById("password");
		String readCellData2 = base.readCellData("Dask",1,1);
		base.sendKeys(txtPassword, readCellData2);
		
		WebElement logIn = base.findElementById("login");
		base.click(logIn);
		
		// select location
		WebElement location = base.findElementById("location");
		String readCellData3 = base.readCellData("Dask", 1, 2);
		base.selectByTextDropdown(location, readCellData3);
	
		// select hotel
		WebElement hotel = base.findElementById("hotels");
		String readCellData4 = base.readCellData("Dask", 1, 3);
		base.selectByTextDropdown(hotel, readCellData4);
		
		//select roomtype
		WebElement roomtype = base.findElementById("room_type");
		String readCellData5 = base.readCellData("Dask", 1, 4);
		base.selectByTextDropdown(roomtype, readCellData5);
		
		//Number of Rooms 
		WebElement numberofrooms = base.findElementByName("room_nos");
		String readCellData6 = base.readCellData("Dask", 1, 5);
		base.selectByIndex(numberofrooms, 2);
		
		// check in date
		WebElement checkInDate = base.findElementById("datepick_in");
		String readCellData7 = base.readCellData("Dask", 1, 6);
		base.sendKeys(checkInDate, readCellData7);
	
		// check out date
		WebElement checkOutDate = base.findElementById("datepick_out");
		String readCellData8 = base.readCellData("Dask", 1, 7);
		base.sendKeys(checkOutDate, readCellData8);
		
		// adult room
		WebElement adultRoom = base.findElementById("adult_room");
		String readCellData9 = base.readCellData("Dask", 1, 8);
		base.sendKeys(adultRoom, readCellData9);
		
		//child per rooms
		WebElement childrooms = base.findElementById("child_room");
		String readCellData10 = base.readCellData("Dask", 1, 9);
		base.selectByIndex(childrooms, 3);
		
		//search
		WebElement btnsearch = base.findElementById("Submit");
		base.click(btnsearch);
		
		//raiobutton
		WebElement btnratiobutton = base.findElementById("radiobutton_0");
		base.click(btnratiobutton);
		
		//continue
		WebElement clkcontinue = base.findElementById("continue");
		base.click(clkcontinue);
		
		//FirstName
		WebElement txtfstname = base.findElementById("first_name");
		String readCellData11 = base.readCellData("Dask", 1, 10);
		base.sendKeys(txtfstname, readCellData11);
		
		//LastName
		WebElement txtlastname = base.findElementById("last_name");
		String readCellData12 = base.readCellData("Dask", 1, 11);
		base.sendKeys(txtlastname, readCellData12);
		
		//Address
		WebElement txtaddress = base.findElementById("address");
		String readCellData13 = base.readCellData("Dask", 1, 12);
		base.sendKeys(txtaddress, readCellData13);
		
		//creditcardnumber
		WebElement txtcredit = base.findElementById("cc_num");
		String readCellData14 = base.readCellData("Dask", 1, 13);
		base.sendKeys(txtcredit, readCellData14);
		
		//creditcardtype
		WebElement ddncredittype = base.findElementById("cc_type");
		String readCellData15 = base.readCellData("Dask", 1, 14);
		base.selectByTextDropdown(ddncredittype, readCellData15);
		
		//Expiry month
		WebElement exymonth = base.findElementById("cc_exp_month");
		String readCellData16 = base.readCellData("Dask", 1, 15);
		base.selectByTextDropdown(exymonth, readCellData16);
		
		//Expiry year
		WebElement exyyear = base.findElementById("cc_exp_year");
		String readCellData17 = base.readCellData("Dask", 1, 16);
		base.selectByIndex(exyyear, 2);
		
		//cvvnumber
		WebElement txtcvvno = base.findElementById("cc_cvv");
		String readCellData18 = base.readCellData("Dask", 1, 17);
		base.sendKeys(txtcvvno, readCellData18);
		
		//booknow
		WebElement clkbooknow = base.findElementById("book_now");
		base.click(clkbooknow);
		
		//orderid
		Thread.sleep(5000);
        WebElement bookingId = base.findElementById("order_no");
		String attribute = base.getAttribute(bookingId);
		base.writeCellData("Dask", 1, 18, attribute);

	}
}
