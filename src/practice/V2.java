package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Application\\Web driver\\chromedriver.exe");  	 
		WebDriver driver = new ChromeDriver();   	 	
		driver.manage().window().maximize();  	 	
		driver.manage().deleteAllCookies(); 
				 	 	
		driver.get("https://www.facebook.com/login/"); 
				 	 	 
				 
				 	driver.findElement(By.xpath("//a[text()='Instagram']")).click();  
				 	 	driver.findElement(By.xpath("//a[text()='MetaPay']")).click();
				 
				 	driver.findElement(By.xpath("//a[text()='Oculus']")).click();  
				 	 	 
				 	 	Set<String> windowIDs= driver.getWindowHandles();  
				 	 	 
				 	 	List<String> windowIDsList = new ArrayList(windowIDs);    
				 	 	 
				 	String parentWindowID = windowIDsList.get(0);  
				 	String child1WindowId = windowIDsList.get(1); 
				 	String child2WindowId = windowIDsList.get(2); 
				 	String child3WindowId = windowIDsList.get(3); 
				 
				 	System.out.println("Parent Window ID = " +parentWindowID); 
				 	System.out.println("Child1 Window ID = " +child1WindowId); 
				 	System.out.println("Child2 Window ID = " +child2WindowId);  	System.out.println("Child3 Window ID = " +child3WindowId); 
				 	 
				 	driver.switchTo().window(parentWindowID); 
				 	System.out.println("Parent Window Title = " + driver.getTitle()); 
				 	 
				 	driver.switchTo().window(child1WindowId); 
				 	System.out.println("child1 Window Title = " + driver.getTitle()); 
				 	 
				 
				 	driver.switchTo().window(child2WindowId); 
				 	System.out.println("child2 Window Title = " + driver.getTitle()); 
				 	 
				 	 
				 	driver.switchTo().window(child3WindowId); 
				 	System.out.println("child3 Window Title = " + driver.getTitle()); 
				 	 
				 	} 
				 

				 

	}


