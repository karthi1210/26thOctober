package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	
public static WebDriver driver;
	
	public static void capturingScreenshot(String fname) throws IOException {

		TakesScreenshot s = (TakesScreenshot) driver;
		
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Karthiksofia\\eclipse-workspace\\MavenFirstDay\\Screenshots\\"+fname);
		
		FileUtils.copyFile(screenshotAs, f);

	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("karthik");
		
		driver.findElement(By.id("pass")).sendKeys("karthik@123");
		
		capturingScreenshot("ks1.png");
		
	}

}
