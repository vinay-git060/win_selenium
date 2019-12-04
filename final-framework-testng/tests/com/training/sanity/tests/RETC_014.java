package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM;
import com.training.pom.RETC_013_POM;
import com.training.pom.RETC_014_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_014 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RETC_013_POM RETC_013_POM;
	private RETC_014_POM RETC_014_POM;
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
		loginPOM = new LoginPOM(driver); 
		RETC_013_POM = new RETC_013_POM(driver);
		RETC_014_POM = new RETC_014_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.clickLoginRegisterBtn();
		Thread.sleep(5000);
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		//1. Click on the user Hyper link
		RETC_013_POM.clickusersLink();
		Thread.sleep(3000);
		//2. Click on My Profile link
		RETC_013_POM.clickmyProfile();
		//3. Click on Generate Password button
		RETC_014_POM.clickgeneratePwd();
		//4. Enter valid credentials in New Password textbox
		RETC_014_POM.sendnewPwd("admin@123");
		//5. Click on Update Profile button
		RETC_014_POM.clickSubmit();
		//Capture the profile updated message
		RETC_014_POM.getprofileUpdatedMesg();
		
				
	}
	
	
	
}
