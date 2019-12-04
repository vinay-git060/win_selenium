package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.RETC_015_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_015 {
	private WebDriver driver; 
	String baseUrl;
	private RETC_015_POM RETC_015_POM;
	private static Properties properties;
	//private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RETC_015_POM = new RETC_015_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		RETC_015_POM.clickLoginRegisterBtn();
		Thread.sleep(5000);
		RETC_015_POM.sendUserName("admin");
		RETC_015_POM.sendPassword("reva32145678910@");
		RETC_015_POM.clickLoginBtn(); 
		Thread.sleep(3000);
		
		//Mouse Hover on 1admin menu
		RETC_015_POM.mouseHoverAdminMenu();
		
		//click on logout Button
		RETC_015_POM.clicklogOutBtn(); 
		
		
	}
}
