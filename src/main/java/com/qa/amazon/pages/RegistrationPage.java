package com.qa.amazon.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automation.amazon.base.BasePage;

public class RegistrationPage extends BasePage { 
	public Random randomgenerator;
	public int Randomint;
	
	private By firstname=By.id("input-firstname");
	private By lastname=By.id("input-lastname");
	private By email=By.id("input-email");
	private By telephone=By.id("input-telephone");
	private By password=By.id("input-password");
	private By confirmpassword=By.id("input-confirm");
	private By subscribeYes=By.xpath("//label[normalize-space()='Yes']/input[position()=1]");
	private By subscribeNo=By.xpath("//label[normalize-space()='No']/input[position()=1]");
	private By privacyPolicy= By.xpath("//input[@name='agree']");
	private By ContinueBtn=By.xpath("//input[@value='Continue']");
	private By successmsg=By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
	private By logoutBtn=By.linkText("Logout");
	private By RegisterBtn= By.linkText("Register");
			
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}	

		
	public void registrationform(String fn, String ln, String mail, String phone, String pwd, String subscribe) {
		driver.findElement(firstname).sendKeys(fn);
		driver.findElement(lastname).sendKeys(ln);
		randomgenerator=new Random();
		Randomint=randomgenerator.nextInt(1000);
		driver.findElement(email).sendKeys(mail+Randomint);
		driver.findElement(telephone).sendKeys(phone);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmpassword).sendKeys(pwd);
		
		if(subscribe.equals("yes")) {
			driver.findElement(subscribeYes).click();
		}else {
			driver.findElement(subscribeNo).click();
		}
		
		driver.findElement(privacyPolicy).click();
		
		driver.findElement(ContinueBtn).click();
		
		
		
		driver.findElement(logoutBtn).click();
		
		driver.findElement(RegisterBtn).click();
		
		System.out.println("Registered success");
		
		
	}
	
}
