package com.PhpTravels.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBaseSupplier 
{
	public static WebDriver driver=null;
	public static Properties prop;
	public static String driverPath=System.getProperty("user.dir")+"\\driver99\\chromedriver.exe";
    public void TestBase()
{
	
prop=new Properties();
try
{
	  FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
              + "/config.properties");
      //Below line of code will load the property file
      prop.load(ip);
     } 
  catch (FileNotFoundException e) 
    {
      e.printStackTrace();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
 }
	
    
 @BeforeTest
  public void onSetup() throws InterruptedException
	 {
      TestBase(); // for loading the configurations
     String browserName = prop.getProperty("browser");

      if (browserName.equals("chrome"))
      {
      	System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();

      }
else if (browserName.equals("firefox"))
      {
      	//geckodriver
      	System.setProperty("webdriver.gecko.driver", driverPath);
          driver = new FirefoxDriver();
      }
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// asking the driver to wait maximum 30 sec before throwing an exception
      driver.get(prop.getProperty("urlsupplier"));
      driver.manage().window().maximize(); 
      Thread.sleep(3000);
     
		
	}
 	  
}
