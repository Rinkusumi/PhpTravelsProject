package com.PhptravelsSupplier.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBaseSupplier;
import com.phpTravelsSupplier.Pages.SupplierBookingPage;


public class SupplierBookingPageTest extends TestBaseSupplier {

	SupplierBookingPage objBookingSupplier= new SupplierBookingPage();
	@Test(priority=1)
	public void verifyBookingLogin() throws Exception 
	{
		
	//Create Login Page object
	objBookingSupplier = new SupplierBookingPage();
	objBookingSupplier.dashBoard();
    Thread.sleep(3000);
    String confirmCount=driver.findElement(By.xpath("//*[@id='layoutDrawer_content']/main/div/div[2]/div[1]/a/div/div/div/div[1]/div[1]")).getText();
    int actualConfirmVal = Integer.parseInt(confirmCount);
    String pendingCount=driver.findElement(By.xpath("//*[@id='layoutDrawer_content']/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[1]")).getText();
    int actualPendingVal=Integer.parseInt(pendingCount);
    
    
    int newConfirmCount=actualConfirmVal+1;
    
    int newPendingCount=actualPendingVal-1;
    
    String confirmString=String.valueOf(newConfirmCount);
    String pendingString=String.valueOf(newPendingCount);
    objBookingSupplier.pendingBooking();
    
    
}
}