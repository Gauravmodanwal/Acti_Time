package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspAutosuggestions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(), 'qspiders') or contains(text(), 'QSpiders')]"));
		
		for (WebElement webElement : sugg) {
			String allsugg = webElement.getText();
			System.out.println(allsugg );
			
		}

}
}
