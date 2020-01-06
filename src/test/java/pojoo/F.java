package pojoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;

public class F extends BaseClass{
	public F() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	private WebElement Middlename;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement mob;
	
	@FindBy(xpath="//input[@name='lphone']")
	private WebElement landline;
	
	@FindBy(xpath="//input[@name='emailz']" )
	private WebElement email;
	
	@FindBy(xpath="//input[@name='emailz2']" )
	private WebElement email2;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@name='password2']")
	private WebElement repass;
	
	@FindBy(xpath="//input[@name='wherehear']")
	private WebElement how;
	
	@FindBy(xpath="(//button[@class='btn btn-lg btn-full btn-orange'])[2]")
	private WebElement reg;

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getMiddlename() {
		return Middlename;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getLandline() {
		return landline;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmail2() {
		return email2;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getHow() {
		return how;
	}

	public WebElement getReg() {
		return reg;
	}

}
