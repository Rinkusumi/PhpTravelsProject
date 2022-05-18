package com.phpTravelsSupplier.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBaseSupplier;

public class SupplierBookingPage extends TestBaseSupplier
{
	
	 @FindBy(xpath="//a[@href='https://www.phptravels.net/api/supplier/bookings']")
	   WebElement bookingLink;
	 @FindBy(xpath="//a[@href='https://www.phptravels.net/api/supplier']")
	    WebElement dashboardLink;
	 @FindBy(xpath="//*[@id='layoutDrawer_content']/main/div/div[2]/div[1]/a/div/div/div/div[1]/div[1]")
	    WebElement confirmCount;
	 @FindBy(xpath="//*[@id='layoutDrawer_content']/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[1]")
	 WebElement pendingCount;
	 @FindBy(xpath="//a[@href='https://www.phptravels.net/api/supplier/bookings/pending']")
	 WebElement pendingLink;
	//*[@id='data']/tbody/tr[1]/td[10]/select
	 
	 public SupplierBookingPage()
		{
	        
	        PageFactory.initElements(driver, this);
	        
	    }
		 public void dashBoard() 
		   {
			 dashboardLink.click();

		   }
		 public void pendingBooking() 
		   {
			 pendingLink.click();

		   }
		 
}
