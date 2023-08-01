package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameAndAttribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String tagName = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String attribute = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		
		System.out.println("tag name is: "+tagName);
		System.out.println("Attribute is "+attribute);
		driver.close();
	}

}
