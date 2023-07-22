package org.combined;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PomTaskAdactin extends BaseClass1{
	public static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		getdriver();
		getUrl("https://adactinhotelapp.com/");
		maximize();
	}
	@Test
	public  void booking() throws IOException, InterruptedException {
		//login
	Login login = new Login();
	login.logIn(readCellData("Dask",1,0), readCellData("Dask",1,1));
	
	//search Hotel
	SearchHotel searchHotel = new SearchHotel();
	WebElement welcomeMsg = searchHotel.getTextWelcomeMsg();
	String loginsearchpage = getAttribute(welcomeMsg);
	Assert.assertEquals("verify after success message","Hello Akilan1008!" ,loginsearchpage);
	searchHotel.searchHotels(readCellData("Dask", 1, 2), readCellData("Dask", 1, 3), readCellData("Dask", 1, 4),
			readCellData("Dask", 1, 5), readCellData("Dask", 1, 6), readCellData("Dask", 1, 7),
			readCellData("Dask", 1, 8), readCellData("Dask", 1, 9));
	
	//select Hotel
	SelectHotel selectHotel = new SelectHotel();
	WebElement textWelcomeMsg = searchHotel.getTextWelcomeMsg();
	String text = getText(textWelcomeMsg);
	Assert.assertEquals("verify After Search Hotel" ,"Select Hotel" ,text);
	selectHotel.selectHotels();
	
	
	//book a hotel
	BookAHotel bookAHotel = new BookAHotel();
	WebElement txtbookHotelMsg = bookAHotel.getTxtbookHotelMsg();
	String txtmsg = getText(txtbookHotelMsg);
	Assert.assertEquals("verify after text message","Book A Hotel" ,txtmsg);
	bookAHotel.bookHotel(readCellData("Dask", 1, 10), readCellData("Dask", 1, 11), readCellData("Dask", 1, 12),
			readCellData("Dask", 1, 13), readCellData("Dask", 1, 14),readCellData("Dask", 1, 15), readCellData("Dask", 1, 16),
			readCellData("Dask", 1, 17));
	
	//Booking Confirmation
	Thread.sleep(4000);
	BookingConfirmation bookConfirmation = new BookingConfirmation();
	WebElement txtBookingConfirm = bookConfirmation.getTxtBookingConfirm();
	String txtbookmsg = getText(txtBookingConfirm);
	Assert.assertEquals("verify after txtbookmsg","Booking Confirmation ",txtmsg);
	WebElement orderId = bookConfirmation.getOrderId();
	String value = getAttribute(orderId);
	writeCellData("Dask", 1, 18, value);
	
	//cancel booking
	CancelBooking cancelBooking = new CancelBooking();
	cancelBooking.canelBooking(readCellData("Dask", 1, 18));
			
		
}
}