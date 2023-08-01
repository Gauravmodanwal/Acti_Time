package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAlligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("//label[text()='Female']/..//input[@name='sex']")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']")).getLocation().getY();
		if (y1==y2 && y2==y3) {
			System.out.println("Gender radio buttons are alligned properly");
		}
		else
			System.out.println("Gender radio buttons are not alligned properly");
		driver.close();
	}

}
