package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeFontColour {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String fontSize = driver.findElement(By.linkText( "Forgotten password?")).getCssValue("font-size");
		String fontWeight = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		System.out.println("The font size is: "+fontSize);
		System.out.println("Font weight is: "+fontWeight);
		driver.close();
	}
}
