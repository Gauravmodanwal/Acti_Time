package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/demo2.html");
		 driver.findElement(By.cssSelector("a[id=\"d1\"]")).click();
		 driver.navigate().back();
		 driver.findElement(By.cssSelector("a[href='https://www.qspiders.com'")).click();
		 Thread.sleep(2000);
		 driver.close();

	}

}
