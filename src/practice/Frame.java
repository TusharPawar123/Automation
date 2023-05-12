package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		
		driver.switchTo().frame("leftBottom");
		driver.findElement(By.xpath("(//span[@class='interfaceName'])[1]")).click();
	}
	
}
