package com.qa.amazon.utilities;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsManager {
	
	public Properties prop;
	public ChromeOptions co;
	
	
	public OptionsManager(Properties prop) {
		this.prop=prop;
	}
	
	
	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();
		
		if(prop.getProperty("headless").trim().equals("true")) co.addArguments("--headless");
		if(prop.getProperty("incognito").trim().equals("true")) co.addArguments("--incognito");
		
		return co;
		
	}
	
	
	
	
	
	

}
