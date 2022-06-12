package org.maven.day3;

import org.Base.BaseClass;
import org.openqa.selenium.Keys;

public class FlipkartDay3 extends BaseClass {

	public static void main(String[] args) {
		
	browserLaunch("chrome");	
		
	getUrl("https://www.flipkart.com/");	
		
	Maximize();
	
	dynamicWait(20);	
		
	HomePage h=new HomePage();	
		
	clickJava(h.getClose());	
		
	sendKeys(h.getSearch(),"iphone",Keys.ENTER);	
		
    clickActions(h.getProduct());		
		
	getWindow(1);	
	
	ProductPage p=new ProductPage();
		
	click(p.getAdd());	
		
	clickJava(p.getContact());	
		
	getWindow(2);	
		
	HelpPage v=new HelpPage();	
	
	clickActions(v.getDown());
		
	
		
		
		
		
		
		
		
		
		
	}
}
