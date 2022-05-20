package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM9 extends BaseClass {
	public PoM9() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_hotel_id")
	private WebElement go;
	
	public WebElement goBtn() {
		return go;
		
	}
	
}
