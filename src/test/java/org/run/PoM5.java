package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM5 extends BaseClass {
	public PoM5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	public WebElement orderNo() {
		return orderno;
		
	}

}
