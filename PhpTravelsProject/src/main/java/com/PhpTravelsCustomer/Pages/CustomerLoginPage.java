package com.PhpTravelsCustomer.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PhpTravels.TestBase.TestBaseCustomer;
import java.util.Set;
import java.util.Iterator;
public class CustomerLoginPage extends TestBaseCustomer{
	
	
	   @FindBy(xpath="//*[@name='email']")
	   WebElement customerEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement customerPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement customerBtnSubmit;
	   @FindBy(xpath="//div[@class='sidebar-menu-wrap']/ul/li[2]/a")
	   WebElement myBookingLink;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/flights/booking/invoice/0679/3']")
	   WebElement voucherLink;
	   @FindBy(xpath="//div[@class='sidebar-menu-wrap']/ul/li[3]/a")
	   WebElement addFundLink;
	   @FindBy(xpath="//input[@value='paypal']")
	   WebElement radioPaypal;
	   @FindBy(xpath="//button[@type='submit']")
	   WebElement paynowButton;
	   @FindBy(xpath="//img[@src='https://www.phptravels.net/app/themes/default/assets/img/gateways/paypal.png']")
	   WebElement paypalImage;
	   @FindBy(xpath="//div[@class='btn']")
	   WebElement backToInvoiceButton;
	   @FindBy(xpath="//a[@href='https://www.phptravels.net/account/add_funds']")
	   WebElement backButton;
	 
	   @FindBy(xpath="//*[@id='fadein']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/a")
	   WebElement voucherButton;
	   @FindBy(xpath="//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")
	   WebElement myProfileButton;
	   @FindBy(xpath="//input[@name='state']")
	   WebElement textState;
	   @FindBy(xpath="//input[@name='city']")
	   WebElement textCity;
	   @FindBy(xpath="//input[@name='address1']")
	   WebElement textAddress1;
	   @FindBy(xpath="//input[@name='address2']")
	   WebElement textAddress2;
	   @FindBy(xpath="//button[@type='submit']")
	   WebElement btnUpdate;
	   @FindBy(xpath="//*[@id='fadein']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div")
	   WebElement msgSuccess;
	   
	   @FindBy(xpath="//*[@id='fadein']/header/div[1]/div/div/div[2]/div/div/div[3]/div/button")
	   WebElement accountBtn;
	   public CustomerLoginPage()
		{
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
		 public void login() 
		   {
		      customerBtnSubmit.click();

		   }
		
		
		public void setUserName(String strUserName) throws Exception
		{
			
			customerEmail.clear();
		    customerEmail.sendKeys( strUserName);     
	    }
		public void setpassWord(String strPassword)
		{
			
		    customerPassword.clear();
			customerPassword.sendKeys(strPassword);     
	    }
		public void payPal() throws Exception
		{
			
			addFundLink.click();
			Thread.sleep(3000);
			radioPaypal.click();
			Thread.sleep(2000);
			paynowButton.click();
			Thread.sleep(2000);
		    backToInvoiceButton.click();
			Thread.sleep(3000);
			backButton.click();
			Thread.sleep(3000);
		}
		
       public void myBooking() throws Exception
       {
    	   
    	   myBookingLink.click();
    	   Thread.sleep(3000);
    	   String w1 = driver.getWindowHandle();
    	   voucherButton.click();
    	   Thread.sleep(6000);
    	   driver.switchTo(). window(w1);
    	   
    	   }
       public void editProfile() throws Exception
       {
    	   
    	 
    	   myProfileButton.click();    	   
    	   Thread.sleep(3000);
    	   
    	   
       }
       public void setDetails(String strState,String strCity,String strAddrs1,String strAddrs2) throws Exception
		{
			
			textState.clear();
		    textState.sendKeys( strState);
		    textCity.clear();
		    textCity.sendKeys(strCity);

		    textAddress1.clear();
		    textAddress1.sendKeys();
		    textAddress2.clear();
		    textAddress2.sendKeys();
		    Thread.sleep(3000);
		    btnUpdate.click();
		}
}
