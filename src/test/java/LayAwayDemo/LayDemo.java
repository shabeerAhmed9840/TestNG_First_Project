package LayAwayDemo;

import pojoo.L;
import pojoo.PageFirst;
import pojoo.R;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import LayAwayDemo.BaseClass;

public class LayDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launch("https://www.layawaytravel.com.au/");
		Thread.sleep(5000);
		L l = new L();
		click(l.getLog());
		System.out.println("done");
		R e = new R();
		fill(e.getMail(), "ahmedshabeer1996@gmail.com");
		fill(e.getLoginpass(), "9840585752msA");
		click(e.getLoginbtn());
		Thread.sleep(7000);
		PageFirst f = new PageFirst();
		click(f.getHoliday());
		WebElement asia = driver.findElement(
				By.xpath("//a[@href='https://www.layawaytravel.com.au/layby-holidays/asia/packages.html?id=81']"));
		click(asia);
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl()
				.equals("https://www.layawaytravel.com.au/layby-holidays/asia/packages.html?id=81"));
		System.out.println("passed");
		s.assertAll();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement date = driver.findElement(By.xpath("//div[@id='departdate-F']"));
		click(date);
		WebElement date1 = driver.findElement(By.xpath("(//td[@class='day'])[1]"));
		click(date1);
		WebElement quote = driver.findElement(By.xpath("(//a[@class='btn btn-lg btn-full btn-orange'])[2]"));
		click(quote);
		WebElement flight = driver.findElement(By.xpath("//div[@id='departdate-F']"));
		click(flight);
		WebElement date3 = driver.findElement(By.xpath("//td[@data-date='1593475200000']"));
		click(date3);
		WebElement select = driver.findElement(By.xpath("//select[@name='Select-nights']"));
		Select sx = new Select(select);
		sx.selectByVisibleText("20");
		WebElement botn = driver.findElement(By.xpath("//button[@id='SaveLayby']"));
		// click(botn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", botn);
		System.out.println("i clicked that button");
		windowHandel(driver);
		WebElement adu = driver.findElement(By.xpath("//select[@id='adult-Select-title[1]']"));
		Select se = new Select(adu);
		se.selectByVisibleText("Mr");
		WebElement name = driver.findElement(By.xpath("//input[@id='adult-fname[1]']"));
		fill(name, "shabeer");
		WebElement last = driver.findElement(By.xpath("//input[@id='adult-lname[1]']"));
		fill(last, "Ahmed");
		WebElement datex = driver.findElement(By.xpath("//select[@id='adult-Select-dd[1]']"));
		Select sz = new Select(datex);
		sz.selectByVisibleText("1");

		Select ss = new Select(driver.findElement(By.xpath("//select[@id='adult-Select-mm[1]']")));
		ss.selectByVisibleText("January");

		Select scc = new Select(driver.findElement(By.xpath("//select[@id='adult-Select-yyyy[1]']")));
		scc.selectByVisibleText("1996");

		click(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));

		fill(driver.findElement(By.xpath("//input[@id='email']")), "ahmedshabeer1996@gmail.com");

		fill(driver.findElement(By.xpath("//input[@id='password']")), "9840585752msA");

		click(driver.findElement(By.xpath("(//button[@type='submit'])[4]")));

		click(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		click(driver.findElement(By.xpath("(//h4[@class='mb0 mt8'])[2]")));

	}

	private static BaseClass Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
