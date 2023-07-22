package org.tasks;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pom.BaseClass;

public class AddactinTaskBaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		AddactinTaskBaseClass emp = new AddactinTaskBaseClass();
		emp.booking();
		

		}		 
					public void booking() throws IOException, InterruptedException {
			    	BaseClass baseClass = new BaseClass();
					baseClass.getdriver();
					
					baseClass.geturl("https://adactinhotelapp.com/");
					
					baseClass.maximizewindow();
					
					WebElement txtuserName = baseClass.findElementById("username");
					String readCellData = baseClass.readCellData("Dask", 1,0);
					baseClass.insertvaluetextbox(txtuserName, readCellData);
					
					WebElement txtpass = baseClass.findElementById("password");
					String readCellData2 = baseClass.readCellData("Dask", 1, 1);
					baseClass.insertvaluetextbox(txtpass, readCellData2);
					
					WebElement btnclk = baseClass.findElementById("login");
					baseClass.elementclick(btnclk);
					
					//WebElement findLocation = baseClass.findElementById("location");
					//String readCellData3 = baseClass.readCellData("Dask", 1, 2);
					//baseClass.insertvaluetextbox(findLocation, readCellData3);
					
					WebElement findElementById = baseClass.findElementById("location");
					String readCellData3 = baseClass.readCellData("Dask", 1, 2);
					baseClass.selectByText(findElementById, readCellData3);
					
					WebElement findHotel = baseClass.findElementById("hotels");
					String readCellData4 = baseClass.readCellData("Dask", 1, 3);
					baseClass.selectByText(findHotel, readCellData4);
					baseClass.elementclick(findHotel);
					
					WebElement findRoomType = baseClass.findElementById("room_type");
					String readCellData5 = baseClass.readCellData("Dask", 1, 4);
					baseClass.selectByText(findRoomType, readCellData5);
					baseClass.elementclick(findRoomType);
					
					WebElement findRoom = baseClass.findElementById("room_nos");
					String readCellData6 = baseClass.readCellData("Dask", 1, 5);
					baseClass.elementclick(findRoom);
				
			        WebElement checkindate = baseClass.findElementById("datepick_in");
					String readCellData7 = baseClass.readCellData("Dask", 1, 6);
					baseClass.insertValue(checkindate, readCellData7);
					//baseClass.clearBox(clrdate);
					
					WebElement checkoutdate = baseClass.findElementById("datepick_out");
					String readCellDate8 = baseClass.readCellData("Dask", 1, 7); 
				    baseClass.insertValue(checkoutdate, readCellDate8);
				   // baseClass.clearBox(clrdate1);
				    
				    WebElement adultHotel = baseClass.findElementById("adult_room");
				    String readCellData9 = baseClass.readCellData("Dask", 1,8);
				    baseClass.selectByText(adultHotel, readCellData9);
				    
				    WebElement txtchildroom = baseClass.findElementById("child_room");
				    String readCellData10 = baseClass.readCellData("Dask", 1, 9);
				    baseClass.selectByText(txtchildroom, readCellData10);
				    
				    WebElement btnsearch = baseClass.findElementById("Submit");
				    baseClass.elementclick(btnsearch);
				   
	  				WebElement clkRadioBtn = baseClass.findElementById("radiobutton_0");
					baseClass.elementclick(clkRadioBtn);
					
		 			WebElement clkContinue = baseClass.findElementById("continue");
					baseClass.elementclick(clkContinue);
					
					WebElement firstName = baseClass.findElementById("first_name");
					String readCellData11 = baseClass.readCellData("Dask", 1, 10);
					baseClass.insertValue(firstName, readCellData11); 
					
					WebElement lastName = baseClass.findElementById("last_name");
					String readCellData12 = baseClass.readCellData("Dask", 1, 11);
					baseClass.insertValue(lastName, readCellData12);
					
					WebElement txtaddr = baseClass.findElementById("address");  
					String readCellData13 = baseClass.readCellData("Dask", 1,12);
					baseClass.insertValue(txtaddr, readCellData13);
					
					WebElement txtcard = baseClass.findElementById("cc_num");
					String readCellData14 = baseClass.readCellData("Dask", 1, 13);
					baseClass.insertValue(txtcard, readCellData14);
					
					WebElement cardtype = baseClass.findElementById("cc_type");
					String readCellData15 = baseClass.readCellData("Dask", 1, 14);
					baseClass.selectByText(cardtype, readCellData15);
					baseClass.elementclick(cardtype);
					
					WebElement expirydate = baseClass.findElementById("cc_exp_month");
					String readCellData16 = baseClass.readCellData("Dask", 1, 15);
					baseClass.selectByText(expirydate, readCellData16);
					baseClass.elementclick(expirydate);
					
					WebElement expiryyear = baseClass.findElementById("cc_exp_year");
					String readCellData17 = baseClass.readCellData("Dask", 1, 16);
					baseClass.selectByText(expiryyear, readCellData17);
					baseClass.elementclick(expiryyear);
					
					
					WebElement txtcvv = baseClass.findElementById("cc_cvv");
					String readCellData18 = baseClass.readCellData("Dask", 1, 17);
					baseClass.insertValue(txtcvv, readCellData18);
					
					WebElement clkbooknow = baseClass.findElementById("book_now");
					baseClass.elementclick(clkbooknow);
					
					Thread.sleep(5000);
	                WebElement bookingId = baseClass.findElementById("order_no");
					String attribute = baseClass.getAttribute(bookingId);
					baseClass.writeCellData("Dask", 1, 18, attribute);
					
					

	}

}
