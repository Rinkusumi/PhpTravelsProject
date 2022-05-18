package com.PhpTravels.Modules;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBase;

public class AdminModule extends TestBase

{
	   @FindBy(xpath="//*[@name='email']")
	   WebElement adminEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement adminPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement btnSubmit;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/bookings']")
	   WebElement bookingLink;
	   @FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[14]/a")
	   WebElement invoiceLink;
	   @FindBy(xpath="//a[@href='../sd\']")
	   WebElement websiteLink;
	   @FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[15]/button")
	   WebElement deleteBtn;
	   @FindBy(xpath="//*[@id='dashboardBarChart']")
	   WebElement imageLink;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/bookings/pending']")
	   WebElement pendingLink;
	   @FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[11]/select")
	   WebElement pendingBtn;
	   @FindBy(xpath="//*[@id='layoutDrawer_content']/main/div/div[2]/div[1]/a/div/div/div/div[1]/div[1]")
	   WebElement confirm_Count;
	   @FindBy(xpath="//*[@id=\'layoutDrawer_content\']/main/div/div[2]/div[2]/a/div/div/div/div[1]/div[1]")
	   WebElement pending_Count;
	   @FindBy(xpath="//*[@id='data']/tbody/tr[1]/td[11]/select/option[2]")
	   WebElement option;
	   @FindBy(xpath="/html/body/nav/div/a/div")
	   WebElement dashboard;
		public AdminModule()
		{
	      //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
		public void login() 
		{
		     btnSubmit.click();

		}	
		public void setUserName(String strUserName) throws Exception
		{
			adminEmail.clear();
		    adminEmail.sendKeys( strUserName);     
	    }
		public void setpassWord(String strPassword)
		{
		    adminPassword.clear();
			adminPassword.sendKeys(strPassword);     
	    }
		public void bookingLink() 
	    {
			bookingLink.click();
		}
		public void invoiceLink() throws Exception 
		{
			String w1 = driver.getWindowHandle();
			invoiceLink.click();
			Thread.sleep(6000);
			System.out.println("Display invoice");
			driver.switchTo(). window(w1);
		
		}
		public void deleteButton() throws Exception 
		{
			
			deleteBtn.click();
			Thread.sleep(3000);
		    driver.switchTo().alert().dismiss();

		}
		public void previous_StatusRecord()
		{
			String stPending=pending_Count.getText();
			String stConfirm=confirm_Count.getText();
			System.out.println("Confirm Booking Count Before Changing Staus: "+stConfirm);
			System.out.println("Pending Booking Count Before Changing Staus: "+stPending);
			
		}
		public void changeBookingStatus() throws Exception 
		{
			
			pendingLink.click();
			Thread.sleep(3000);
		    pendingBtn.click();
		    option.click();
		    Thread.sleep(3000);
		   
		}
		public void dashboardLink() 
		{
			
			dashboard.click();

		}
		public void after_StatusRecord()
		{
		     String stPending=pending_Count.getText();
		     String stConfirm=confirm_Count.getText();
		     System.out.println("Confirm Booking Count after Changing Staus: "+stConfirm);
		     System.out.println("Pending Booking Count after Changing Staus: "+stPending);
		}  
		public void websiteLinkCheck() throws Exception
		{
			 String w1 = driver.getWindowHandle();
			 websiteLink.click();
	 	     Thread.sleep(6000);
	 	     driver.switchTo(). window(w1);
	 	     Thread.sleep(3000);
				
			
		}
		

}
