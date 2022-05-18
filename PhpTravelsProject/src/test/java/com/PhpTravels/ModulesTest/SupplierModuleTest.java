package com.PhpTravels.ModulesTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Modules.SupplierModule;
import com.PhpTravels.TestBase.TestBase;
import com.PhpTravels.utilities.ExcelUtility;


public class SupplierModuleTest extends TestBase
{

	SupplierModule objSupplier= new SupplierModule();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		objSupplier = new SupplierModule();
		driver.navigate().to("https://www.phptravels.net/supplier");
		Thread.sleep(3000);
		String username = ExcelUtility.getCellData(10, 0);
		String password = ExcelUtility.getCellData(10, 1);
		objSupplier.setUserName(username);
		Thread.sleep(2000);
		objSupplier.setpassWord(password);
		objSupplier.login();
		Thread.sleep(2000); 
		String actual=driver.getTitle();
		String expctd="Supplier Login";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=2)
	public void verifyValidLogin() throws Exception 
	{
		objSupplier = new SupplierModule();
		Thread.sleep(2000);
		String username = ExcelUtility.getCellData(11, 0);
		String password = ExcelUtility.getCellData(11, 1);
		objSupplier.setUserName(username);
		Thread.sleep(3000);
		objSupplier.setpassWord(password);
		objSupplier.login();
		Thread.sleep(2000); 
		String actual=driver.getTitle();
		String expctd="Dashboard";
		Assert.assertEquals(actual, expctd);
	}	
	@Test(priority=3)
	public void verifyText() throws Exception 
	{
		objSupplier = new SupplierModule();
		Thread.sleep(3000);
		String t="Sales overview & summary";
		if(driver.getPageSource().contains("Sales overview and summary"))
			{
		
				System.out.println("Text:"+t+" is present. ");	
			}
			else
			{
		
				System.out.println("Text:"+t+" is not present. ");	
			}
	}
	
	@Test(priority=4)
	public void verifyRevenueBreakdown() throws Exception 
	{
		objSupplier = new SupplierModule();
		Thread.sleep(3000);
        objSupplier.revenueBreakdownDisplayed();
    
	}
	@Test(priority=5)
	public void verifyStatusFromPendingToConfirmed() throws Exception 
	{
		objSupplier = new SupplierModule();
		objSupplier.pendingBooking();
		Thread.sleep(3000);
		if(driver.getPageSource().contains("No data available in table"))
		{
			System.out.println("No data available in table");
		}
		else
		{
		
			System.out.println("Change Status");	
		}

		objSupplier.dashboard();
    }
	@Test(priority=6)
	public void verifyFlightLink() throws Exception 
	{
		objSupplier = new SupplierModule();
        objSupplier.flight();
        Thread.sleep(3000);
    }
	@Test(priority=7)
	public void verifyToursLink() throws Exception 
	{
		objSupplier = new SupplierModule();
        objSupplier.tours();
        Thread.sleep(3000);
    }
	@Test(priority=8)
	public void verifyVisaLink() throws Exception 
	{
		objSupplier = new SupplierModule();
        objSupplier.visa();
        Thread.sleep(3000);
    }
	@Test(priority=9)
	public void verifyBookingsLink() throws Exception 
	{
		objSupplier = new SupplierModule();
		objSupplier.bookingPage();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().to("https://www.phptravels.net/api/admin");
	
}
	
	
}
