package com.atmecs.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;

public  class ValidateAllFooter{


	public static void footer(WebDriver driver,FindLocator loc,String[] arr,int count) {
		
		
		
		
	String element1	=CommonUtility.getText(driver, loc.getlocator("sitemapdiv"));
	String[] actual= element1.split("\n");
	int size = arr.length;
	for (int i = 0; i < size; i++) {

	Assert.assertEquals(actual[i], arr[i], "assertion not done");
	System.out.println("Assertion done for sitemap");


       
}

}}
