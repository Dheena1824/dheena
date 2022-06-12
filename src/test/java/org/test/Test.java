package org.test;

import java.awt.AWTException;

import org.Base.BaseClass;
import org.openqa.selenium.Keys;

public class Test extends BaseClass {

	public static void main(String[] args) throws AWTException {
	
		browserLaunch("chrome");
        
		Maximize();
		
		dynamicWait(30);
		
	    toUrl("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiDp9qVmIb4AhUlT2wGHfo1BskQPAgI");
		
		FrameTest f=new FrameTest();
		
		sendKeys(f.getSearch(), "Dheena");
		
		doubleClick(f.getSearch());
		
		controlX();
				
        sendKeys(f.getSearch(), Keys.SHIFT, "Dheena");
		
        	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
