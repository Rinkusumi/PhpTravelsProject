package com.PhpTravels.Modules;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.TestBase.TestBase;

public class AgentModule extends TestBase
{
	 @FindBy(xpath="//*[@name='email']")
	   WebElement agentEmail;
	   @FindBy(xpath="//*[@name='password']")
	   WebElement agentPassword;
	   @FindBy(xpath="//*[@type='submit']")
	   WebElement agentBtnSubmit;
	   @FindBy(xpath="//*[@id='fadein']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")
	   WebElement homeBtn;
	   @FindBy(xpath="//*[@id='fadein']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	   WebElement hotelBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	   WebElement flightsBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")
	   WebElement toursBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")
	   WebElement visaBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")
	   WebElement blogsBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a")
	   WebElement offersBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[3]/a")
	   WebElement addFundBtn;
	   @FindBy(xpath="//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[4]/a")
	   WebElement myProfileBtn;
	   @FindBy(xpath="//*[@id='fadein']/div[1]/div/div[3]/ul/li[2]/a")
	   WebElement myBookingBtn;
	   @FindBy(xpath="//*[@id='select2-hotels_city-container']")
	   WebElement textHotel;
	   @FindBy(xpath="//*[@id='submit']")
	   WebElement btnSearch;
	   @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[3]/div/button")
	   WebElement accountBtn;
	   @FindBy(xpath="//*[@id='fadein']/header/div[1]/div/div/div[2]/div/div/div[3]/div/ul/li[5]/a")
	   WebElement logoutBtn;
	   @FindBy(xpath="//*[@id='select2-hotels_city-results']/li")
	   WebElement listHotel;	
	   @FindBy(id="currency")
	   WebElement usd;
	   @FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]//div[2]/div/ul/li[7]/a")
	   WebElement Inr;
	   @FindBy(css=".select2-selection__arrow > b:nth-child(1)")
	   WebElement downarrow;
	   @FindBy(css=".select2-search__field")
	   WebElement city;
	   @FindBy(id="submit")
	   WebElement search;
	   @FindBy(xpath="//*[@id='agents']")
	   WebElement agentLink;
	   @FindBy(xpath="//*[@id='fadein']/header/div[1]/div/div/div[2]/div/div/div[4]/div/ul/li[2]/a")
	   WebElement loginAgentLink;
	   public AgentModule()
		{
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }

	   
	  	public void login() 
		{
		    agentBtnSubmit.click();
		}
		public void start()
		{
			agentLink.click();
			loginAgentLink.click();
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
		public void homeLink()
		{
			 homeBtn.click();  
	    }
		public void hotelLink()
		{
		    hotelBtn.click();  
	    }
		public void flightsLink()
		{
		    flightsBtn.click();  
	    }
		public void toursLink()
		{
		    toursBtn.click();  
	    }
		public void visaLink()
		{
			visaBtn.click();  
	    }
		public void blogsLink()
		{
		    blogsBtn.click();  
	    }
		public void offersLink()
		{
		    offersBtn.click();  
	    }
		public void addFundLink()
		{
			addFundBtn.click();  
	    }
		public void myProfileLink()
		{
		     myProfileBtn.click();  
	    }
		public void myBookingLink()
		{
			
		    myBookingBtn.click();  
	    }
		public void clickUsd() 
		{
	 		  usd.click();
	 	}
	    public void clickinr() 
	    {
	 		Inr.click();
	    }
	 	public void searchHotels() throws InterruptedException 
	 	{
			 hotelBtn.click();
			 downarrow.click();
			 city.sendKeys("Dubai");
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]")).click();
			 Thread.sleep(2000);
			 search.click();
		}
		public void logoutLink()
		{
	     	accountBtn.click();
		    logoutBtn.click();  
	    }
}
