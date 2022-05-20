package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM2 extends BaseClass{
public PoM2() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomType;
@FindBy(id="room_nos")
private WebElement noOfrooms;
@FindBy(id="datepick_in")
private WebElement checkIN;
@FindBy(id="datepick_out")
private WebElement checkOut;
@FindBy(id="adult_room")
private WebElement adults;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;

public WebElement getLocation() {
	return location;
	
}
public WebElement getHotel() {
	return hotels;
	
}

public WebElement roomType() {
	return roomType;
	
}

public WebElement noOfrooms() {
	return noOfrooms;
	
}

public WebElement checkIn() {
	return checkIN;
	
}

public WebElement checkOut() {
	return checkOut;
	
}

public WebElement getAdults() {
	return adults;
	
}
public WebElement getChild() {
	return child;
	
}
public WebElement submitBtn() {
	return submit;
	
}


















}
