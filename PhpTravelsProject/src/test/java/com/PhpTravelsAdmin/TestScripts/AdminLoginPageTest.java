package com.PhpTravelsAdmin.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBaseAdmin;
import com.PhpTravels.utilities.ExcelUtility;
import com.PhpTravelsAdmin.Pages.AdminLoginPage;

public class AdminLoginPageTest extends TestBaseAdmin 
{
	
	
	
	AdminLoginPage objLoginAdmin= new AdminLoginPage();
	@Test(priority=1)
	public void verifyInValidAdminLogin() throws Exception 
	{
		
	//Create Login Page object
	objLoginAdmin = new AdminLoginPage();
	//login to application
    Thread.sleep(3000);
	String username = ExcelUtility.getCellData(7, 0);
	String password = ExcelUtility.getCellData(7, 1);
	objLoginAdmin.setUserName(username);
	Thread.sleep(2000);
	objLoginAdmin.setpassWord(password);
	objLoginAdmin.login();
	Thread.sleep(2000); 
	}
	@Test(priority=2)
	public void verifyValidAdminLogin() throws Exception 
	{
		
	//Create Login Page object
	objLoginAdmin = new AdminLoginPage();
	//login to application
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(8, 0);
	String password = ExcelUtility.getCellData(8, 1);
	objLoginAdmin.setUserName(username);
	Thread.sleep(3000);
	objLoginAdmin.setpassWord(password);
	objLoginAdmin.login();
	Thread.sleep(2000); 
	}
	
	@Test(priority=3)
	public void verifyBookingLink() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(3000);
		objLoginAdmin.bookingLink();
		String expectedUrl="https://www.phptravels.net/api/admin/bookings";
		String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
       
	
	}
	
	
	@Test(priority=4)
	public void verifyDeleteButton() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(3000);
		objLoginAdmin.deleteButton();
		
	
	}
	
	@Test(priority=5)
	public void changeBookingStatus() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(2000);
		
		
	
	}
	@Test(priority=6)
	public void verifyDashboardCount() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(3000);
		
		
	
	}
	
	@Test(priority=7)
	public void verifyWebsiteLink() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(2000);
		objLoginAdmin.websiteLinkCheck();
		
	
	}
	@Test(priority=8)
	public void verifyInvoiceLink() throws Exception
	
	{
		objLoginAdmin = new AdminLoginPage(); 	
		Thread.sleep(2000);
		objLoginAdmin.invoiceLink();
		String expectedUrl="https://www.phptravels.net/hotels/booking/invoice/5873/13";
		String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
       
	
	}
	
}
