package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class H_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/");

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\Shree\\eclipse-workspace\\Selenium project\\src\\selenium\\facebook.jpeg");
	FileHandler.copy(src, des);
	
	driver.quit();
	
	}

}
