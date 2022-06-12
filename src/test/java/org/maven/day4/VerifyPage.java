package org.maven.day4;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage extends BaseClass {

	public VerifyPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement done;
	
	@FindBy(id="continue")
	private WebElement btnclick;

	public WebElement getDone() {
		return done;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}
	
	
}

