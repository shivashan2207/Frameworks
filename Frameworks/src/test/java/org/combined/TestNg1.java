package org.combined;

import org.testng.annotations.Test;

public class TestNg1 {
	@Test 
	public void testCase01() {
		System.out.println("testCase01..."+Thread.currentThread().getId());
	}

	@Test 
	public void testCase02() {
		System.out.println("Testcase..2"+Thread.currentThread().getId());
	}

	@Test 
	public void testCase03() {
		System.out.println("Testcase..3"+Thread.currentThread().getId());
	}
}
