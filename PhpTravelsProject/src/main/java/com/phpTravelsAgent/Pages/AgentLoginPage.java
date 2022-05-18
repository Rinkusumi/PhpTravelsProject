package com.phpTravelsAgent.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBaseAgent;

public class AgentLoginPage extends TestBaseAgent
{
	 @FindBy(xpath="//*[@name='email']")
	   WebElement agentEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement agentPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement agentBtnSubmit;
	   
	   public AgentLoginPage()
		{
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }

	   
	  		 public void login() 
		   {
		      agentBtnSubmit.click();

		   }
		
		
		public void setUserName(String strUserName) throws Exception
		{
			
			agentEmail.clear();
		    agentEmail.sendKeys( strUserName);     
	    }
		public void setpassWord(String strPassword)
		{
			
		    agentPassword.clear();
			agentPassword.sendKeys(strPassword);     
	    }
		

}
