package org.snip;

import org.openqa.selenium.Alert;
import org.run.BaseClass;
import org.run.POM1;
import org.run.PoM10;
import org.run.PoM11;

import org.run.PoM2;
import org.run.PoM3;
import org.run.PoM4;
import org.run.PoM5;
import org.run.PoM6;
import org.run.PoM7;
import org.run.PoM8;
import org.run.PoM9;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Snipped extends BaseClass {
	BaseClass k = new BaseClass();

	@Given("user should launch ther{string}")
	public void user_should_launch_ther(String string) {

		k.browserLunch(string);

	}

	@Given("user should launch {string} and {string} and the login page")
	public void user_should_launch_and_and_the_login_page(String string, String string2) {
		POM1 p = new POM1();
		k.typeText(p.getUsername(), string);
		k.typeText(p.getPassword(), string2);
		k.clickButton(p.getLoginbtn());
	}

	@When("user should select the details {string},{string},{string},{string}, {string},{string},{string},{string}")
	public void user_should_select_the_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		PoM2 p1 = new PoM2();
		k.typeText(p1.getLocation(), string);
		k.typeText(p1.getHotel(), string2);
		k.typeText(p1.roomType(), string3);
		k.typeText(p1.noOfrooms(), string4);
		k.typeText(p1.checkIn(), string5);
		k.typeText(p1.checkOut(), string6);
		k.typeText(p1.getAdults(), string7);
		k.typeText(p1.getChild(), string8);
		k.typeText(p1.submitBtn(), string6);
	}

	@Given("user should select the hotel")
	public void user_should_select_the_hotel() {
		PoM3 p2 = new PoM3();
		k.clickButton(p2.radioBtn());
		k.clickButton(p2.continueBtn());
	}

	@Given("user should enter the details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		PoM4 p3 = new PoM4();
		k.typeText(p3.firstName(), string);
		k.typeText(p3.lastName(), string2);
		k.typeText(p3.adress(), string3);
		k.typeText(p3.creditCardnumber(), string4);
		k.typeText(p3.creditCardtype(), string5);
		k.typeText(p3.expMonth(), string6);
		k.typeText(p3.expYear(), string7);
		k.typeText(p3.getccvNo(), string8);
		k.clickButton(p3.bookNowbtn());
	}

	@Then("user should get the OrderId")
	public void user_should_get_the_OrderId() throws InterruptedException {
		Thread.sleep(5000);
		PoM6 p4 = new PoM6();
		System.out.println(k.atrribute(p4.getorderNo(), "value"));
		

	}
	
	@Then("user should select my itineraray")
	public void user_should_select_my_itineraray() {
		PoM7 p5 = new PoM7();
		k.clickButton(p5.getItineraray());
	    
	}
	@Then("user should enter the detail {string}")
	public void user_should_enter_the_detail(String string) {
		PoM8 p6 =new PoM8();
		k.typeText(p6.searchOrderId(), string);
	    
	}

	@Then("user should select the go")
	public void user_should_select_the_go() {
	    PoM9 p7 = new PoM9();
	    k.clickButton(p7.goBtn());
	}


	@Given("user should selct the {string}")
	public void user_should_selct_the(String string) {
		PoM10 p8 = new PoM10();
		k.clickButton(p8.orderId());
	    
	}
	@Then("user should select cancel")
	public void user_should_select_cancel() {
	    
PoM11 p9 = new PoM11();
k.clickButton(p9.cancelBtn());
k.acceptMthd();

	}


}
