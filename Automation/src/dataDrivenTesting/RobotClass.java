package dataDrivenTesting;

import java.io.IOException;

public class RobotClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("notepad");
	}

}
