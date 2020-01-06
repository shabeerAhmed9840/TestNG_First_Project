package PojoSkate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement mainMensCloth;
	
	@FindBy(xpath="(//a[contains(text(),'Hoodies')])[1]")
	private WebElement menHoode;
	
	@FindBy(xpath="(//a[contains(text(),'Crews')])[1]")
	private WebElement menCrews;
	
	@FindBy(xpath="(//a[contains(text(),'Shirts')])[1]")
	private WebElement menShirt;
	
	@FindBy(xpath="(//a[contains(text(),'Shoes')])[1]")
	private WebElement mainShoe;
	
	@FindBy(xpath="(//a[contains(text(),'Accessories')])[1]")
	private WebElement mainAccess;
	
	

}
