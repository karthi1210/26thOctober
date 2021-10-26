package com.test;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.pages.LoginPage;
import com.testings.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
	
	public static void main(String[] args) throws IOException{
		
		/*WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement txtUser = driver.findElement(By.id("email"));
		
		txtUser.sendKeys("karthik");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
		txtPass.sendKeys("karthik@123");
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	
		btn.click();
		
		//FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		//f.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']")));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getCurrentUrl());*/
		
		/*launchBrowser();
		loadUrl("https://www.google.com");
		windowMax();
		printTitle();
		WebElement gSearch = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background : yellow;border : 5px solid green;')", gSearch);
		fill(gSearch, "iphone13 pro max");
		WebElement gSearchClick = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		btnClick(gSearchClick);
		String page1 = driver.getWindowHandle();
		driver.switchTo().window(page1);
		WebElement amazon = driver.findElement(By.xpath("//h3[contains(text(),'Apple iPhone 13 Pro Max (128GB) - Sierra Blue - Am')]"));
		btnClick(amazon);
		js.executeScript("window.scrollBy(0,500)", "");
		*/
		
		/*File f = new File("C:\\Users\\Karthiksofia\\eclipse-workspace\\MavenFirstDay\\src\\test\\java\\Data\\20th oct trail.xlsx");
		
		FileInputStream fis = new FileInputStream(f); 
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Karthik");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		
		System.out.println(c.toString());
		*/
		
		launchBrowser();
		loadUrl("https://en-gb.facebook.com/");
		windowMax();
		LoginPage lp = new LoginPage();
		fill(lp.getTxtUser(), getData(1, 0));
		fill(lp.getTxtPass(), getData(1, 1));
		btnClick(lp.getBtnClick());
		
		
		
		
	}

}

