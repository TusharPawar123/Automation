package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/");
		
		WebElement MO = driver.findElement(By.xpath("(//a[@Target='_blank'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(MO).perform();
		
		driver.quit();
		
	}

}
