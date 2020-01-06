package testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	WebDriver driver;

	@BeforeClass
	private void launch() {

	}

	@AfterClass
	private void quit() {
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
	
	  @Test(groups="start") public void ff() { System.setProperty(
	  "webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe"
	  );
	  
	  driver=new ChromeDriver(); driver.get("https://www.facebook.com/");
	  WebElement e = driver.findElement(By.id("email")); e.sendKeys("xyz@gmail");
	  
	  WebElement f = driver.findElement(By.id("pass")); f.sendKeys("12345678");
	  
	  WebElement l = driver.findElement(By.id("loginbutton")); l.click(); }
	 

	@Test(dataProvider = "sample")
	private void tc2(String s1, String s2, String s3, String s4) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(s1);

		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys(s2);

		WebElement g = driver.findElement(By.name("firstname"));
		g.sendKeys(s3);

		WebElement h = driver.findElement(By.name("lastname"));
		h.sendKeys(s4);

		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();

	}

	@DataProvider(name = "sample")
	public Object[][] data() {
		return new Object[][] { { "fghj", "vbnm,", "dfgh", "wertyu" }, 
								{ "zxcvb", "bnm", "[pkjnh", "sdf" }

		};
	}

}
