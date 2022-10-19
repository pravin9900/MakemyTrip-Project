package com.makemyTrip.Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.makemyTrip.pages.FlightsResultPage;
import com.makemyTrip.pages.HeaderPage;
import com.makemyTrip.pages.HomePage;

public class TestScript01 {

	WebDriver driver;
	HomePage homePage ;
	HeaderPage headerPage;
	FlightsResultPage flighResultPage ;
	@BeforeClass
	public void objects()
	{
	System.out.println("---Before class----");	
	}
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("---test started---");
		homePage = new HomePage(driver);
		headerPage = new HeaderPage(driver);
		flighResultPage = new FlightsResultPage(driver);
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test
	public void  searchflight()
	{
		try {
		homePage.closeNotisication();
		headerPage.clickOnHeader("Flights");
		homePage.selectCity1("Pune", "Mumbai");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("---test completed---");
		//driver.quit();
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("--after class---");
	}
}
