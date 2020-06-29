package ScubaJava.ScubaJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest_Git {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Luncing Start");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rkparida\\Desktop\\SCUBA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";

		driver.get(url);
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Lunching Done");
	}

}
