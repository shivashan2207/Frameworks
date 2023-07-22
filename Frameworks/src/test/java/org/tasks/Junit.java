package org.tasks;

import org.combined.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {

	public static WebDriver driver;

	@BeforeClass
		public static void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	//@AfterClass
//		public static void lastStep() {
//		driver.quit();


	@Test
		public void testcase01() {

		Login login = new Login();
		login.logIn(readCellData("Dask", 1,0), readCellData("Dask", 1, 1));
		
		
		
		
//		WebElement txtbox = driver.findElement(By.id("username"));
//		String name = txtbox.getAttribute("value");
//	    txtbox.sendKeys("Akilan1008");
	//	
//		WebElement txtPassword = driver.findElement(By.id("password"));
//		txtPassword.sendKeys("Iphone@11promax");
	//	
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
	//	
//		System.out.println("Test");
	}
	private String readCellData(String string, int i, int j) {
		
		return null;
	}

	@Test
	    public  void test02()   {
		
		WebElement clklocation = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(clklocation);
		s.selectByValue("Sydney");
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel SunShine");
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Standard");
		
		WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    Select s3 = new Select(roomno);
	    s3.selectByIndex(3);
	    
	   WebElement pickdate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	   pickdate.clear();
	   pickdate.sendKeys("10/12/2022");
	   
	   WebElement outdate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	   outdate.clear();
	   outdate.sendKeys("20/12/2022");
	   
	   WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
	   Select s4 = new Select(adult);
	   s4.selectByIndex(2);
	   
	   WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	   Select s5 = new Select(child);
	   s5.selectByIndex(2);
	   
	   WebElement clksearch = driver.findElement(By.xpath("//input[@name='Submit']"));
	   clksearch.click();
	   System.out.println("test01");
	    }


	@Test
	    public void testCase03() throws InterruptedException {
	      WebElement ratiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	      ratiobutton.click();
	      Thread.sleep(3000);
	      WebElement clkcontinue = driver.findElement(By.xpath("//input[@name='continue']"));
	      clkcontinue.click();
	      System.out.println("testcase02");
	     

	}

}
