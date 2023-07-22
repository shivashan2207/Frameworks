package org.combined;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgSample {
	@BeforeClass
	public void beforeClass() {
			System.out.println("Browser Configuration and Launch The Browser");
		}

	@AfterClass
	public void afterClass() {
			System.out.println("Close Browser");
		}
	
	@BeforeMethod
	public void beforeMethod() {
			System.out.println("Start Time");
		}
	
	@AfterMethod
	public void afterMethod() {
			System.out.println("End Time");
		}
	
	@Test
	public void tc1() {
			System.out.println("TC1");
		}
			
	@Test
	public void tc2() {
			System.out.println("TC2");
		}
	
	@Test
		public void tc3() {
			System.out.println("TC3");
		}
}
