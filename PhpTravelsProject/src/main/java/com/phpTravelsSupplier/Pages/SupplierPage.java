package com.phpTravelsSupplier.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.PhpTravels.TestBase.TestBaseSupplier;

public class SupplierPage extends TestBaseSupplier
{
	
	   @FindBy(xpath="//*[@name='email']")
	   WebElement supplierEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement supplierPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement supplierBtnSubmit;
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
	   @FindBy(xpath="//*[@id=\"dashboardBarChart\"]")
	   WebElement revenueBreakdown;
	   @FindBy(xpath="//*[@id='data']/tbody/tr[1]/td[11]")
	   WebElement pendingBtn;
	   @FindBy(xpath="//*[@id='data']/tbody/tr[1]/td[11]/select/option[2]")
	   WebElement confirmBtn;
	   @FindBy(xpath="//*[@id='drawerAccordion']/div/div/a[5]")
	   WebElement visaBtn;
	   @FindBy(xpath="//*[@id=\"visamodule\"]")
	   WebElement visaLink;
	   @FindBy(xpath="//*[@id='drawerAccordion']/div/div/a[6]")
	   WebElement toursBtn;
	   @FindBy(xpath="//*[@id=\"drawerAccordionPages\"]/a[1]")          //*[@id="drawerAccordion"]/div/div/a[7]
	   WebElement toursLink;
	   @FindBy(xpath="//*[@id='data']/tbody/tr/td")
	   WebElement noDataText;
	   @FindBy(xpath="//*[@id=\"drawerAccordion\"]/div/div/a[7]")
	   WebElement flightBtn;
	   @FindBy(xpath="//*[@id=\"drawerAccordion\"]/div/div/a[6]")
	   WebElement bookingBtn;
	   
	 
	   public SupplierPage()
		{
	        
	        PageFactory.initElements(driver, this);
	        
	    }
		 public void login() 
		   {
			 supplierBtnSubmit.click();

		   }
		
		
		public void setUserName(String strUserName) throws Exception
		{
			
			supplierEmail.clear();
			supplierEmail.sendKeys( strUserName);     
	    }
		public void setpassWord(String strPassword)
		{
			
			supplierPassword.clear();
			supplierPassword.sendKeys(strPassword);     
	    }
		public void bookingPage() throws Exception 
		   {
			Thread.sleep(3000);
			bookingLink.click();

		   }
		public void revenueBreakdownDisplayed() 
		   {

			 boolean status=revenueBreakdown.isDisplayed();
		     if(status==true)
			 {
				 System.out.println("Revenue breakdown is displayed");
			 }
			 else
			 {
				 
				 Assert.fail("Revenue breakdown is notdisplayed");
			 }
		   }
		
		 public void pendingBooking() throws Exception 
		   {
			 pendingLink.click();
			 
			 Thread.sleep(3000);
		   }
			 public void dashboard()
			 {
             dashboardLink.click();
		   }
		 
		 public void tours() throws Exception
		 {
			boolean tourslinkvisibility=toursBtn.isDisplayed(); 
			boolean tourslinkclickable=toursBtn.isEnabled(); 
			if(tourslinkvisibility==true && tourslinkclickable==true)
			{
				
				System.out.println("element Tours is displayed and can be clicked");
			}
			else
			{
				System.out.println("element Tours is not displayed and cannot  be clicked");
				
			}
			
		
			  
			 
		 }
		 public void visa() throws Exception
		 {
			 if(driver.getPageSource().contains("Visa"))
				{
					
					System.out.println("Element Visa is displayed");
				}
				else
				{
					System.out.println("Element Visa is not displayed");
					
				}
				
			 
		 }
		 
		 public void flight() throws Exception
		 {
			 
				if(driver.getPageSource().contains("Flights"))
				{
					
					System.out.println("Element Flight is displayed");
				}
				else
				{
					System.out.println("Element Flight is not displayed");
					
				}
				
				
				  
				 
			 
		 }
		 
		 public void bookings() throws Exception
		 {
			 if(driver.getPageSource().contains("Flights"))
				{
					
					System.out.println("Element Booking is displayed");
				}
				else
				{
					System.out.println("Element Booking is not displayed");
					
				}
			  bookingBtn.click();
		 }
		
		 

}
