package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[ text()='java']"));
		
		int count = sugg.size();
		System.out.println("COUNT: "+count);
		for (int i = 0; i < count; i++) {
			String text = sugg.get(i).getText();
			System.out.println(text);
		}
		String last = sugg.get(0).getText();
		System.out.println(last);
		driver.close();
		
	}

}
