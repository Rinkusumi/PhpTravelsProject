package com.PhpTravelsAdmin.Pages;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBaseAdmin;

public class AdminLoginPage extends TestBaseAdmin

{


	   @FindBy(xpath="//*[@name='email']")
	   WebElement adminEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement adminPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement btnSubmit;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/bookings']")
	   WebElement bookingLink;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/api/../hotels/booking/invoice/5873/13']")
	   WebElement invoiceLink;
	   @FindBy(xpath="//a[@href='../sd\']")
	   WebElement websiteLink;
	   @FindBy(xpath="//*[@id='data']/tbody/tr[4]/td[14]/button")
	   WebElement deleteBtn;
	   @FindBy(xpath="//*[@id='dashboardBarChart']")
	   WebElement imageLink;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/bookings/pending']")
	   WebElement pendingLink;
		public AdminLoginPage()
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
			// TODO Auto-generated method stub
			adminEmail.clear();
		
			adminEmail.sendKeys( strUserName);     
	    }
		public void setpassWord(String strPassword)
		{
			// TODO Auto-generated method stub
		    adminPassword.clear();
			adminPassword.sendKeys(strPassword);     
	    }
		
		
		public void bookingLink() 
		   {
			
			bookingLink.click();

		}
		public void invoiceLink() throws Exception 
		   {
	       
			invoiceLink.click();
			Thread.sleep(3000);
			
		  }
		public void deleteButton() throws Exception 
		   {
			
			deleteBtn.click();
			Thread.sleep(3000);
		
			driver.switchTo().alert().dismiss();

		}
		

		public void websiteLinkCheck() throws Exception
		{
			Thread.sleep(3000);
			websiteLink.click();	
			
		}
		

}
