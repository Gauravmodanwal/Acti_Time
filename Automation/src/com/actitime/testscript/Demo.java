package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class Demo extends BaseClass{
@Test
public void  createCustomer() {
	Reporter.log("createCustomer",true);
	Assert.fail();
}
}
