package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V2_WindowHandalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//a[text()='Instagram']")).click();  
driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();  
driver.findElement(By.xpath("//a[text()='Oculus']")).click();  

Set<String> windowIDs=driver.getWindowHandles();

List<String>windowsIDsList = new ArrayList(windowIDs);


String parentWindowIDs = windowsIDsList.get(0);
String child1WindowIDs = windowsIDsList.get(1);
String child2WindowIDs = windowsIDsList.get(2);
String child3WindowIDs = windowsIDsList.get(3);

System.out.println("Parent Window Id "+ parentWindowIDs);
System.out.println("Child1 Window Id "+ child1WindowIDs);
System.out.println("Child2 Window Id "+ child2WindowIDs);
System.out.println("Child3 Window Id "+ child3WindowIDs);

driver.switchTo().window(parentWindowIDs);
System.out.println("Parent Window Id "+ driver.getTitle());

driver.switchTo().window(child1WindowIDs);
System.out.println("Child1 Window Id "+ driver.getTitle());

driver.switchTo().window(child2WindowIDs);
System.out.println("Child2 Window Id "+ driver.getTitle());

driver.switchTo().window(child3WindowIDs);
System.out.println("Child3 Window Id "+ driver.getTitle());
	}

}
