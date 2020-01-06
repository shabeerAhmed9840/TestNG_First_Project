package multiplebrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M implements Multi{
static WebDriver driver;
	public void chooseBrowser() {
		Scanner s=new Scanner (System.in);
		System.out.println("Choose the Browsers");
		int i=s.nextInt();
		
		switch (i) {
		case 1:
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case 2:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");
             driver=new ChromeDriver();
             break;
		default:
			System.out.println("no broweser");
			break;
		
	}

}
	public void geturl(String s) {
		driver.get(s);
		
	}

	
		
	}
