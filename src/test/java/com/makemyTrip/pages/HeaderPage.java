package com.makemyTrip.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemyTrip.seleniumUtilities.SeleniumWebElements;
 

public class HeaderPage {

	WebDriver driver;
	@FindBy(xpath="(//span[text()='Flights'])[1]")
	private WebElement flightTab ;
	
	@FindBy(xpath="(//span[text()='Hotels'])[1]")
	private WebElement hotelsTab ;
	
	@FindBy(xpath="//span[text()='Homestays']")
	private WebElement homestaysTab ;
	
	@FindBy(xpath="//span[text()='Holiday Packages']")
	private WebElement holidayPackageTab ;
	
	@FindBy(xpath="(//span[text()='Trains'])[1]")
	private WebElement trainsTab ;
	
	@FindBy(xpath="//span[text()='Buses']")
	private WebElement busesTab ;
	
	@FindBy(xpath="(//span[text()='Cabs'])[1]")
	private WebElement cabsTab ;
	
	@FindBy(xpath="//span[text()='Forex']")
	private WebElement forexTab ;

	@FindBy(xpath="//span[text()='Charter Flights']")
	private WebElement charterFlightsTab ;

	@FindBy(xpath="//span[text()='Activities']")
	private WebElement activitiesTab ;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHeader(String text) throws Exception
	{
		String locator = "//span[text()='"+text+"']";
		WebElement tab = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
		SeleniumWebElements.clickOnElement(tab);
	}
	
}
