package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class I_ScrollUpDown1 {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		
		WebElement page = driver.findElement(By.xpath("(//div[@class='_aacl _aacn _aacu _aacy _aad6'])[10]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("Scroll(0,400)");
		
		Thread.sleep(2000);
		page.click();
		
		driver.quit();
		
		
	}

}
