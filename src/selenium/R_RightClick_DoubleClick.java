package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class R_RightClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/buttons");

WebElement rightclick = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
Actions a = new Actions(driver);
a.contextClick(rightclick).perform();

Thread.sleep(2000);

WebElement dc= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
a.doubleClick(dc).perform();

driver.quit();
	
	
	}

}
