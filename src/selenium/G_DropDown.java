package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class G_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?r=101");
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("tushar");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
	    
	    driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("TUSHAR@gmail.com"); 
	    
	    driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("1234567"); 
	    
	    driver.findElement(By.xpath("//input[@name=\"reg_email_confirmati on__\"]")).sendKeys("akafaaldakls"); 
	    
	     WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));  
	     Select s = new Select(day); 
	     s.deselectByIndex(4);
	     s.selectByVisibleText("5"); 
	     Thread.sleep(2000);
	     
	     WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]")); 
	     Select s1 = new Select(month); 
	     s1.deselectByValue("7") ;
	     Thread.sleep(2000);
	     
	     WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	     Select s2  = new Select(year); 
	     s2.selectByValue("1988");
	     Thread.sleep(2000);
	     
	     
	     
	     driver.quit();
	
	} 
	    
	   
	    
	
	}
	


