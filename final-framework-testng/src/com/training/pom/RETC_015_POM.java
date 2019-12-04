package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_015_POM {

private WebDriver driver; 
	
	public RETC_015_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	//------------------- WEB ELEMENTS  --------------------
	
	@FindBy(className="sign-in")
	private WebElement loginOrRegisterBtn;
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn; 
	
	//Xpath to mouse Hover Admin menu
	@FindBy(xpath="//span[contains(@class, 'display-name')]")
	private WebElement adminMenu;
	
	//Click on logout button
	
	@FindBy(xpath="//*[@id='wp-admin-bar-logout']/a")
	private WebElement logOut;
	
	//----------------------- METHODS --------------------------
	
	public void clickLoginRegisterBtn() {
		this.loginOrRegisterBtn.click(); 
	}	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void mouseHoverAdminMenu() {
						
	}
	
	public void clicklogOutBtn() {
		this.logOut.click(); 
	}
	
	
	
}
