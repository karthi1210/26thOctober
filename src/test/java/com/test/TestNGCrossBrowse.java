package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGCrossBrowse {
	
	public WebDriver driver;
	
	@BeforeClass
	private void launch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	@Parameters({"Browser"})
	@Test
	private void testCase1(String s1) {
		
		if(s1.equals("Chrome"))
			driver = new ChromeDriver();
		
		else
			driver = new EdgeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karthik");
	
	
	}
}
