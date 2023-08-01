package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass{
    @Test 
    public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
    	FileLib f=new FileLib();
        String customerName = f.getExcelData("CreateCustomer", 1, 3);
       String customerDiscription = f.getExcelData("CreateCustomer", 1, 4);
       
    	Reporter.log("Create Customer", true);
    	EnterTimeTrack et=new EnterTimeTrack(driver);
    	et.setTaskTab();
    	TaskListPage t=new TaskListPage(driver);
    	t.getAddNewBtn().click();
      	 t.getNewCustomerBtn().click();
         t.getCustomerNameTbx().sendKeys(customerName);
         t.getCustomerDescriptionTbx().sendKeys(customerDiscription);
         t.getSelectCustomerDD().click();
         t.getBigBangCompanyTx().click();
         t.getCreateCustomerBtn().click();
         Thread.sleep(3000);
         String actualResult = t.getActualCustomerCreated().getText();
         Assert.assertEquals(actualResult, "12545");
    			
    }
    
}
