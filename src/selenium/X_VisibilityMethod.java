package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_VisibilityMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/r.php?r=101"); 
	 	   
 	 	WebElement ele =driver.findElement(By.xpath("//input[@name='firstname']"));  
 	 	 
        boolean b = ele.isDisplayed(); 	 	 
 	 	System.out.println(b);  
 	 	 
 	 	driver.findElement(By.xpath("//input[@value=1]")).click(); 
 	 	 
 	 	Thread.sleep(5000); 
 	 	 
 	 	driver.quit();  
 	} 
 


	}


