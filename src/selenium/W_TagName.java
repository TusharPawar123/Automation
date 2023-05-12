package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Application\\Web Driver New\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

driver.get("https://www.facebook.com/login/");

	 
	List<WebElement> links = driver.findElements(By.tagName("a")); 
	 	System.out.println(links.size()); 
	 	 
	for(int i=0; i<links.size(); i++) { 
	 	System.out.println(links.get(i).getText()); 
	} 

} 
 


}


 
	

