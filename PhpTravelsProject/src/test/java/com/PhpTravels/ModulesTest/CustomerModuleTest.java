package com.PhpTravels.ModulesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Modules.CustomerModule;
import com.PhpTravels.TestBase.TestBase;
import com.PhpTravels.utilities.ExcelUtility;


public class CustomerModuleTest extends TestBase

{
	CustomerModule objCustomer= new CustomerModule();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		
	//Create Login Page object
		CustomerModule objCustomer= new CustomerModule();
	
    Thread.sleep(2000);
	String username = ExcelUtility.getCellData(1, 0);
	String password = ExcelUtility.getCellData(1, 1);
	objCustomer.setUserName(username);
	Thread.sleep(2000);
	objCustomer.setpassWord(password);
	objCustomer.login();
	String expectedUrl="https://www.phptravels.net/login/failed";
	String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl);
   
	
	}
	@Test(priority=2)
	public void verifyValidLogin() throws Exception 
	{
		
	//Create Login Page object
    objCustomer = new CustomerModule();
	//login to application
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(2, 0);
	String password = ExcelUtility.getCellData(2, 1);
	objCustomer.setUserName(username);
	Thread.sleep(2000);
	objCustomer.setpassWord(password);
	objCustomer.login();
	Thread.sleep(2000); 
	String expectedUrl="https://www.phptravels.net/account/dashboard";
	String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl);
	}	
	
	@Test(priority=3)
	public void verifypayPal() throws Exception 
	{
		
	
	objCustomer = new CustomerModule();
    objCustomer.payPal();
	Thread.sleep(2000);
    WebElement i=driver.findElement(By.xpath("//img[@src='https://www.phptravels.net/app/themes/default/assets/img/gateways/paypal.png']"));
	Boolean p=(Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete"+"&&typeof arguments[0].naturalWidth !=\"undefined\" "+"&& arguments[0].naturalWidth>0",i);
	Assert.assertTrue(p, "Able to pay using paypal");
	
	/*String email="sb-itxir5994130@personal.example.com";
    String passwrd="testpayment";
    objCustomer.setPaymentCredentials(email, passwrd);
	*/
	}
	
	@Test(priority=4)
	public void verifyVoucherDisplay() throws Exception 
	{
		
		 objCustomer = new CustomerModule();
		 objCustomer.myBooking();
		 Thread.sleep(3000);
		 //String t="Booking Invoice";
		 // Assert.assertTrue(driver.getPageSource().contains("Booking Invoice"));
		   
			
	}                    
	@Test(priority=5)
	public void verifyAddressUpdation() throws Exception 
	{
		
		 objCustomer = new CustomerModule();
		 objCustomer.editProfile();
	     Thread.sleep(3000);
	     String state = "Karnataka";
	 	 String city ="Bangalore";
	 	 String address1 = "BTM Layout,Arekare";
	 	 String address2 = "No:20, Bannerghatta Road";
	 	 /*
	     String state = ExcelUtility.getCellData(13, 1);
	 	 String city = ExcelUtility.getCellData(14, 1);
	 	 String address1 = ExcelUtility.getCellData(15, 2);
	 	 String address2 = ExcelUtility.getCellData(16, 2);*/
	 	 objCustomer.setDetails(state, city, address1, address2);
	 	
	 	Assert.assertTrue(driver.getPageSource().contains(" Profile updated successfully."));
	 	 
	}
	@Test(priority=6)
	public void verifyMyBookingLink() throws Exception 
	{
		objCustomer = new CustomerModule();
		 Thread.sleep(3000);	
		 objCustomer.myBookings();
		 String actual=driver.getTitle();
		 String expctd="Bookings - PHPTRAVELS";
		 Assert.assertEquals(actual, expctd);
		
	
	}
	@Test(priority=7)
	public void verifyAddFundLink() throws Exception 
	{
		
		objCustomer = new CustomerModule();
		Thread.sleep(3000);
	 	objCustomer.addFund();
	 	String actual=driver.getTitle();
	 	String expctd="Add Funds - PHPTRAVELS";
	 	Assert.assertEquals(actual, expctd);
	 } 
	@Test(priority=8)
	public void verifyMyProfileLink() throws Exception 
	{
		objCustomer = new CustomerModule();
		 Thread.sleep(3000);	
		 objCustomer.myProfile();
		 String actual=driver.getTitle();
		 String expctd="Profile - PHPTRAVELS";
		 Assert.assertEquals(actual, expctd);
			
	}
	@Test(priority=9)
	public void verifyLogoutLink() throws Exception 
	{
		objCustomer = new CustomerModule();
		 Thread.sleep(3000);	
		 objCustomer.logout();
		 String actual="https://www.phptravels.net/login";
		 String expctd=driver.getCurrentUrl();	
		 Assert.assertEquals(actual, expctd);
		 Thread.sleep(3000);
		
		 
	}
	
	    
}


