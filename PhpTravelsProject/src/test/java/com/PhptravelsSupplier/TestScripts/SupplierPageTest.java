package com.PhptravelsSupplier.TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBaseSupplier;
import com.PhpTravels.utilities.ExcelUtility;
import com.phpTravelsSupplier.Pages.SupplierPage;

public class SupplierPageTest extends TestBaseSupplier
{
	SupplierPage objSupplier= new SupplierPage();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		
	//Create Login Page object
	objSupplier = new SupplierPage();
	
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
		
	//Create Login Page object
	objSupplier = new SupplierPage();
	//login to application
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
		
	//Create Login Page object
	objSupplier = new SupplierPage();
	Thread.sleep(3000);
	String t="Sales overview & summary";
	if(driver.getPageSource().contains("Sales overview and summary"))
	{
		
		System.out.println("Text:"+t+" is present. ");
		
	}else
	{
		
		System.out.println("Text:"+t+" is not present. ");	
	}
}
	
	@Test(priority=4)
	public void verifyRevenueBreakdown() throws Exception 
	{
		

		objSupplier = new SupplierPage();
		Thread.sleep(3000);
         objSupplier.revenueBreakdownDisplayed();
    
}
	@Test(priority=5)
	public void verifyStatusFromPendingToConfirmed() throws Exception 
	{
		

		objSupplier = new SupplierPage();
    objSupplier.pendingBooking();
    Thread.sleep(3000);
    String dataTextexpctd="No data available in table";
    String dataTextactual=driver.findElement(By.xpath("//*[@id='data']/tbody/tr/td")).getText();
    if(dataTextexpctd==dataTextactual)
    {
    	
    	System.out.println("no record found");
    }
    else
    {
       System.out.println("change status from pending to confirmed");
    
    }
    objSupplier.dashboard();
    }
	@Test(priority=6)
	public void verifyFlightLink() throws Exception 
	{
		

		objSupplier = new SupplierPage();
       
        objSupplier.flight();
        Thread.sleep(3000);
    
	
}
	@Test(priority=7)
	public void verifyToursLink() throws Exception 
	{
		

		objSupplier = new SupplierPage();
        objSupplier.tours();
        Thread.sleep(3000);
    
	
}
	@Test(priority=8)
	public void verifyVisaLink() throws Exception 
	{
		

		objSupplier = new SupplierPage();
        objSupplier.visa();
        Thread.sleep(3000);
    
	
}
	@Test(priority=9)
	public void verifyBookingsLink() throws Exception 
	{
		

		objSupplier = new SupplierPage();
     
        objSupplier.bookingPage();
       
        Thread.sleep(3000);
        
         driver.navigate().back();
	
}
}