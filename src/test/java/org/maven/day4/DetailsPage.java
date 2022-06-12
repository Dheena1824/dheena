package org.maven.day4;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends BaseClass {

	public DetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement country;
	
	@FindBy(name="hotels")
	private WebElement hotelName;
	
	@FindBy(xpath="//Select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//Select[@name='room_nos']")
	private WebElement roomNos;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement inDate;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement outDate;
	
	@FindBy(xpath="//Select[@id='adult_room']")
	private WebElement aPerRoom;
	
	@FindBy(xpath="//Select[@id='child_room']")
	private WebElement cPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getaPerRoom() {
		return aPerRoom;
	}

	public WebElement getcPerRoom() {
		return cPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
}
