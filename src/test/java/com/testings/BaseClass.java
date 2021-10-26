package com.testings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(options);
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
		
	}
	
	public static void windowMax() {
		
		driver.manage().window().maximize();
	}
	
	public static void printTitle() {
		
		System.out.println(driver.getTitle());
		
	}
	
	public static void printCurrentUrl() {
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public static void fill(WebElement ele, String value) {
		
		ele.sendKeys(value);
		
	}
	
	public static void btnClick(WebElement ele) {
		
		ele.click();
		
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static String getData(int rowNumber, int columnNumber)throws IOException,FileNotFoundException {
		
		File f = new File("C:\\Users\\Karthiksofia\\eclipse-workspace\\MavenFirstDay\\src\\test\\java\\Data\\20th oct trail.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet1 = w.getSheet("karthik");
		Row row = sheet1.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);
		return cell.toString();
	}
	
	

}
