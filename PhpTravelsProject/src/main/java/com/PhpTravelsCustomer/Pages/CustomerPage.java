package com.PhpTravelsCustomer.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PhpTravels.TestBase.TestBaseCustomer;

public class CustomerPage extends TestBaseCustomer

{
	@FindBy(xpath="//a[@href='https://www.phptravels.net/account/bookings']")
	WebElement myBookingLink;
	@FindBy(xpath="//a[@href='https://www.phptravels.net/flights/booking/invoice/0679/3']")
	WebElement voucherLink;
}
