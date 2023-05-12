package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class V_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Application\\Web Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
      	options.addArguments("--remote-allow-origins=*");
      	
		WebDriver driver = new ChromeDriver(options); 
		
	    driver.manage().window().maximize();  	 	
		driver.manage().deleteAllCookies(); 
	    driver.get("https://www.facebook.com/login/"); 
				 	 	 
				 	 	
				 	 	 
	    String windowID = driver.getWindowHandle();  	
	    System.out.println(windowID);  	
	    String title = driver.getTitle();  	
		System.out.println(title); 
			
				 	 
	    driver.findElement(By.xpath("//a[text()='Instagram']")).click();   
	    driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();   
	    driver.findElement(By.xpath("//a[text()='Oculus']")).click();   
				 	 
				 	// By using iterator() 
				 	 
	    Set<String>windowIDs= driver.getWindowHandles();
				 	 
		Iterator<String> it = windowIDs.iterator();  
	    String parentWindowID = it.next();  
		String child1WindowID = it.next();  
	    String child2WindowID = it.next();  
	    String child3WindowID = it.next();  
				 	 
				 	 
	System.out.println("Parent Window ID " + parentWindowID); 
	System.out.println("Child1 Window ID " + child1WindowID); 
    System.out.println("Child2 Window ID " + child2WindowID);  
    System.out.println("Child3 Window ID " + child3WindowID);  
				 	 
				 	} 
				 

	}


