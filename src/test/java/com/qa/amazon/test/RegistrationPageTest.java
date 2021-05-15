package com.qa.amazon.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.amazon.utilities.ExcelUtil;
import com.qa.automation.amazon.base.BaseTest;

public class RegistrationPageTest extends BaseTest{
	
	
	
	@BeforeClass
	
	public void RegistrationPageSetup() {
		registrationpage=loginpage.doRegister();
	}

	
	@DataProvider
	public Object[][] getData() {
		 String sheetname="Register";
		 Object data[][]=ExcelUtil.getRegistrationTestData(sheetname);
		return data;
		
	}
	
	
	
	
	@Test(dataProvider="getData")
	public void registrationdatatest(String fn, String ln, String mail, String phone, String pwd, String subscribe) {
		registrationpage.registrationform(fn, ln, mail, phone, pwd, subscribe);
	}
}
