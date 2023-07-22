package org.combined;

import org.testng.annotations.Test;

public class TestNg3 {
	@Test 
	public void tc111() {
		System.out.println("TC..111"+Thread.currentThread().getId());
	}

	@Test 
	public void tc222() {
		System.out.println("TC..222"+Thread.currentThread().getId());
	}

	@Test 
	public void tc333() {
		System.out.println("TC..33s3"+Thread.currentThread().getId());
	}
}
