package assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BbcTopLatestBuseness {
//	static {
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
//	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
		List<WebElement> allNews = driver.findElements(By.xpath("//h2[text()='Latest Business News']/..//h3"));
	
		for (WebElement elements : allNews) {
			String text = elements.getText();
			System.out.println(text);
		}
	}

}
