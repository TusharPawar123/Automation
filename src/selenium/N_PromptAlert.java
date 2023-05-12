package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class N_PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("scroll(0,500)");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.sendKeys("WELCOME");
		 alt.accept();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
	}

}
