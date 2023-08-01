package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonOfFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.name("login"));
		int x = login.getLocation().getX();
		int y=login.getLocation().getY(); 	
		System.out.println("The x-axis of login button is: "+x);
		System.out.println("The y-axis of login button is: "+y);
		driver.close();
	}

}
