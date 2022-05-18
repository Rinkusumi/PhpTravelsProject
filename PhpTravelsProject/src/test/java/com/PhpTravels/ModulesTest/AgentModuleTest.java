package com.PhpTravels.ModulesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBase;
import com.PhpTravels.utilities.ExcelUtility;
import com.PhpTravels.Modules.AgentModule;

public class AgentModuleTest extends TestBase
{
	AgentModule objAgent= new AgentModule();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		AgentModule objAgent = new AgentModule();
		Thread.sleep(3000);
		String username = ExcelUtility.getCellData(4, 0);
		String password = ExcelUtility.getCellData(4, 1);
		objAgent.setUserName(username);
		Thread.sleep(2000);
		objAgent.setpassWord(password);
		objAgent.login();
		Thread.sleep(2000); 
		String actualTitle=driver.getTitle();
		String exptdTitle="Login - PHPTRAVELS";
		Assert.assertEquals(actualTitle, exptdTitle);
	}
	@Test(priority=2)
	public void verifyValidLogin() throws Exception 
	{
		AgentModule objAgent= new AgentModule();
		Thread.sleep(3000);
		String username = ExcelUtility.getCellData(5, 0);
		String password = ExcelUtility.getCellData(5, 1);
		objAgent.setUserName(username);
		Thread.sleep(3000);
		objAgent.setpassWord(password);
		objAgent.login();
		Thread.sleep(2000); 
		String actualTitle=driver.getTitle();
		String exptdTitle="Dashboard - PHPTRAVELS";
		Assert.assertEquals(actualTitle, exptdTitle);
		System.out.println("Login Successfull");
	}	
	
	@Test(priority=3)
	public void verifyMyBookings() throws Exception 
	{
		objAgent= new AgentModule();
		Thread.sleep(3000);
		objAgent.myBookingLink();
		String actual=driver.getTitle();
		String expctd="Bookings - PHPTRAVELS";
		Assert.assertEquals(actual, expctd);
	 }
	@Test(priority=4)
	public void verifyAddFunds() throws Exception 
	{
        objAgent= new AgentModule();
		objAgent.addFundLink();
		Thread.sleep(2000);
		String actual=driver.getTitle();
		String expctd="Add Funds - PHPTRAVELS";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=5)
	public void verifyMyProfile() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.myProfileLink();
		Thread.sleep(3000);
		String actual=driver.getTitle();
		String expctd="Profile - PHPTRAVELS";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=6)
	public void verifyHome() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.homeLink();
		String actual="https://www.phptravels.net/";
		String expctd=driver.getCurrentUrl();	
		Assert.assertEquals(actual, expctd);
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void verifyHotels() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.hotelLink();
		Thread.sleep(3000);
		String actual="https://www.phptravels.net/hotels";
		String expctd=driver.getCurrentUrl();	
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=8)
	public void verifyFlights() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.flightsLink();
		Thread.sleep(3000);
		String actual=driver.getCurrentUrl();	
		String expctd="https://www.phptravels.net/flights";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=9)
	public void verifyTours() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.toursLink();
		Thread.sleep(3000);
		String actual=driver.getCurrentUrl();	
		String expctd="https://www.phptravels.net/tours";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=10)
	public void verifyVisa() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.visaLink();
		Thread.sleep(3000);
		String actual=driver.getCurrentUrl();	
		String expctd="https://www.phptravels.net/visa";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=11)
	public void verifyBlogs() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.blogsLink();
		Thread.sleep(3000);
		String actual=driver.getTitle();
		String expctd="Blog - PHPTRAVELS";
		Assert.assertEquals(actual, expctd);
	}
	@Test(priority=12)
	public void verifyOffers() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.offersLink();
		Thread.sleep(3000);
		String actual=driver.getTitle();
		String expctd="Offers - PHPTRAVELS";
		Assert.assertEquals(actual, expctd);
	}
	
	/*@Test(priority=13)
	public void verifyHotelSearch() throws Exception 
	{
		objAgent= new AgentModule();
		objAgent.searchHotels();
	}
	*/
	@Test(priority=14)
	public void verifyUpdateUSD() throws Exception 
	{
		objAgent= new AgentModule();
	    Thread.sleep(3000);
		objAgent.clickUsd();
		Thread.sleep(3000);;
		objAgent.clickinr();
         
		//Selecting Items in a Multiple SELECT elements
		//Select currency1 = new Select(driver.findElement(By.id("currency")));
		//currency1.selectByVisibleText("INR");
	   //currency1.selectByIndex(6); 
	}
	
	@Test(priority=15)
	public void verifyLogouts() throws Exception 
	{
		objAgent= new AgentModule();
		Thread.sleep(3000);	
		objAgent.logoutLink();
		String actual="https://www.phptravels.net/login";
		String expctd=driver.getCurrentUrl();	
		Assert.assertEquals(actual, expctd);
	}
}
