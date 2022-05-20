package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM3 extends BaseClass {
	public PoM3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement continurebtn;

	public WebElement radioBtn() {
		return radiobtn;
		
	}
	public WebElement continueBtn() {
		return continurebtn;	
	}
	
}
