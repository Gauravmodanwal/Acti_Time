package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class ProjectModule {
	@Test(groups = "smokeTest")
	public void createproject() {
		Reporter.log("createproject",true);
	}
	@Test(groups="regressionTest")
	public void deleteproject() {
		Reporter.log("deleteproject",true);
	}
}
