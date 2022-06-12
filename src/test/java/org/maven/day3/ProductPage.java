package org.maven.day3;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement add;
	
	@FindBy(xpath="//a[text()='Help Center']")
	private WebElement contact;

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContact() {
		return contact;
	}
	
}
