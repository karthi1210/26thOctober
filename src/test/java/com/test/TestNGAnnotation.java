package com.test;


import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.testings.BaseClass;

public class TestNGAnnotation extends BaseClass {
	
	

	@BeforeClass
	private void launchChromeBrowser() {
		launchBrowser();
		
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Parameters({"username","password"})
	@Test
	private void testCase1(@Optional("Hello")String s1,String s2) throws IOException,InterruptedException{
		loadUrl("https://en-gb.facebook.com/");
		windowMax();
		LoginPage lp = new LoginPage();
		fill(lp.getTxtUser(), s1);
		fill(lp.getTxtPass(), s2);
		btnClick(lp.getBtnClick());
		Thread.sleep(5000);
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	private void closeChromeBrowser() {
		closeBrowser();
	}
	

}
	
	
