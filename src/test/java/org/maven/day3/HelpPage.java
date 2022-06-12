package org.maven.day3;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage extends BaseClass {

	public HelpPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='View More']")
	public WebElement down;
	
	public WebElement getDown() {
		return down;
	}
	
}
