package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGGroup {
	
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	private void launchBrowse() {
		WebDriverManager.chromedriver().setup();
	}
	
	@Test(groups = {"regression","smoke"})
	private void testCase1() {
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karthik");
		driver.findElement(By.id("pass")).sendKeys("karthik@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
	}
	
	
	@Test(groups = "regression")
	private void testCase2() {
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karthikeyan");
		driver.findElement(By.id("pass")).sendKeys("karthikeyan@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
	}
	
	@Test(groups = "smoke")
	private void testCase3() {
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kartik");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
	}
	
	@Test(groups = "smoke")
	private void testCase4() {
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("java@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
	}
	
	@AfterClass(alwaysRun = true)
	private void closeBrowser() {
		driver.quit();
	}
	
	
	
	
	
	

}
