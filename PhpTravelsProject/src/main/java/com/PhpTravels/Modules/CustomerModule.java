package com.PhpTravels.Modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBase;

public class CustomerModule extends TestBase
  {
	
	
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
	   @FindBy(xpath="//*[@id='agents']")
	   WebElement agentLink;
	   @FindBy(xpath="//*[@id='fadein']/header/div[1]/div/div/div[2]/div/div/div[4]/div/ul/li[2]/a")
	   WebElement loginAgentLink;
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
	   
	   @FindBy(xpath="//*[@id='fadein']/div[1]/div/div[3]/ul/li[5]/a")
	   WebElement btnLogout;
	   public CustomerModule()
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
			backToInvoiceButton.click();
			Thread.sleep(3000);
			backButton.click();
			Thread.sleep(3000);
			//btnPaypal.sendKeys(Keys.ENTER);
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
		    textState.sendKeys( strState);Thread.sleep(3000);
		    textCity.clear();
		    textCity.sendKeys(strCity);
            JavascriptExecutor js1=(JavascriptExecutor) driver;
            js1.executeScript("window.scrollBy(0,500)", "");
		    textAddress1.clear();
		    textAddress1.sendKeys(strAddrs1);
		    Thread.sleep(3000);
		    textAddress2.clear();
		    textAddress2.sendKeys(strAddrs2);
		    Thread.sleep(3000);
		    JavascriptExecutor exe=(JavascriptExecutor)driver;
		    exe.executeScript("window.scrollBy(0,500)", "");
		    exe.executeScript("arguments[0].click();",btnUpdate);
		    
		}
    
       public void myBookings()
        {
 	        myBookingLink.click();  
        }
       public void myProfile()
        {
 	        myProfileButton.click();  
        }
       public void addFund()
        {
 	        addFundLink.click();  
 	        
        }
       
       public void logout()
        {
 	        btnLogout.click();  
        }
       public void loginPage()
        {
    	    agentLink.click();
    	    loginAgentLink.click();
        }
   
  }



