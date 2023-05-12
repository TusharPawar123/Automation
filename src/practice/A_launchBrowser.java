package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.google.com/");

Thread.sleep(2000);
driver.navigate().refresh();
driver.quit();

	}

}
