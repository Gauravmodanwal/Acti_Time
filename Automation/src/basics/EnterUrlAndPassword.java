package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlAndPassword {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Enter admin in username
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		//enter password as manager
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		
		
		
	}

}
