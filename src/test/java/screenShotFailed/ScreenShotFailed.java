package screenShotFailed;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testng.BaseClass;

@Listeners(ListernerForFailed.class)
public class ScreenShotFailed extends BaseClass {

	@BeforeMethod
	public void startBrowser() {
		launch("https://www.facebook.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void testCase1() {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		// Assert.assertEquals("xyz", "zyx", "testcase 1 failed");
		SoftAssert s = new SoftAssert();
		s.assertEquals("xyz", "zyx", "test case 1 fail");
		driver.findElement(By.id("loginbutton")).click();
		s.assertEquals("xyz", "zyx", "test case 1 fail");
		s.assertAll();

	}

	@Test
	public void testCase2() {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		Assert.assertEquals("xyz", "zyx", "testcase 2 failed");
		driver.findElement(By.id("loginbutton")).click();

	}

}
