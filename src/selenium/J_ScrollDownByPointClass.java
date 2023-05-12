package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_ScrollDownByPointClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/menu");

WebElement menu = driver.findElement(By.xpath("//li[@id='item-7']"));
Point loc = menu.getLocation();
System.out.println(loc);

Thread.sleep(5000);

JavascriptExecutor js = ((JavascriptExecutor)driver);
js.executeScript("scroll(50,1053)");
Thread.sleep(5000);

menu.click();

Thread.sleep(5000);

driver.quit();






	}

}
