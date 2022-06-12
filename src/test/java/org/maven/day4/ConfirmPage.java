package org.maven.day4;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage extends BaseClass {

	public ConfirmPage() {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement confirmNumber;

	public WebElement getConfirmNumber() {
		return confirmNumber;
	}
	
	
}
