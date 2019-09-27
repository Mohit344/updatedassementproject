package com.atmecs.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

import com.atmecs.constant.FindLocator;
import com.atmecs.helper.CommonUtility;
import com.atmecs.validation.DayConversion;
import com.atmecs.validation.ValidationMethod;

public class BlogPages {
	
    static String stringdate="March 15, 2019";
  static String title =  "Debunking Myths about AI";

	public static void blog(WebDriver driver,FindLocator loc)
	{
		
		Actions action = new Actions(driver);
		WebElement wb1 = driver.findElement(By.xpath(loc.getlocator("Insight")));
		System.out.println(wb1.getText());
		action.moveToElement(wb1).build().perform();
		CommonUtility.clickElement(driver,loc.getlocator("blogs"));
		String title1= CommonUtility.getText(driver, loc.getlocator("blogtitle"));
		String date1=CommonUtility.getText(driver, loc.getlocator("datematch"));
		 DayConversion.monthINFormate(stringdate);
		 ValidationMethod.verify(stringdate, date1, "not match");
		 ValidationMethod.verify(title, title1, "not match");
		 
		 DayConversion.monthINFormate(stringdate);
		 
		 String sdate11=DayConversion.monthDifference(stringdate);
		 System.out.println(sdate11);
	
		 LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String t=date.format(formatter);
			System.out.println(t);
			
           
			
			
			
		CommonUtility.clickElement(driver,loc.getlocator("clickonblog"));
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		
	//driver.findElement(By.xpath("(//a[contains(@class,'gitem-link vc-zone-link')])[2]")).click();
//	((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		CommonUtility.clickElement(driver, loc.getlocator("clickcomment"));
		
		CommonUtility.clickElement(driver,loc.getlocator("submitbtn"));
		
		
	
	driver.quit();
		
		
		
		
	}
	
	
	@AfterSuite
	public void endReport(WebDriver driver) {
		driver.quit();// quit the webdriver
		  
}
}

