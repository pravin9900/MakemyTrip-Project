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

public class HomePage {

	static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='From']")
	private WebElement from;
	
	@FindBy(xpath = "//span[text()='To']")
	private WebElement to;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromTextBox;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toTextBox;
	
	@FindBy(xpath = "//a[.='Search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']")
	private WebElement closeBtn ;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void closeNotisication() throws Exception
	{
		WebElement iframe = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(iframe);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(closeBtn));
		SeleniumWebElements.clickOnElement(closeBtn);
		driver.switchTo().defaultContent();	
	}
	
	 
	
	public void selectCity1(String fromCity1 , String toCity1) throws Exception
	{
		SeleniumWebElements.clickByJavascript(from);
		SeleniumWebElements.enterInputIntoElement(fromTextBox, fromCity1);
		WebElement city = driver.findElement(By.xpath("//span[text()='"+fromCity1+"']"));
		SeleniumWebElements.clickByJavascript(city);
		SeleniumWebElements.clickByJavascript(to);
		SeleniumWebElements.enterInputIntoElement(toTextBox, toCity1);	 
		WebElement city1 = driver.findElement(By.xpath("//span[text()='"+toCity1+"']")) ;
		SeleniumWebElements.clickByJavascript(city1);
		SeleniumWebElements.clickOnElement(searchBtn); 
	}

}
