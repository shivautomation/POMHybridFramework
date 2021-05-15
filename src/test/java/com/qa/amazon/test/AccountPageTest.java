package com.qa.amazon.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.amazon.utilities.Constants;
import com.qa.automation.amazon.base.BaseTest;

public class AccountPageTest extends BaseTest{
	
	
	@BeforeClass
	public void AccountPageSetup() {
		
		Accountpage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void headernametest() {
		
		String Header=Accountpage.getHeaderName();
		
		Assert.assertEquals(Header, Constants.ACC_PAGE_HEADER);
		
		System.out.println("user name is : "+Header );
		
	}
	
	@Test(priority=2)
	public void Accheadernametest() {
		
		String AccHeader=Accountpage.getAccountHeaderText();
		
		Assert.assertEquals(AccHeader, Constants.ACC_PAGE_ACCOUNT_HEADER);
		
		System.out.println("user name is : "+AccHeader );
		
	}
	
	@Test(priority=3)
	public void Orderheadernametest() {
		
		String OrderHeader=Accountpage.getOrderHeaderText();
		
		Assert.assertEquals(OrderHeader, Constants.ACC_PAGE_ORDER_HEADER);
		
		System.out.println("user name is : "+OrderHeader );
		
	}
	
	@Test(priority=4)
	public void Newsheadernametest() {
		
		String NewsHeader=Accountpage.getNewsHeaderText();
		
		Assert.assertEquals(NewsHeader, Constants.ACC_PAGE_NEWS_HEADER);
		
		System.out.println("user name is : "+NewsHeader );
		
	}
	/*
	 * @Test public void SearchResultsTest() { String productname = "MacBook";
	 * 
	 * Accountpage.doSearch(productname);
	 * 
	 * }
	 */
	
	

}
