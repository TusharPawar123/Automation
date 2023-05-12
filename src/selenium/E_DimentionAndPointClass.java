package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E_DimentionAndPointClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Dimension d = new Dimension(800,600);
		driver.manage().window().setSize(d);
		
		Point p = new Point(0,200);
		driver.manage().window().setPosition(p);
		
		driver.quit();
	}

}
