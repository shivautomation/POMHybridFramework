package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automation.amazon.base.BasePage;

public class AccountPage extends BasePage{
	
	public WebDriver driver;
	
	private By header= By.xpath("//a[normalize-space()='Your Store']");
	private By subheaderAcc= By.xpath("//h2[normalize-space()='My Account']");
	private By subheaderOrder= By.xpath("//h2[normalize-space()='My Orders']");
	private By subheaderNews = By.xpath("//h2[normalize-space()='Newsletter']");
	private By Search =By.xpath("//input[@placeholder='Search']");
	private By seacrhBtn = By.xpath("//button[@class='btn btn-default btn-lg']");
	
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
		
	public String getHeaderName() {
		return driver.findElement(header).getText();
	}
	
	public String getAccountHeaderText() {
		return driver.findElement(subheaderAcc).getText();
	}
	
	public String getOrderHeaderText() {
		return driver.findElement(subheaderOrder).getText();
	}
	
	public String getNewsHeaderText() {
		return driver.findElement(subheaderNews).getText();
	}
	
	public SearchResultsPage doSearch(String productname) {
		driver.findElement(Search).sendKeys(productname);
		driver.findElement(seacrhBtn).click();
		return new SearchResultsPage();
	}
	
}

