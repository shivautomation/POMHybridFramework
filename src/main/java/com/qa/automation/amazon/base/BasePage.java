package com.qa.automation.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.amazon.utilities.OptionsManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;
	public Properties prop;
	public OptionsManager optionmanager;
	
	
	public WebDriver init_driver(String browser) {
		optionmanager=new OptionsManager(prop);
		System.out.println("Browser name is  : "+browser);
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(optionmanager.getChromeOptions());
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
		} else if (browser.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup();
			driver=new ChromeDriver();
		} else {
			System.out.println("Please pass the correct browser");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	
	/**
	 * This method is used to load the properties
	 */
	
	public Properties init_prop() {
		
		 prop=new Properties();
		 
		 try {
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/automation/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return prop;
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
