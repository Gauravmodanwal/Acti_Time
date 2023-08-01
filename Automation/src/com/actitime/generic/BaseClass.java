package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass()
	public void openBrowser() {
		Reporter.log("open browser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass()
	public void closeBrowser() {
		Reporter.log("close browser", true);
		driver.close();
	}
	@BeforeMethod()
    public void login() throws IOException {
		Reporter.log("login", true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
		
	}
	@AfterMethod()
    public void logout() {
		Reporter.log("logout", true);
       EnterTimeTrack e=new EnterTimeTrack(driver);
       e.setLogout();
	}
}
