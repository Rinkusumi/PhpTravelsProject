package com.PhpTravelsCustomer.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBaseCustomer;
import com.PhpTravels.utilities.ExcelUtility;
import com.PhpTravelsCustomer.Pages.CustomerLoginPage;

public class CustomerLoginPageTest extends TestBaseCustomer

{
	CustomerLoginPage objLoginCustomer= new CustomerLoginPage();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		
	//Create Login Page object
	objLoginCustomer = new CustomerLoginPage();
	
    Thread.sleep(2000);
	String username = ExcelUtility.getCellData(1, 0);
	String password = ExcelUtility.getCellData(1, 1);
	objLoginCustomer.setUserName(username);
	Thread.sleep(2000);
	objLoginCustomer.setpassWord(password);
	objLoginCustomer.login();
	String expectedUrl="https://www.phptravels.net/login/failed";
	String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl);
   
	
	}
	@Test(priority=2)
	public void verifyValidLogin() throws Exception 
	{
		
	//Create Login Page object
    objLoginCustomer = new CustomerLoginPage();
	//login to application
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(2, 0);
	String password = ExcelUtility.getCellData(2, 1);
	objLoginCustomer.setUserName(username);
	Thread.sleep(2000);
	objLoginCustomer.setpassWord(password);
	objLoginCustomer.login();
	Thread.sleep(2000); 
	String expectedUrl="https://www.phptravels.net/account/dashboard";
	String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl);
	}	
	
	@Test(priority=3)
	public void verifypayPal() throws Exception 
	{
		
	
    objLoginCustomer = new CustomerLoginPage();
    objLoginCustomer.payPal();
	Thread.sleep(2000);
	WebElement i=driver.findElement(By.xpath("//img[@src='https://www.phptravels.net/app/themes/default/assets/img/gateways/paypal.png']"));
	Boolean p=(Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete"+"&&typeof arguments[0].naturalWidth !=\"undefined\" "+"&& arguments[0].naturalWidth>0",i);
	Assert.assertTrue(p, "Able to pay using paypal");
	
	}
	
	@Test(priority=4)
	public void verifyVoucherDisplay() throws Exception 
	{
		
		 objLoginCustomer = new CustomerLoginPage();
		    objLoginCustomer.myBooking();
			Thread.sleep(3000);
			//String t="Booking Invoice";
			//Assert.assertTrue(driver.getPageSource().contains("Booking Invoice"));
		   
			
	}                    
	@Test(priority=5)
	public void verifyAddressUpdation() throws Exception 
	{
		
		 objLoginCustomer = new CustomerLoginPage();
		 objLoginCustomer.editProfile();
	     Thread.sleep(3000);
	     
	    String state = ExcelUtility.getCellData(13, 1);
	 	 String city = ExcelUtility.getCellData(14, 1);
	 	 String address1 = ExcelUtility.getCellData(15, 1);
	 	 String address2 = ExcelUtility.getCellData(16, 1);
	 	 objLoginCustomer.setDetails(state, city, address1, address2);
	 	Assert.assertTrue(driver.getPageSource().contains(" Profile updated successfully."));
	 	 
	}
	    
}