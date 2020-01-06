package testng;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class First extends BaseClass {
	@BeforeClass
	
	 /* public static void launch() { launch("https://www.sk8clothing.com/"); }
	 */
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

	@AfterClass
	public static void quit() {
		driver.quit();
		System.out.println("i closed the browser");
	}

	@Test
	private void tc1() {
		launch("https://www.sk8clothing.com/");
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		click(login);
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().equals("https://www.sk8clothing.com/user/login.php"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		fill(email, "ahmedshabeer1996@gmail.com");
		String txtemail = email.getAttribute("value");
		s.assertEquals(txtemail, "ahmedshabeer1996@gmail.co");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		fill(pass, "9840585752msA");
		WebElement login1 = driver.findElement(By.xpath("//input[@id='sign']"));
		click(login1);

		WebElement w = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
		WebElement c = driver.findElement(By.xpath("(//a[contains(text(),'Hoodies')])[1]"));
		c.click();
		System.out.println("i have clicked");
		s.assertAll();

	}




  @Test(retryAnalyzer=Second.class) private void tc2() {
  launch("https://www.sk8clothing.com/"); 
  WebElement login =driver.findElement(By.xpath("//a[contains(text(),'Login')]")); 
  click(login);
  SoftAssert s=new SoftAssert();
  s.assertTrue(driver.getCurrentUrl().equals("https://www.sk8clothing.com/user/login.php")); 
  WebElement email =driver.findElement(By.xpath("//input[@id='email']")); 
  fill(email, "ahmedshabeer1996@gmail.com");
  WebElement pass =driver.findElement(By.xpath("//input[@id='pass']")); 
  fill(pass,"9840585752msa"); 
  WebElement login1 = driver.findElement(By.xpath("//input[@id='sign']")); 
  click(login1);
  System.out.println("i ran");
	WebElement w = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(w).perform();
	WebElement c = driver.findElement(By.xpath("(//a[contains(text(),'Hoodies')])[1]"));
	c.click();
	System.out.println("i have clicked");
  
  s.assertAll(); }
 

  @Test private void tc3() {
  
	  launch("https://www.sk8clothing.com/"); 
	  WebElement login =driver.findElement(By.xpath("//a[contains(text(),'Login')]")); 
	  click(login);
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(driver.getCurrentUrl().equals("https://www.sk8clothng.com/user/login.php")); 
	  WebElement email =driver.findElement(By.xpath("//input[@id='email']")); 
	  fill(email, "ahmedshabeer1996@gmail.com");
	  
	  String text = email.getText(); 
	  System.out.println(text); 
	  WebElement pass =driver.findElement(By.xpath("//input[@id='pass']")); 
	  fill(pass,"9840585752msa"); 
	  WebElement login1 = driver.findElement(By.xpath("//input[@id='sign']")); 
	  click(login1);
	  s.assertTrue(driver.getCurrentUrl().equals("https://www.sk8clothing.com/user/account.php"));
	  System.out.println("i ran");
		WebElement w = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
		WebElement c = driver.findElement(By.xpath("(//a[contains(text(),'Hoodies')])[1]"));
		c.click();
		System.out.println("i have clicked");
	  
	  s.assertAll(); }
  
  
  
  }
 