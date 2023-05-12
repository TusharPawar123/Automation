package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("tusharpawar82018@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		//driver.findElement(By.linkText( "  Forgot Password")).click();
		//driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.name("password")).sendKeys("Pawar@123");
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
