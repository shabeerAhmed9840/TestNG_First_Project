package pojoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;



public class PageFirst extends LayAwayDemo.BaseClass {
	
	public PageFirst() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(text(),'My Details')])[2]")
	private WebElement mydet;
	
	@FindBy(xpath="(//a[contains(text(),'Design Your Own')])[6]")
	private WebElement mydesign;
	
	@FindBy(xpath="//a[contains(text(),'Vouchers')]")
	private WebElement voucher;
	
	@FindBy(xpath="(//a[contains(text(),'Change Password')])[4]")
	private WebElement changepassword;
	
	@FindBy(xpath="(//a[contains(text(),' Holidays ')])[1]")
	private WebElement holiday;
	
	@FindBy(xpath="(//a[contains(text(),'Cruises')])[1]")
	private WebElement curise;
	@FindBy(xpath="(//a[contains(text(),'Information')])[1]")
	private WebElement info;
	
	@FindBy(xpath="(//a[contains(text(),'Hi, King')])[1]")
	private WebElement profile;

	public WebElement getMydet() {
		return mydet;
	}

	public WebElement getMydesign() {
		return mydesign;
	}

	public WebElement getVoucher() {
		return voucher;
	}

	public WebElement getChangepassword() {
		return changepassword;
	}

	public WebElement getHoliday() {
		return holiday;
	}

	public WebElement getCurise() {
		return curise;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getProfile() {
		return profile;
	}

	
	

}
