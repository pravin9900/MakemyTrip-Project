package com.makemyTrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsResultPage {

	WebDriver driver;

	@FindBy (xpath="//ul[@class='fareTypeOptions']//span[text()='Armed Forces']")
	private WebElement fareType ;
	
	@FindBy (xpath = "(//span[@title='IndiGo'])[2]")
	private WebElement filter ;
	 
	
	@FindBy(xpath="//span[.='SEARCH']")
	private WebElement searchBtn ;
	
	public FlightsResultPage(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	}
	
}
