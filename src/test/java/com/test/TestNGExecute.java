package com.test;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.GMailLogin;
import com.testings.BaseClass;

public class TestNGExecute extends BaseClass{

	@BeforeClass
	private void launBrowser() {
		launchBrowser();
	}


	int count = 0;
	@Test(dataProvider="GmailLogin",dataProviderClass=TestNGDataProvider.class,groups="smoke")
	private void testCase1(String s1,String s2)throws InterruptedException {
		int flag = 0;
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		loadUrl("https://www.gmail.com/");
		windowMax();
		if(flag == 1)
			driver.findElement(By.xpath("(//div[@class='BHzsHc'])[1]")).click();
		GMailLogin gl = new GMailLogin();
		if(count >= 1)
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		fill(gl.getUser(), s1);
		String url = driver.getCurrentUrl();
		btnClick(gl.getSubmit1());
		Thread.sleep(2000);
		count++;
		if(!url.equals(driver.getCurrentUrl())) {
		fill(gl.getPass(), s2);
		btnClick(gl.getSubmit2());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currUrl = driver.getCurrentUrl();
		if(currUrl.equals("https://mail.google.com/mail/u/0/#inbox")) {
			driver.findElement(By.xpath("//img[@class='gb_Ca gbii']")).click();
			driver.findElement(By.xpath("//a[@id='gb_71']")).click();
			flag = 1;

		}
		

	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	private void clse() {
		driver.close();
	}
}
