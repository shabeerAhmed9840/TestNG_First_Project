package PojoSkate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;

public class Login extends BaseClass{
	public Login() {
    PageFactory.initElements(driver, this);	
}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement reg;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='sign']")
	private WebElement clicksignin;

	public WebElement getReg() {
		return reg;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClicksignin() {
		return clicksignin;
	}
	
	
	
	
	

}
