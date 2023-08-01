package com.actitime.generic;

import java.io.IOException;

public class RetrieveTheData {
	public static void main(String[] args) throws IOException {
		FileLib fl=new FileLib();
		String data = fl.getPropertyData("url");
		System.out.println(data );
		String data1 = fl.getExcelData("CreateCustomer", 1, 2);
		System.out.println(data1);
		
	}
	

}
