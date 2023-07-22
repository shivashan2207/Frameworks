package org.combined;

import org.testng.annotations.Test;

public class TestNg2 {
	@Test 
	public void tc11() {
		System.out.println("TC..11"+Thread.currentThread().getId());
	}

	@Test 
	public void tc22() {
		System.out.println("TC..22"+Thread.currentThread().getId());
	}

	@Test 
	public void tc33() {
		System.out.println("TC..33"+Thread.currentThread().getId());
	}

}
