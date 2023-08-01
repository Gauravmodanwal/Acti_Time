package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdioButtonAllignedOrNOt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_0_HA")).click();
		Thread.sleep(3000);
		int y1 = driver.findElement(By.xpath("//label[@class='_58mt']/../input[@id='u_f_4_RZ']")).getLocation().getY();
		
	}

}
