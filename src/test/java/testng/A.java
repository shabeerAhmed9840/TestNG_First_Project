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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class A {
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
		Date d=new Date();
		System.out.println(d);

	}
	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);
    }
	@Ignore
	@Test(groups="smoke")
	public void tc1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

	       driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("xyz@gmail");
		SoftAssert s=new SoftAssert();
		s.assertEquals("xyz@gmail", e.getAttribute("value"));
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("12345678");
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
     }
	
	@Test
	private void tc2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

	       driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("xyz@gmail");
		System.out.println("test case 2");
		
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("12345678");
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();}

	
	@Parameters({"user","pass"}) 
	@Test
	public void tc3(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

	       driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(s1);
		/*SoftAssert s=new SoftAssert();
		s.assertEquals("12@gmail",e.getAttribute("value"));*/
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys(s2);
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		//s.assertAll();


	}
	@Parameters({"user","pass"})
	@Test
	private void tc4(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

	       driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(s1);
		System.out.println("test case four");
		
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys(s2);
		
		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();

	}
	

}
