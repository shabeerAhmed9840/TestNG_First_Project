package multiplebrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserlogic {
	static WebDriver driver;

	public static void chooseBrowser() {
		Scanner s = new Scanner(System.in);
		System.out.println("choose the browser");
		int i = s.nextInt();

		switch (i) {
		case 1:
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case 2:
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		default:
			System.out.println("no broweser");
			break;
		}

	}

	public static void getUrl(String s) {
		driver.get(s);

	}

}
