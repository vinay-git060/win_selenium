package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC48_POM {
private WebDriver driver; 
	
	public ELTC48_POM(WebDriver driver) {
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
	
	@FindBy(xpath="//span[contains(@class, 'display-name')]")
	private WebElement adminMenu;
	
	@FindBy(xpath="//*[@id='menu-posts-property']/a/div[3]")
	private WebElement propertiesbtn;
	
	@FindBy(xpath="//*[@id='menu-posts-property']/ul/li[5]/a")
	private WebElement regionBtn;
	
	@FindBy(xpath="//*[@id='tag-name']")
	private WebElement addText;
		
	@FindBy(xpath="//*[@id='wpbody-content']/div[3]/a")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//*[@id='wpbody-content']/div[3]/h1")
	private WebElement addPropertyWindow;
	
	@FindBy(xpath="//*[@id='title']")
	private WebElement enterTitle;
	
	@FindBy(xpath="//*[@id='content']")
	private WebElement enterText;
	
	@FindBy(xpath="//*[@id='publish']")
	private WebElement publishBtn;
	
	@FindBy(xpath="//*[@id='message']/p")
	private WebElement viewPostMesg;
	
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
	
	public void clickPropertiesbtn() {
		this.propertiesbtn.click();
	}
	
	public void clickregionBtn() {
		this.regionBtn.click();
	}
	
	public void sendaddText(String addText) {
		this.addText.sendKeys(addText);
	}
	
	
	public void clickAddNewBtn() {
		this.addNewBtn.click();
	}

	public void getaddPropertyWindowMesg()
	{
		String updated1= addPropertyWindow.getText();
		System.out.println(updated1);
	}
	
	public void sendEnterTitle(String enterTitle) {
		this.enterTitle.clear();
		this.enterTitle.sendKeys(enterTitle);
	}
	
	public void sendEnterText (String enterText) {
		this.enterText.clear();
		this.enterText.sendKeys(enterText);
	}
	
	public void clickpublishBtn() {
		this.publishBtn.click();
		
	}
	
	public void viewPostMesg() {
		String viewMesg= viewPostMesg.getText();
		System.out.println(viewMesg);
	}

	
	
}
