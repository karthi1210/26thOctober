package com.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.pages.LoginPage;
import com.testings.BaseClass;

public class JUnitAnnotation extends BaseClass{
	
	@BeforeClass
	public static void launBrowser() {
		launchBrowser();
	}
	
	@Test
	public void testCase1()throws IOException {
		loadUrl("https://en-gb.facebook.com/");
		windowMax();
		LoginPage lp = new LoginPage();
		fill(lp.getTxtUser(), getData(1, 0));
		fill(lp.getTxtPass(), getData(1, 1));
		btnClick(lp.getBtnClick());
	}
	
	@Test
	public void testCase2() {
		Result result = JUnitCore.runClasses(Sample.class);
		System.out.println(result.getRunTime());
		System.out.println(result.getRunCount());
		System.out.println(result.getIgnoreCount());
		System.out.println(result.getFailureCount());
		/*List<Failure> failures = result.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			
			System.out.println(failures.get(i));
			
		}*/
			
	
	}
	
	@AfterClass
	public static void closBrowser() {
		closeBrowser();
	}
	
	
	
	

}
