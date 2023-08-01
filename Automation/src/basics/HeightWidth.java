package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//to check that height and width of username and password textbox is equal or not of actiTIME

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		int UHeight = username.getSize().getHeight();
		System.out.println("username height is: "+UHeight);
		int UWidth = username.getSize().getWidth();
		System.out.println("username width is: "+UWidth);
		
		WebElement password = driver.findElement(By.name("pwd"));
		int PHeight = password.getSize().getHeight();
		System.out.println("password height is: "+PHeight);
		int PWidth=password.getSize().getWidth();
		System.out.println("Password width: "+PWidth);
		
		if(UHeight==PHeight)
			System.out.println("the hight of username and  hight of password  are equal ");
		else
			System.out.println("the hight of username and  hight of password are not equal ");
		if(UWidth==PWidth)
			System.out.println("the width of username and  width of password are equal ");
		else
			System.out.println("the width of username and  width of password are not equal ");
		
	}

}
