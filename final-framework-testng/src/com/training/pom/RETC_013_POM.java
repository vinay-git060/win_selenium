package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_013_POM {
	private WebDriver driver; 
	
	public RETC_013_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//------------------- WEB ELEMENTS  --------------------
	
	//@FindBy(xpath="//span[contains(@class, 'display-name')]")
	//private WebElement adminMenu;
	
	@FindBy(xpath="//*[text()='Users']//parent::div")
	private WebElement usersLink;
	
	@FindBy(xpath="//*[@id='menu-users']/ul/li[4]/a")
	private WebElement myProfile;
	
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//*[@id='phone']")
	private WebElement phoneNo;
	
	@FindBy(xpath="//*[@id='submit']")
	private WebElement submit;
		
	@FindBy(xpath="//*[@id='message']/p/strong")
	private WebElement profileUpdatedMesg;
	
	//----------------------- METHODS --------------------------
		
	public void clickusersLink()
	{
		this.usersLink.click();
	}
	
	public void clickmyProfile()
	{
		this.myProfile.click();
	}
	
	public void sendLastName(String lastName)
	{
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		
	}
	
	public void sendphoneNo(String phoneNo)
	{
		this.phoneNo.clear();
		this.phoneNo.sendKeys(phoneNo);
	}
	
	public void clickSubmit()
	{
		this.submit.click();
	}
	
	public void getprofileUpdatedMesg()
	{
		String updated1= profileUpdatedMesg.getText();
		System.out.println(updated1);
	}
	
	
}
