package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	WebDriver driver;
	
	@Parameters({"Browser"})
	@Test
	private void testCase1(String s1) {
			
			if(s1.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys(s1);
	
	}
	
	
}
