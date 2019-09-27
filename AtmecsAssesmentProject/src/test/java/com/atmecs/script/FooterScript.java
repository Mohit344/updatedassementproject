package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.FooterPage;

public class FooterScript extends Driver_Class {
	@Test(priority = 1)
	public void footerScript()
	{
		
		FooterPage.footer(driver);;
		
	}
	

}
