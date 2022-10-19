package com.makemyTrip.Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.makemyTrip.BaseTest.BaseTest;
import com.makemyTrip.DataDrivers.readPropertiesFile;
import com.makemyTrip.pages.FlightsResultPage;
import com.makemyTrip.pages.HeaderPage;
import com.makemyTrip.pages.HomePage;
import com.makemyTrip.pages.TrainResultPage;

public class TestScript02 {


	WebDriver driver;
	HomePage homePage ;
	HeaderPage headerPage;
	FlightsResultPage flighResultPage ;
	TrainResultPage trainResultPage ;
	 
	
	@BeforeClass
	public void objects()
	{
	System.out.println("---Before class----");	
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		driver = BaseTest.launchBrowser(readPropertiesFile.readData("browserName"), readPropertiesFile.readData("url"));
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("---test started---");
		homePage = new HomePage(driver);
		headerPage = new HeaderPage(driver);
		flighResultPage = new FlightsResultPage(driver);
		trainResultPage = new TrainResultPage(driver);
	}
	
	@Test
	public void  searchForTrains() throws Exception
	{
		 //homePage.closeNotisication();
		 headerPage.clickOnHeader("Trains");
		 homePage.selectCity1("Mumbai", "Nagpur");
		 trainResultPage.applyFilter("Departure after 6 PM","Trip Gurantee","3 Tier AC");
		
	}
	
	 
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("---test completed---");
		driver.quit();
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("--after class---");
	}
}
