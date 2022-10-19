package com.makemyTrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsResultPage {

	@FindBy(xpath="//input[@id='city']")
	private WebElement city ;
	
	@FindBy (xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	private WebElement enterCity ;
	
	@FindBy (id = "react-autowhatever-1-section-0-item-0")
	private WebElement firstOption;
	
	@FindBy(xpath="//input[@id='checkin']")
	private WebElement checkin ;
	
	@FindBy(xpath="//input[@id='checkout']")
	private WebElement checkout ;
	
	
}
