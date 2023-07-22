package org.combined;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JunitAdactin extends BaseClass1 {
	//This program Using Junit
		@BeforeClass
		//launch browser
		public static void beforeClass() {
		getdriver();
		getUrl("https://adactinhotelapp.com/");
		maximize();
		}
		
		@Test
		public   void test() throws IOException, InterruptedException {
			//LoginPage
			WebElement txtUserName = findElementById("username");
			String readCellData = readCellData("Dask",1,0);
			sendKeys(txtUserName, readCellData);
		
			WebElement txtPassword = findElementById("password");
			String readCellData2 = readCellData("Dask",1,1);
			sendKeys(txtPassword, readCellData2);
			
			WebElement logIn = findElementById("login");
		    click(logIn);
		    
		    	//verify Name
		    	WebElement textLogin = findElementById("username_show");
		    	String verify = getAttribute(textLogin);
		    	Assert.assertEquals("verify text","Hello Akilan1008!",verify);
		    
		    	//select location
		 		WebElement location = findElementById("location");
		 		String readCellData3 = readCellData("Dask", 1, 2);
		 		selectByTextDropdown(location, readCellData3);
		 	
		 		// select hotel
		 		WebElement hotel = findElementById("hotels");
		 		String readCellData4 = readCellData("Dask", 1, 3);
		 		selectByTextDropdown(hotel, readCellData4);
		 		
		 		//select roomtype
		 		WebElement roomtype = findElementById("room_type");
		 		String readCellData5 = readCellData("Dask", 1, 4);
		 		selectByTextDropdown(roomtype, readCellData5);
		 		
		 		//Number of Rooms 
		 		WebElement numberofrooms = findElementByName("room_nos");
		 		String readCellData6 =readCellData("Dask", 1, 5);
		 		selectByIndex(numberofrooms, 2);
		 		
		 		// check in date
		 		WebElement checkInDate = findElementById("datepick_in");
		 		String readCellData7 = readCellData("Dask", 1, 6);
		 		sendKeys(checkInDate, readCellData7);
		 	
		 		// check out date
		 		WebElement checkOutDate = findElementById("datepick_out");
		 		String readCellData8 = readCellData("Dask", 1, 7);
		 		sendKeys(checkOutDate, readCellData8);
		 		
		 		// adult room
		 		WebElement adultRoom = findElementById("adult_room");
		 		String readCellData9 = readCellData("Dask", 1, 8);
		 		sendKeys(adultRoom, readCellData9);
		 		
		 		//child per rooms
		 		WebElement childrooms = findElementById("child_room");
		 		String readCellData10 = readCellData("Dask", 1, 9);
		 		selectByIndex(childrooms, 3);
		 		
		 		//search
		 		WebElement btnsearch = findElementById("Submit");
		 		click(btnsearch);
		 		
		 		//verify select Hotel
		 		WebElement byXpath = xPath("//td[text()='Select Hotel ']");
		     	String search = byXpath.getText();
				Assert.assertEquals("verify text","Select Hotel",search);
				
				//raiobutton
				WebElement btnratiobutton = findElementById("radiobutton_0");
				click(btnratiobutton);
				
				//continue
				WebElement clkcontinue = findElementById("continue");
				click(clkcontinue);
				
				//FirstName
				WebElement txtfstname = findElementById("first_name");
				String readCellData11 = readCellData("Dask", 1, 10);
				sendKeys(txtfstname, readCellData11);
				
				//LastName
				WebElement txtlastname = findElementById("last_name");
				String readCellData12 = readCellData("Dask", 1, 11);
				sendKeys(txtlastname, readCellData12);
				
				//Address
				WebElement txtaddress = findElementById("address");
				String readCellData13 = readCellData("Dask", 1, 12);
				sendKeys(txtaddress, readCellData13);
				
				//creditcardnumber
				WebElement txtcredit = findElementById("cc_num");
				String readCellData14 = readCellData("Dask", 1, 13);
				sendKeys(txtcredit, readCellData14);
				
				//creditcardtype
				WebElement ddncredittype = findElementById("cc_type");
				String readCellData15 = readCellData("Dask", 1, 14);
				selectByTextDropdown(ddncredittype, readCellData15);
				
				//Expiry month
				WebElement exymonth = findElementById("cc_exp_month");
				String readCellData16 = readCellData("Dask", 1, 15);
				selectByTextDropdown(exymonth, readCellData16);
				
				//Expiry year
				WebElement exyyear =findElementById("cc_exp_year");
				String readCellData17 = readCellData("Dask", 1, 16);
				selectByIndex(exyyear, 2);
				
				//cvvnumber
				WebElement txtcvvno = findElementById("cc_cvv");
				String readCellData18 = readCellData("Dask", 1, 17);
				sendKeys(txtcvvno, readCellData18);
				
				//booknow
				WebElement clkbooknow = findElementById("book_now");
				click(clkbooknow);
				
				//orderid
				Thread.sleep(5000);
		        WebElement bookingId = findElementById("order_no");
				String attribute = getAttribute(bookingId);
				writeCellData("Dask", 1, 18, attribute);


				//verify book confirmation
				WebElement byXpath2 = xPath("//td[text()='Booking Confirmation ']");
		     	String bookingCofirmation = byXpath2.getText();
				Assert.assertEquals("verify text","Booking Confirmation",bookingCofirmation);

}
}
