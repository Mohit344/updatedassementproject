package com.atmecs.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.constant.FileConstant;

public class Driver_Class {
	/**
	 *switch case is created for the browsers-chrome,firefox.
	 * @throws IOException
	 */
	public static WebDriver driver;// remove it when use the extent report



@BeforeTest
	public void configSetup() throws IOException {

		File file = new File(FileConstant.config);// change the file path
		
		
		Properties promote = property_return(file);
		switch (promote.getProperty("webdrivername")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", FileConstant.chromeexe);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", FileConstant.firefoxexe);
			driver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver",FileConstant.ieexe);
			driver = new InternetExplorerDriver();
			break;


		}
		driver.get(promote.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	/**
	 * method-property_return
	 * @param file
	 * @return
	 * @throws IOException
	 */

	public Properties property_return(File file) throws IOException {
		Properties prop1 = new Properties();
		FileInputStream input = new FileInputStream(file);
		prop1.load(input);
		return prop1;
	}


}
