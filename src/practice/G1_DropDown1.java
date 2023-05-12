package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class G1_DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?r=101\"");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tushar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8275156908");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Tushar@123");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(day);
		d.selectByVisibleText("10");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		d.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select y = new Select(year);
		d.selectByVisibleText("2000");
		
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
