package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectALL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get( "file:///C:/Users/user/Desktop/listbox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		
		List<WebElement> allOption = s.getAllSelectedOptions();
		
		 for(int i=0; i<allOption.size(); i++) {
			 String text = allOption.get(i).getText();
			 System.out.println(text);
		 }
		
		}
}
