package org.maven.day4;

import java.io.IOException;

import org.Base.BaseClass;

public class Adactin extends BaseClass {

	public static void main(String[] args) throws IOException {
		
    browserLaunch("chrome");
    
    toUrl("https://adactinhotelapp.com/");
		
	Maximize();	
	
	dynamicWait(30);
		
	LoginPage l=new LoginPage();
	
	sendKeys(l.getTxtUserName(), readExcel("Data1", "Sheet1", 1, 0));	
		
	sendKeys(l.getTxtPassword(), readExcel("Data1", "Sheet1", 1, 1));	
		
	click(l.getBtnLogin());	
		
	DetailsPage d=new DetailsPage();
	
	selectByValue(d.getCountry(), "Paris");
		
	selectByVisibleText(d.getHotelName(), "Hotel Sunshine");	
		
	selectByIndex(d.getRoomType(), 1);	
		
	selectByIndex(d.getRoomNos(), 1);	
		
	clear(d.getInDate());
	sendKeys(d.getInDate(), readExcel("Data1", "Sheet1", 1, 7));	
	
	clear(d.getOutDate());
	sendKeys(d.getOutDate(), readExcel("Data1", "Sheet1", 1, 8));
	
	selectByValue(d.getaPerRoom(), "1");
	
	selectByIndex(d.getcPerRoom(), 0);
	
	clickJava(d.getBtnSearch());
		
	VerifyPage v=new VerifyPage();	
		
	click(v.getDone());	
	click(v.getBtnclick());	
		
	BookPage b=new BookPage();	
	
	sendKeys(b.getFirstName(), readExcel("Data1", "Sheet1", 1, 2));
		
	sendKeys(b.getLastName(), readExcel("Data1", "Sheet1", 1, 3));	
	
	sendKeys(b.getBillAddress(), readExcel("Data1", "Sheet1", 1, 4));
		
	sendKeys(b.getCardNumber(), readExcel("Data1", "Sheet1", 1, 5));
	
	selectByIndex(b.getCardType(), 2);
	
	selectByIndex(b.getCardExpMonth(), 8);
	
	selectByVisibleText(b.getCardExpYear(), "2022");
	
	sendKeys(b.getCcvNumber(), readExcel("Data1", "Sheet1", 1, 6));
	
	click(b.getBtnBookNow());
	
	ConfirmPage c=new ConfirmPage();
			
	String text = getAttribute(c.getConfirmNumber(), "value");	
	System.out.println(text);
		
	}
}
