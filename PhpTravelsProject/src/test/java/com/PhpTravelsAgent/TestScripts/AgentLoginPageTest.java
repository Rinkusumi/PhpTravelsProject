package com.PhpTravelsAgent.TestScripts;

import org.testng.annotations.Test;

import com.PhpTravels.TestBase.TestBaseAgent;
import com.PhpTravels.utilities.ExcelUtility;
import com.PhpTravelsCustomer.Pages.CustomerLoginPage;
import com.phpTravelsAgent.Pages.AgentLoginPage;

public class AgentLoginPageTest extends TestBaseAgent
{
	AgentLoginPage objLoginAgent= new AgentLoginPage();
	@Test(priority=1)
	public void verifyInValidLogin() throws Exception 
	{
		
	//Create Login Page object
	objLoginAgent = new AgentLoginPage();
	
    Thread.sleep(3000);
	String username = ExcelUtility.getCellData(4, 0);
	String password = ExcelUtility.getCellData(4, 1);
	objLoginAgent.setUserName(username);
	Thread.sleep(2000);
	objLoginAgent.setpassWord(password);
	objLoginAgent.login();
	Thread.sleep(2000); 
	}
	@Test(priority=2)
	public void verifyValidLogin() throws Exception 
	{
		
	//Create Login Page object
		objLoginAgent= new AgentLoginPage();
	//login to application
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(5, 0);
	String password = ExcelUtility.getCellData(5, 1);
	objLoginAgent.setUserName(username);
	Thread.sleep(3000);
	objLoginAgent.setpassWord(password);
	objLoginAgent.login();
	Thread.sleep(2000); 
	}	
	

}
