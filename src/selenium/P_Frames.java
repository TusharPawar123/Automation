package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class P_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Application\\Web Driver New\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

driver.switchTo().frame("frame1");
driver.switchTo().frame("frame3");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();

driver.switchTo().parentFrame();
driver.findElement(By.xpath("//input")).sendKeys("Welcome");

driver.switchTo().defaultContent();
driver.switchTo().frame("frame2");

WebElement animal = driver.findElement(By.xpath("select[@class='col-lg-3']"));
Select anl = new Select(animal);
anl.selectByVisibleText("Big Baby Cat");

driver.quit();





	}

}
