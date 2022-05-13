package org.stepdeftion;

import org.libglobal.Libglob;
import org.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Stepfdefenition extends Libglob{
	@Given("login by valid username and password")
	public void login_by_valid_username_and_password() {
		launchBrowser();
		loadUrl("http://www.adactinhotelapp.com/");
		
	}
//
//	@Then("select Location by dropdown")
//	public void select_Location_by_dropdown() {
//		Pojoclass l = new Pojoclass();
//		l.togetUsername().sendKeys("siva0931");
//		
//	}
//
//	@Then("select hotel by by dropdown")
//	public void select_hotel_by_by_dropdown() {
//		Pojoclass l = new Pojoclass();
//		l.togetPassword().sendKeys("Siva@0931");
//	}
//
//	@Then("select room type by dropdown")
//	public void select_room_type_by_dropdown() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("select number of rooms")
//	public void select_number_of_rooms() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("edit the checj in date")
//	public void edit_the_checj_in_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("edit the checkout date")
//	public void edit_the_checkout_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("select adult per room by dropdown")
//	public void select_adult_per_room_by_dropdown() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("search button")
//	public void search_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("fill the first name")
//	public void fill_the_first_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("Last name")
//	public void last_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("fill the billing address")
//	public void fill_the_billing_address() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("fill Credit card number")
//	public void fill_Credit_card_number() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("select the card type")
//	public void select_the_card_type() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("select the expiry date")
//	public void select_the_expiry_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("fill CCV num")
//	public void fill_CCV_num() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("click the Book now button")
//	public void click_the_Book_now_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//

	@Given("Login in hdfc netbanking")
	public void login_in_hdfc_netbanking() {
		loadUrl("https://netbanking.hdfcbank.com/netbanking/?_ga=2.8753077.1804453491.1620650297-727739606.1615022659");
		Pojoclass l = new Pojoclass();
		l.togetUsername().sendKeys("Siviya");
		
	}

	@Then("give the user name and password")
	public void give_the_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click login")
	public void click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
