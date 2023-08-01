package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(3000);
	    List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	    for (WebElement webElement : allSugg) {
	    	String text = webElement.getText();
	    	System.out.println(text);
			
		}
	    System.out.println(allSugg.get(0).getText());
	    driver.close();
		
		
	}
}