package org.test;


import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameTest extends BaseClass {

	public FrameTest() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	
}
