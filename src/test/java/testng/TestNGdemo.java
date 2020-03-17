package testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdemo extends BaseClass {

	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	private void quitBrowser() {
		driver.quit();
	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
		
	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(dataProvider = "sample")
	private void tc1(String s1, String s2) {
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(s1);
		System.out.println(s1);
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys(s2);
		System.out.println(s2);
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
	}

	@DataProvider(name = "sample")
	public Object[][] data() {
		return new Object[][] { { "xyz@gmail.com", "123456" }, { "123@gmail.com", "abcdef" }

		};

	}

}
