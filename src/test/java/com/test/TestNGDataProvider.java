package com.test;

import org.testng.annotations.DataProvider;

public class TestNGDataProvider {
	
	@DataProvider(name="GmailLogin")
	public Object[][] data1() {
		
		return new Object[][] {
			
			
			{"sofia.kshh@gmail.com","karthik"},
			{"kartt@gmail.com","karthik"},
			{"sofia.kshh@gmail.com","Hani_270518"},
			{"kartt@gmail.com","stpeterss"}
			
		};
		
	}

}
