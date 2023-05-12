package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E1_DimentionAndPointClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.google.com/");

Dimension s= new Dimension(600,800);
driver.manage().window().setSize(s);

Point p = new Point(0,600);
driver.manage().window().setPosition(p);

Thread.sleep(2000);

driver.navigate().refresh();

driver.quit();


	}

}
