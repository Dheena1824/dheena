package org.maven.day4;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BaseClass {

	public BookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement billAddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cardNumber;
	
	@FindBy(xpath="//Select[@name='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//Select[@name='cc_exp_month']")
	private WebElement cardExpMonth;
	
	@FindBy(xpath="//Select[@name='cc_exp_year']")
	private WebElement cardExpYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccvNumber;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement btnBookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillAddress() {
		return billAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	
	
	
	
}
