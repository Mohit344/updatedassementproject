package com.atmecs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;


public class FooterShow {
	
	public static  void  footerShow(int count,WebDriver driver,FindLocator loc,String[] arr)
	{

	switch (count) {
	case 1:
	WebElement wb = CommonUtility.getElement(loc.getlocator("sitemapdiv"));
	ValidateAllFooter.footer(driver, loc, arr, count);
	break;
	

	case 2:
	WebElement wb2 = CommonUtility.getElement(loc.getlocator("servicesdiv"));
	ValidateAllFooter.footer(driver, loc, arr, count);
	break;
	case 3:
	WebElement wb3 = CommonUtility.getElement(loc.getlocator("carrerdiv"));
	ValidateAllFooter.footer(driver, loc, arr, count);
	break;
	case 4:
	WebElement wb4 = CommonUtility.getElement(loc.getlocator("conatctdiv"));
	ValidateAllFooter.footer(driver, loc, arr, count);
	break;

	default:

	}}

}
