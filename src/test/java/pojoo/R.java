package pojoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;

public class R extends LayAwayDemo.BaseClass{
	public R() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement loginpass;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement loginbtn;
	
	@FindBy(xpath="(//a[@class='toggle'])[1]")
	private WebElement rush;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getLoginpass() {
		return loginpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getRush() {
		return rush;
	}
	
	
	
}
