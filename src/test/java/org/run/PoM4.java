package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM4 extends BaseClass{
	public PoM4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
@FindBy(id="address")
	private WebElement adress;
@FindBy(id="cc_num")
	private WebElement creditcardnum;
@FindBy(id="cc_type")
	private WebElement creditcardtype;
@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	@FindBy(id="book_now")
	private WebElement booknowbutton;

public WebElement firstName() {
	return firstname;

}
public WebElement lastName() {
	return lastname;

}
public WebElement adress() {
	return adress;

}
public WebElement creditCardnumber() {
	return creditcardnum;

}
public WebElement creditCardtype() {
	return creditcardtype;

}
public WebElement expMonth() {
	return expmonth;

}
public WebElement expYear() {
	return expyear;

}
public WebElement getccvNo() {
	return cvvno;

}
public WebElement bookNowbtn() {
	return booknowbutton;

}

}
