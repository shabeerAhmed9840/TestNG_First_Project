package multiplebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends M{
	public static void main(String[] args) {
		M m=new M();
		m.chooseBrowser();
		m.geturl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("xyz@gmail.com");

		
	}

}
