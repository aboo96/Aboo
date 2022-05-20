package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM10 extends BaseClass{
	public PoM10() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="check_all")
	private WebElement orderid;
	public WebElement orderId() {
		return orderid;
		
	}

}
