package testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Realgrouping extends BaseClass{
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	@AfterClass
	public void quitBrowser() {
		driver.quit();
     }
	@BeforeMethod
	public void startTime() {
		Date d= new Date();
		System.out.println(d);
		}
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
    }
	@Test(groups="smoke")
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("xyz@gmail");
		
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("12345678");
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		}
	@Test(groups="reg")
	public void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("123@gmail");
		
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("abcd");
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		}
	@Test(groups="reg")
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("shabeer@gmail.com");
		
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("hsdjvbdibver");
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		}

}
