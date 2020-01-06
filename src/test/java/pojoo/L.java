package pojoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;

public class L extends LayAwayDemo.BaseClass{
	public L() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//li[@class='loadAccount  '])[1]")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}


}
