package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V3_WindowHandalForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Application\\Web driver New\\chromedriver.exe");  	 
		WebDriver driver = new ChromeDriver();   	 	
		driver.manage().window().maximize();  	 	
		driver.manage().deleteAllCookies(); 
				 	 	
		driver.get("https://www.facebook.com/login/"); 
				 	
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();  
 	 	driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();  
        driver.findElement(By.xpath("//a[text()='Oculus']")).click();  
 	 	 
 	 	Set<String> windowIDs= driver.getWindowHandles();  
 	 	 
 	 	List<String> windowIDsList = new ArrayList(windowIDs);    
 	 	 
 	 
 	 	 
 	 	for
 	 	(String windID : windowIDsList) 
 	 	{ 
 	 	 	System.out.println(windID);  	 	 	
 	 	 	String title = driver.switchTo().window(windID).getTitle(); 
 	 	 	System.out.println(title);   	 	 	
 	 	 	
 	 	 	if
 	 	 	(title.equals("Instagram")) 
 	 	 	{ 
 	 	 	 	driver.close(); 
 	 	 	} 
 	 	} 
 	 	 
 	} 
 

 

	}


