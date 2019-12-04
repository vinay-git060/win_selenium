package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_014_POM {
private WebDriver driver; 
	
	public RETC_014_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//------------------- WEB ELEMENTS  --------------------
	
	@FindBy(xpath="//*[text()='Users']//parent::div")
	private WebElement usersLink;
	
	@FindBy(xpath="//*[@id='menu-users']/ul/li[4]/a")
	private WebElement myProfile;
	
	@FindBy(xpath="//*[@id='password']/td/button")
	private WebElement generatePwd;
	
	@FindBy(xpath="//*[@id='pass1-text']")
	private WebElement newPwd;
		
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
	
	public void clickgeneratePwd()
	{
		this.generatePwd.click();
	}
	
	public void sendnewPwd(String newPwd)
	{
		this.newPwd.sendKeys();
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
