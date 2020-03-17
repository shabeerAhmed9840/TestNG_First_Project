package parallelDemo;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testng.BaseClass;

public class MainDemo extends BaseClass {

	@BeforeClass
	public void startBrowser() {
		// launch("https://www.facebook.com/");
	}

	@AfterClass
	public void quitBrowser() {
		// driver.quit();
	}

	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc1() {
		launch("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("xyz@gmail");

		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("12345678");

		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		System.out.println(Thread.currentThread().getId());
		driver.quit();

	}

	@Test
	public void tc2() {
		launch("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("123@gmail");

		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("abcdef");

		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		System.out.println(Thread.currentThread().getId());
		driver.quit();
	}

	@Test
	public void tc3() {
		launch("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("mustag.s.ahmed@gmail.com");

		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("mynameiscoolkhan");

		WebElement l = driver.findElement(By.id("loginbutton"));
		l.click();
		System.out.println(Thread.currentThread().getId());
		driver.quit();
	}

}
