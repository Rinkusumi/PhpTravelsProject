package com.PhpTravels.ModulesTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Modules.AdminModule;
import com.PhpTravels.TestBase.TestBase;
import com.PhpTravels.utilities.ExcelUtility;

public class AdminModuleTest extends TestBase 
{
	
	
	
	AdminModule objLoginAdmin= new AdminModule();
	@Test(priority=1)
	public void verifyInValidAdminLogin() throws Exception 
	{
		objLoginAdmin = new AdminModule();
		driver.navigate().to("https://www.phptravels.net/api/admin");
		Thread.sleep(3000);
		String username = ExcelUtility.getCellData(7, 0);
		String password = ExcelUtility.getCellData(7, 1);
		objLoginAdmin.setUserName(username);
		Thread.sleep(2000);
		objLoginAdmin.setpassWord(password);
		objLoginAdmin.login();
		Thread.sleep(2000); 
		String actual=driver.getTitle();
		String expctd="Administator Login";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=2)
	public void verifyValidAdminLogin() throws Exception 
	{
		
	//Create Login Page object
	objLoginAdmin = new AdminModule();
	//login to application
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(8, 0);
	String password = ExcelUtility.getCellData(8, 1);
	objLoginAdmin.setUserName(username);
	Thread.sleep(3000);
	objLoginAdmin.setpassWord(password);
	objLoginAdmin.login();
	Thread.sleep(2000); 
	String actual=driver.getTitle();
	String expctd="Dashboard";
	Assert.assertEquals(actual, expctd);
	}
	
	@Test(priority=3)
	public void verifyBookingLink() throws Exception
	
	{
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(3000);
		objLoginAdmin.bookingLink();
		String expectedUrl="https://www.phptravels.net/api/admin/bookings";
		String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
       
	
	}
	@Test(priority=4)
	public void verifyInvoiceLink() throws Exception
	
	{
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(3000);
		
		objLoginAdmin.invoiceLink();
		Thread.sleep(3000);
		
       
   	
	}
	
	@Test(priority=5)
	public void verifyDeleteButton() throws Exception
	
	{
		
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(3000);
		objLoginAdmin.deleteButton();
	}
	
	@Test(priority=5)
	public void changeBookingStatus() throws Exception
	
	{
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(2000);
		objLoginAdmin.dashboardLink();
		objLoginAdmin.previous_StatusRecord();
		Thread.sleep(3000);
		
	
	}
	@Test(priority=6)
	public void verifyDashboardCount() throws Exception
	
	{
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(3000);
		objLoginAdmin.changeBookingStatus();
		Thread.sleep(3000);
		objLoginAdmin.dashboardLink();
		objLoginAdmin.after_StatusRecord();
		
	}
	
	@Test(priority=7)
	public void verifyWebsiteLink() throws Exception
	
	{
		objLoginAdmin = new AdminModule(); 	
		Thread.sleep(2000);
		objLoginAdmin.websiteLinkCheck();
		
	
	}
	
}
