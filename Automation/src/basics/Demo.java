package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 ChromeDriver d1 = new ChromeDriver();
		 d1.get("https://www.facebook.com/");
		
	}

}
