package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement tag = driver.findElement(By.id("toPasswordRecoveryPageLink"));
	String tagName = tag.getTagName();
	 
	String ref = tag.getAttribute("javascript: void(0)");
	System.out.println(tagName);
	System.out.println(ref);
	driver.close();
}

}
