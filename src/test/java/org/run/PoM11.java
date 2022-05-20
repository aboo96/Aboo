package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM11 extends BaseClass {
	public PoM11() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="cancelall")
private WebElement cancel;

public WebElement cancelBtn() {
	return cancel;
	
}

}
