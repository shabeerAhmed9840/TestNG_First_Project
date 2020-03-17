package sk8Clothings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testng.BaseClass;

public class SkateClothings extends BaseClass {
	public static void main(String[] args) {
		launch("https://www.sk8clothing.com/");
		click(driver.findElement(By.xpath("//a[contains(text(),'Login')]")));
		fill(driver.findElement(By.xpath("//input[@id='email']")), "Ahmedshabeer1996@gmail.com");
		fill(driver.findElement(By.xpath("//input[@id='pass']")), "9840585752msA");
		click(driver.findElement(By.xpath("//input[@id='sign']")));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		movetoElement(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")));
		click(driver.findElement(By.xpath("(//a[contains(text(),'Hoodies')])[1]")));
		click(driver.findElement(By.xpath("(//div[contains(text(),'Crooks')])[1]")));
		windowHandel(driver);
		click(driver.findElement(By.xpath("//label[text()='M']")));
		click(driver.findElement(By.xpath("//button[@id='add2cart']")));
		List<WebElement> no = driver.findElements(By.tagName("iframe"));
		int size = no.size();
		System.out.println(size);

		//WebElement frame = driver
				//.findElement(By.xpath("//iframe[@src='//www.sk8clothing.com/shopping-cart.php?popup=true']"));
		driver.switchTo().frame(0);
		click(driver.findElement(By.xpath("(//button[@class='btn_red'])[1]")));
		fill(driver.findElement(By.xpath("//textarea[@id='comment']")), "java is good for brain");
		click(driver.findElement(By.xpath("//input[@value='Checkout']")));
		click(driver.findElement(By.xpath("//span[text()='Leave Us Feedback']")));

	}

}
