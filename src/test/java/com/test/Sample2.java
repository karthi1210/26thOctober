package com.test;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(groups = {"smoke","regression"})
	private void testCase1() {
		System.out.println("Test1");
	}
	
	@Test(groups = "regression")
	private void testCase2() {
		System.out.println("Test2");
	}
	
	@Test(groups = "smoke")
	private void testCase3() {
		System.out.println("Test3");
	}
	
	@Test(groups = "regression")
	private void testCase4() {
		System.out.println("Test4");
	}
	

}
