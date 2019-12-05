package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.ELTC48_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC48 {
	private WebDriver driver;
	private String baseUrl;
	private ELTC48_POM ELTC48_POM;
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
		ELTC48_POM = new ELTC48_POM(driver); 
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
		ELTC48_POM.clickLoginRegisterBtn();
		Thread.sleep(5000);
		ELTC48_POM.sendUserName("admin");
		ELTC48_POM.sendPassword("admin@123");
		ELTC48_POM.clickLoginBtn(); 
		ELTC48_POM.clickPropertiesbtn();
		ELTC48_POM.clickAddNewBtn();
		ELTC48_POM.clickregionBtn();
		ELTC48_POM.sendaddText("Electronic City");
		ELTC48_POM.clickPropertiesbtn();
		ELTC48_POM.clickAddNewBtn();
		ELTC48_POM.sendEnterTitle("Prestige01");
		ELTC48_POM.sendEnterText("home town01");
		ELTC48_POM.clickpublishBtn();
		ELTC48_POM.viewPostMesg(); //Post published. View post displayed in Console
	
	}
}
