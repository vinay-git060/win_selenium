package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.ELTC47_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC47 {
	private WebDriver driver;
	private String baseUrl;
	private ELTC47_POM ELTC47_POM;
	private static Properties properties;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		ELTC47_POM = new ELTC47_POM(driver); 
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
		ELTC47_POM.clickLoginRegisterBtn();
		Thread.sleep(5000);
		ELTC47_POM.sendUserName("admin");
		ELTC47_POM.sendPassword("admin@123");
		ELTC47_POM.clickLoginBtn(); 
		ELTC47_POM.clickPropertiesbtn();
		ELTC47_POM.clickAddNewBtn();
		ELTC47_POM.getaddPropertyWindowMesg();
		ELTC47_POM.sendEnterTitle("Prestige0001");
		ELTC47_POM.sendEnterText("home town1");
		ELTC47_POM.clickpublishBtn();
		ELTC47_POM.viewPostMesg(); //Post published. View post displayed in Console
	
	}
}
