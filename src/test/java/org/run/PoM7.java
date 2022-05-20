package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM7 extends BaseClass {
	public PoM7() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="my_itinerary")
	private WebElement itineraray;
	
	public WebElement getItineraray() {
		return itineraray;
		
	}
	
	
	
	
}
