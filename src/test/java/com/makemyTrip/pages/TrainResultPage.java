package com.makemyTrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.makemyTrip.seleniumUtilities.SeleniumWebElements;

public class TrainResultPage {

	WebDriver driver;
	
	public TrainResultPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 

	public void applyFilter(String quick, String tickitType , String journyClassFilter) throws Exception
	{
		String locator1 = "//label[text()='"+ quick+"']";
		WebElement quickFilter = driver.findElement(By.xpath(locator1));
		SeleniumWebElements.clickOnElement(quickFilter);
		System.out.println(quickFilter.getText());
		 
		String locator2 = "//label[text()='"+ tickitType +"']";
		WebElement ticketType = driver.findElement(By.xpath(locator2));
		SeleniumWebElements.clickOnElement(ticketType);
		System.out.println(ticketType.getText());
		 
		String locator3 = "//label[text()='"+ journyClassFilter +"']";
		WebElement journyClass = driver.findElement(By.xpath(locator3));
		SeleniumWebElements.clickOnElement(journyClass);
		System.out.println(journyClass.getText());
		 
		
	}
}
