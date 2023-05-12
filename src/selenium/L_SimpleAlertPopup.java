package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_SimpleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty ("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demoqa.com/alerts");

driver.findElement(By.xpath("//button[@id='alertButton']")).click();

Thread.sleep(3000);
Alert alt = driver.switchTo().alert();
System.out.println(alt.getText());
alt.accept();

Thread.sleep(3000);

driver.quit();

	}

}
