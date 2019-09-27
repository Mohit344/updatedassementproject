package com.atmecs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.constant.FindLocator;
import com.atmecs.validation.ValidationMethod;

public class ContextMenuPages {
   static String strim2="Infrastructure Management";
   static String strrcld2="Cloud Infrastructure";
   static String strrdev2="Devops";
   static String strrnoc2="NOC Services";
   static String strrdcm2="Data Center Management";
   
   
   
   
	public static void contextMenu(WebDriver driver,FindLocator loc)

	{
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("mohitmohit");
		System.out.println("mohitthttt");
//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//a[contains(.,'Services')])[1]"))));
//
//		
		
		Actions action = new Actions(driver);

		WebElement wb2 = driver.findElement(By.xpath(loc.getlocator("services")));
		System.out.println(wb2.getText());
		action.moveToElement(wb2).build().perform();


		//driver.findElement(By.xpath("")).click();;

		WebElement wb = driver.findElement(By.xpath(loc.getlocator("digitalife")));
		System.out.println(wb.getText());
		action.moveToElement(wb).build().perform();
		
		
		
				WebElement wbdg = driver.findElement(By.xpath(loc.getlocator("digitalife")));
				System.out.println(wbdg.getText());
				action.moveToElement(wbdg).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((loc.getlocator("infrastructureservice")))));

		WebElement wb1 = driver.findElement(By.xpath(loc.getlocator("artificial")));
		System.out.println(wb1.getText());
		action.moveToElement(wb1).build().perform();
		WebElement wbvr = driver.findElement(By.xpath(loc.getlocator("virtualreality")));
		action.moveToElement(wbvr).build().perform();
		WebElement wbblk = driver.findElement(By.xpath(loc.getlocator("blockchain")));
		System.out.println(wbblk.getText());
		action.moveToElement(wbblk).build().perform();
	
		WebElement wbiot = driver.findElement(By.xpath(loc.getlocator("iot")));
		System.out.println(wbiot.getText());
		action.moveToElement(wbiot).build().perform();
		
		WebElement wbinfra = driver.findElement(By.xpath(loc.getlocator("inframangt")));
		System.out.println(wbinfra.getText());
		action.moveToElement(wbinfra).build().perform();
		
		
		
		WebElement wbcld = driver.findElement(By.xpath(loc.getlocator("cloud")));
		System.out.println(wbcld.getText());
		action.moveToElement(wbcld).build().perform();
	
		WebElement wbdevop = driver.findElement(By.xpath(loc.getlocator("deveops")));
		System.out.println(wbdevop.getText());
		action.moveToElement(wbdevop).build().perform();
		
		
		WebElement wbnoc = driver.findElement(By.xpath(loc.getlocator("nocservices")));
		System.out.println(wbnoc.getText());
		action.moveToElement(wbnoc).build().perform();
		
		//a[contains(.,'Data Center Management')]
		
		WebElement wbdatamg = driver.findElement(By.xpath(loc.getlocator("datamng")));
		System.out.println(wbdatamg.getText());
		action.moveToElement(wbdatamg).build().perform();
		
		
		
		
		
		
		  WebElement getimg1= driver.findElement(By.xpath("//a[contains(.,'Infrastructure Management')]"));
			String  strrimgg= getimg1.getText();
		 
			WebElement getcloud1= driver.findElement(By.xpath("//a[contains(.,'Cloud Infrastructure')]"));
			String  strrcld1= getcloud1.getText();
			
			//a[contains(.,'Devops')]
			
			WebElement getdev1= driver.findElement(By.xpath("//a[contains(.,'Devops')]"));
			String  strrdev1= getdev1.getText();
			
			//a[contains(.,'NOC Services')]
			
			WebElement getnocserv1= driver.findElement(By.xpath("//a[contains(.,'NOC Services')]"));
			String  strrnoc1= getnocserv1.getText();
			
			//a[contains(.,'Data Center Management')]
			WebElement getdcm1= driver.findElement(By.xpath("//a[contains(.,'Data Center Management')]"));
			String  strrdcm1= getdcm1.getText();
		
			
			
			
			
			
			
			
		ValidationMethod.verify(FooterPage.strart1, FooterPage.strart2, "not match");
		ValidationMethod.verify(FooterPage.strvr1, FooterPage.strvr2, "not match");
	   ValidationMethod.verify(FooterPage.strblk1, FooterPage.strblk2, "not match");
	   ValidationMethod.verify(FooterPage.strrbk1, FooterPage.strrbk2, "not match");
	   ValidationMethod.verify(FooterPage.strriot1, FooterPage.strriot2, "not match");
	   
	   ValidationMethod.verify(strim2, strrimgg, "not match");
	   
	   ValidationMethod.verify(strrcld2, strrcld1, "not match");
	   
	   ValidationMethod.verify(strrdev2, strrdev1, "not match");
	   
	   
	   ValidationMethod.verify(strrnoc2, strrnoc1, "not match");
	    ValidationMethod.verify(strrdcm2, strrdcm1, "not match");
	  
	   
	   
	  
	
		
		
		
		
	



	}

}
