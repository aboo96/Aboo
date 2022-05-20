package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM8 extends BaseClass {
	public PoM8() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_id_text")
	private WebElement searchorferid;



public WebElement searchOrderId() {
	return searchorferid;
	
}
}