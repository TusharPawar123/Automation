package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class T_KeyDown_key_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web driver New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement about =
		driver.findElement(By.xpath("//a[text()='About']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(about).keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
