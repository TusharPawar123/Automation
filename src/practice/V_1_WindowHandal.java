package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V_1_WindowHandal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		
		Set<String> windowIDs =driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentwindowID = it.next();
		String childwindowID = it.next();
		String child1windowID = it.next();
		
		System.out.println("Parent window ID " + parentwindowID);
		System.out.println("Child window ID " + childwindowID);
		System.out.println("child1 window ID " + child1windowID);
		
		
	}

}
