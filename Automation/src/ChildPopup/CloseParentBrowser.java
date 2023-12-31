package ChildPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("fbContainer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(2000);
		Set<String> allWH = driver.getWindowHandles();
		String pWH = driver.getWindowHandle();
		for(String wh:allWH) {
			driver.switchTo().window(wh);
		if(!pWH.equals(wh)) {
			
			driver.close();
			
		}
			
		}
	}

}
