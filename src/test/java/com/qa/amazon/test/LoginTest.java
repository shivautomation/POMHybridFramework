package com.qa.amazon.test;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.amazon.utilities.Constants;

import com.qa.automation.amazon.base.BaseTest;

public class LoginTest extends BaseTest {
	

	@Test(priority=1)public void getTitletest() {
		
		String title = loginpage.getTitletext();
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);

	}

	
	  @Test(priority=2) public void forgotPwdlinkTest() {
		  
		Assert.assertTrue(loginpage.dforgotPwdLink());
	  }
	  
	  @Test(priority=3) public void doLoginTest() { 
		  String un=prop.getProperty("username"); 
		  String pwd=prop.getProperty("password");
	      loginpage.doLogin(un,pwd);
	      
	  
	  }
	 
	 }
	 


