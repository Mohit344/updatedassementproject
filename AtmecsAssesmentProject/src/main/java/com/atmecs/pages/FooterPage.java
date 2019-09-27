package com.atmecs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.constant.FindLocator;
import com.atmecs.validation.ValidationMethod;

public class FooterPage {
	
	static String  strart1;
    static String strart2;
    static String strvr1;
    static String strvr2;
    static String strblk1;
    static String strblk2;
    static String strrbk1;
    static String strrbk2;
    static String strriot1;
    static String strriot2;
    
    
	
	
	public static void  footer(WebDriver driver) {
		
		
		
		Actions action = new Actions(driver);

		WebElement wb2 = driver.findElement(By.xpath("(//a[contains(.,'Home')])[1]"));
		System.out.println(wb2.getText());
		action.moveToElement(wb2).build().perform();
		//a[contains(.,'About Us')])[1]

		WebElement wbhm = driver.findElement(By.xpath("(//a[contains(.,'Home')])[1]"));
		System.out.println(wbhm.getText());
		action.moveToElement(wbhm).build().perform();


		WebElement wbab = driver.findElement(By.xpath("(//a[contains(.,'About Us')])[1]"));
		System.out.println(wbab.getText());
		action.moveToElement(wbab).build().perform();



		WebElement wbpart = driver.findElement(By.xpath("(//a[contains(.,'Partners')])[1]"));
		System.out.println(wbpart.getText());
		action.moveToElement(wbpart).build().perform();



		WebElement wbcarr = driver.findElement(By.xpath("(//a[contains(.,'Careers')])[1]"));
		System.out.println(wbcarr.getText());
		action.moveToElement(wbcarr).build().perform();



		WebElement wbcontact = driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]"));
		System.out.println(wbcontact.getText());
		action.moveToElement(wbcontact).build().perform();
		

		
		
		
		WebElement getsite = driver.findElement(By.xpath("//h3[contains(.,'Sitemap')]"));// get the text
	String strsite = getsite.getText();
	System.out.println(strsite);
//	JavascriptExecutor je = (JavascriptExecutor) driver;
//	je.executeScript("arguments[0].scrollIntoView(true);", getsite);
//	
	WebElement getservice1 = driver.findElement(By.xpath("(//a[contains(.,'Services')])[1]"));// get the car2 picktime
	String strservice1 = getservice1.getText();
	System.out.println(strservice1);
	
	WebElement getservice = driver.findElement(By.xpath("//h3[contains(.,'Services')]"));// get the car2 picktime
	String strservice = getservice.getText();
	System.out.println(strservice);
	
	WebElement getcarrer = driver.findElement(By.xpath("//h3[contains(.,'Careers')]"));// get the car2 picktime
	String strcarrer = getcarrer.getText();
	System.out.println(strcarrer);
	
	WebElement getconatct1 = driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]"));// get the car2 picktime
	String strcontact1 = getconatct1.getText();
	System.out.println(strcontact1);	
    
	
	WebElement getconatct = driver.findElement(By.xpath("//h3[contains(.,'Contact Us')]"));// get the car2 picktime
	String strcontact = getconatct.getText();
	System.out.println(strcontact);
	
	WebElement getcarr1 = driver.findElement(By.xpath("(//a[contains(.,'Careers')])[1]"));// get the car2 picktime
	String strcarrer1 = getcarr1.getText();
	System.out.println(strcarrer1);
    
	WebElement gethome = driver.findElement(By.xpath("(//a[contains(.,'Home')])[2]"));
	String strhome= gethome.getText();
	WebElement gethome1 = driver.findElement(By.xpath("(//a[contains(.,'Home')])[1]"));
   String strhome1= gethome1.getText();
    
   WebElement getabot1 = driver.findElement(By.xpath("(//a[contains(.,'About Us')])[1]"));
   String strabt1= getabot1.getText();
   WebElement getabot2 = driver.findElement(By.xpath("(//a[contains(.,'About Us')])[2]"));
   String strabt2= getabot2.getText();
   
   WebElement getpart1 = driver.findElement(By.xpath("(//a[contains(.,'Partners')])[1]"));
   String strpart1= getpart1.getText();
   
   WebElement getpart2 = driver.findElement(By.xpath("(//a[contains(.,'Partners')])[2]"));
   String strpart2= getpart2.getText();
   
   WebElement getnews1= driver.findElement(By.xpath("(//a[contains(.,'News')])[1]"));
   String strnew1= getnews1.getText();
   WebElement getnews2= driver.findElement(By.xpath("(//a[contains(.,'News')])[2]"));
   String strnew2= getnews2.getText();
   
   
   
		   WebElement getartif1= driver.findElement(By.xpath("(//a[contains(.,'Artificial Intelligence / Machine Learning')])[1]"));
		  strart1= getartif1.getText();
		   
		   
   WebElement getartif2= driver.findElement(By.xpath("(//a[contains(.,'Artificial Intelligence / Machine Learning')])[2]"));
 strart2= getartif2.getText();
   
   
   WebElement getvr1= driver.findElement(By.xpath("(//a[contains(.,'Augmented Reality / Virtual Reality')])[1]"));
    strvr1= getvr1.getText();
   WebElement getvr2= driver.findElement(By.xpath("(//a[contains(.,'Augmented Reality / Virtual Reality')])[2]"));
    strvr2= getvr2.getText();
	
  
   
		   WebElement getblk1= driver.findElement(By.xpath(" (//a[contains(.,'Blockchain')])[1]"));
		   strblk1= getblk1.getText();
		   
		   WebElement getblk2= driver.findElement(By.xpath(" (//a[contains(.,'Blockchain')])[2]"));
		    strblk2= getblk2.getText();
		 //  (//a[contains(.,'Robotic Process Automation & ChatBOTs')])[1]
				   WebElement getrbk1= driver.findElement(By.xpath(" (//a[contains(.,'Robotic Process Automation & ChatBOTs')])[1]"));
				   strrbk1= getrbk1.getText();
				   WebElement getrbk2= driver.findElement(By.xpath(" (//a[contains(.,'Robotic Process Automation & ChatBOTs')])[2]"));
				   strrbk2= getrbk2.getText();
			//	   (//a[contains(.,'Internet of Things')])[1] 
	  WebElement getiot1= driver.findElement(By.xpath("(//a[contains(.,'Internet of Things')])[1]"));
	 strriot1= getiot1.getText();		   
		WebElement getiot2= driver.findElement(By.xpath("(//a[contains(.,'Internet of Things')])[2]"));
		 strriot2= getiot2.getText();	
						   
				   
				   
				   
//	ValidationMethod.verify(strsite,  Sitemap, "not match");
    ValidationMethod.verify(strservice, strservice1,"not match");
	ValidationMethod.verify(strcarrer, strcarrer1, "not match");
	ValidationMethod.verify(strcontact, strcontact1, "not match");
	ValidationMethod.verify(strhome1, strhome1, "notmatch");
	ValidationMethod.verify(strabt1, strabt2, "not match");
	ValidationMethod.verify(strpart1, strpart2, "not match");
	ValidationMethod.verify(strnew1, strnew2, "not match");
	ValidationMethod.verify(strart1, strart2, "not match");
	ValidationMethod.verify(strvr1, strvr2, "not match");
   ValidationMethod.verify(strblk1, strblk2, "not match");
   ValidationMethod.verify(strrbk1, strrbk2, "not match");
   ValidationMethod.verify(strriot1, strriot2, "not match");
   
   
   
   
   
	
	
	
	
	
	





	
	
	
	
	
		
		
	
		
	}

}
