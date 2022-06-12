package org.maven.day5;

import java.io.IOException;

import org.Base.BaseClass;

public class DataDrive extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		createExcel("flipkart", "Dheena", 0, 0, "userName");
		
		addDataExcel("flipkart", "Dheena", 0, 1, "Password");
		
	    updateExcel("flipkart", "Dheena", 0, 1, "dheena");
		
		
		
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
