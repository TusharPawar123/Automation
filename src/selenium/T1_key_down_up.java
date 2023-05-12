package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T1_key_down_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement tb = driver.findElement(By.xpath("//input[@type='text']"));
		
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.SHIFT).build().perform();
		tb.sendKeys("t");
		
		a.keyUp(Keys.SHIFT).build().perform();
		tb.sendKeys("ushar");
		
		
		driver.quit();
		
	}

}
