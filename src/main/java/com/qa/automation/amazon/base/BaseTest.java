package com.qa.automation.amazon.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.amazon.pages.AccountPage;

import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.RegistrationPage;
import com.qa.amazon.utilities.ExcelUtil;

public class BaseTest {
	
public BasePage basepage;
public AccountPage Accountpage;
public RegistrationPage registrationpage;

public Properties prop;
public WebDriver driver;
public LoginPage loginpage;	


@BeforeTest
public void setup() {
	basepage=new BasePage();
	prop=basepage.init_prop();
	String browser=prop.getProperty("browser");
	driver=basepage.init_driver(browser);
	String url=prop.getProperty("url");
	loginpage =new LoginPage(driver);
	driver.navigate().to(url);
	
	
}

@AfterTest
public void teardown() {
	driver.quit();
}
	

}
