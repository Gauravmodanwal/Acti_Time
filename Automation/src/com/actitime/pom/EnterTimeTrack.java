package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class EnterTimeTrack {

	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement task;
	
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		logout.click();
	}
	public void setTaskTab() {
		task.click();
	}
	

}
