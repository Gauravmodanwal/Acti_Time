package basics;

import org.openqa.selenium.WebDriver;


	public class DemoA{
		static void testA(WebDriver driver) throws InterruptedException {
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
				}
	}

