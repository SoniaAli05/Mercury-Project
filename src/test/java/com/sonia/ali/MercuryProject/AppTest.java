package com.sonia.ali.MercuryProject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class AppTest {
	
	
	ChromeDriver driver;
	WebElement checkElement;
	ExtentReports extent; 
	ExtentTest test;
	
	@Before
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Report.html",true);
	}
	
	@After 
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);
	}
	
	@Test
	public void mthodTest() throws InterruptedException {
		test = extent.startTest("Verify application Title");
		test.log(LogStatus.INFO, "Browser started");
		test.log(LogStatus.PASS, "Verify Title of the page");
		driver.manage().window().maximize();
		driver.get(Constants.websiteURL);
		Homepage page1 = PageFactory.initElements(driver, Homepage.class);
		page1.searchFor();
		SecondPage page2 = PageFactory.initElements(driver, SecondPage.class);
		page2.searchFor();
		ThirdPage page3 = PageFactory.initElements(driver, ThirdPage.class);
		page3.searchFor();
		FourthPage page4 = PageFactory.initElements(driver, FourthPage.class);
		page4.searchFor();
		//Thread.sleep(5000);
		

		String flightsPage = driver
				.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font"))
				.getAttribute("innerHTML");

		test.log(LogStatus.INFO, "Use our Flight Finder");

		if (flightsPage.contains("Use our Flight Finder")) {
			test.log(LogStatus.PASS, "this passed");
		} else {
			test.log(LogStatus.FAIL, "this failed");
		}

		extent.endTest(test);
		extent.flush();

		assertEquals(true, flightsPage.contains("Use our Flight Finder"));
	
	}
	
}
