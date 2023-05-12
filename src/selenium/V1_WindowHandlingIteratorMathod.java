package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V1_WindowHandlingIteratorMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/login/");

/*String windowID = driver.getWindowHandle();
System.out.println(windowID);
String title = driver.getTitle();
System.out.println(title); */

driver.findElement(By.xpath("//a[@title='Learn more about Oculus']")).click();
driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
driver.findElement(By.xpath("//a[@title='Learn more about Meta Pay']")).click();

Set<String> windowIDs= driver.getWindowHandles(); 
Iterator<String> it = windowIDs.iterator();

String parentWindowID =  it.next();  
String child1WindowID =  it.next(); 
String child2WindowID =  it.next(); 
String child3WindowID = it.next(); 


System.out.println("Parent Window ID " + parentWindowID); 
System.out.println("Child1 Window ID " + child1WindowID);
System.out.println("Child2 Window ID " + child2WindowID);
System.out.println("Child3 Window ID " + child3WindowID); 
 
 
driver.switchTo().window(parentWindowID);
System.out.println("Parent Window Id " + driver.getTitle());

driver.switchTo().window(child1WindowID);
System.out.println("Child1 Window ID  "+ driver.getTitle());

driver.switchTo().window(child2WindowID);
System.out.println("child2 window id " + driver.getTitle());

driver.switchTo().window(child3WindowID);
System.out.println("child3 wimdoe id "+ driver.getTitle());



	}

}
