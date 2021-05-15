package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automation.amazon.base.BasePage;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	
		
	private By emailID = By.id("input-email");
	
	private By password =By.id("input-password");
	
	private By SubmitBtm= By.xpath("//input[@value='Login']");
	
	private By forgotpwdLink=By.cssSelector("div[class='form-group'] a");
	
	private By registerLink=By.linkText("Register");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitletext() {
		return driver.getTitle();
	}

	public boolean dforgotPwdLink() {
		return driver.findElement(forgotpwdLink).isDisplayed();
	}
	
	public AccountPage doLogin(String un, String pwd) {
		
		driver.findElement(emailID).sendKeys(un);
		
		driver.findElement(password).sendKeys(pwd);
		
		driver.findElement(SubmitBtm).click();
		
		return new AccountPage(driver);
	}
	
	
	public RegistrationPage doRegister() {
		driver.findElement(registerLink).click();
		
		return new RegistrationPage(driver);
	}
}
