package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class O_WaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/menu");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

WebElement email= driver.findElement(By.xpath("(//input[@id='email'])[2]"));

WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
w.until(ExpectedConditions.visibilityOf(email));
email.sendKeys("tushar@123");
Thread.sleep(5000);

driver.quit();
	}

}
