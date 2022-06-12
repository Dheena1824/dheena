package org.maven.day3;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close; 
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (White, 64 GB)']")
	private WebElement product;

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getProduct() {
		return product;
	}
	
	
}
