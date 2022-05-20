package org.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 extends BaseClass{
	
public POM1(){
	PageFactory.initElements(driver,this);
	
}
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
private WebElement loginbutton;

public WebElement getUsername() {
	return username;
	
}
public WebElement getPassword() {
	return password;
	
}
public WebElement getLoginbtn() {
	return loginbutton;
	
}


















}
