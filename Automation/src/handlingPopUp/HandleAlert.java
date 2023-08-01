package handlingPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath( "//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
	}

}
