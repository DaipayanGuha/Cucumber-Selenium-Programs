package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.pagebean.HotelBookingPageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingStepDefinition {

	private WebDriver driver;

	private HotelBookingPageBean pageBean;
	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	
	@Given("^User is accessing Booking page on browser$")
	public void user_is_accessing_Booking_page_on_browser() throws Throwable {
	    driver.get("F:/hotelbooking.html");
	    pageBean = PageFactory.initElements(driver, HotelBookingPageBean.class);
	}

	@When("^user is trying to submit data without entering First name$")
	public void user_is_trying_to_submit_data_without_entering_First_name() throws Throwable {
	    pageBean.clickSignUp();
	}

	@Then("^'First name should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void first_name_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
	
		String expectedAlertMessage ="First name should not be empty / length be between 5 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		System.out.println(actualAlertMessage);
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering Last name$")
	public void user_is_trying_to_submit_data_without_entering_Last_name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setFirstName("Pritam");	
		pageBean.clickSignUp();
	}

	@Then("^'Last name should not be empty' alert should be displayed$")
	public void last_name_should_not_be_empty_alert_should_be_displayed() throws Throwable {
		String expectedAlertMessage ="Last name should not be empty";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering Email ID$")
	public void user_is_trying_to_submit_data_without_entering_Email_ID() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setLastName("Chakraborty");	
		pageBean.clickSignUp();
	}

	@Then("^'Email ID should not be empty' alert should be displayed$")
	public void email_ID_should_not_be_empty_alert_should_be_displayed() throws Throwable {
		String expectedAlertMessage ="Email ID should not be empty";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering mobile no$")
	public void user_is_trying_to_submit_data_without_entering_mobile_no() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("pritam@gmail.com");
		pageBean.clickSignUp();
	}

	@Then("^'Mobile No\\. should not be empty' alert should be displayed$")
	public void mobile_No_should_not_be_empty_alert_should_be_displayed() throws Throwable {
		String expectedAlertMessage ="Mobile No. should not be empty";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering Address$")
	public void user_is_trying_to_submit_data_without_entering_Address() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setMobileNo("9807654321");
		pageBean.clickSignUp();
	}

	@Then("^'Address should not be empty' alert should be displayed$")
	public void address_should_not_be_empty_alert_should_be_displayed() throws Throwable {
		String expectedAlertMessage ="Address should not be empty";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering valid 'city'$")
	public void user_is_trying_to_submit_data_without_entering_valid_city() throws Throwable {
	    driver.switchTo().alert().dismiss();
		pageBean.setAddress("H.A-330/5");
		pageBean.setCity("Kolkata");
		pageBean.clickSignUp();
	}

	@Then("^'Select your city from the list' alert message should display$")
	public void select_your_city_from_the_list_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Select your city from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering valid 'State'$")
	public void user_is_trying_to_submit_data_without_entering_valid_State() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCity("Pune");
		pageBean.setState("Himachal");
		pageBean.clickSignUp();
	}

	@Then("^'Select your state from the list' alert message should display$")
	public void select_your_state_from_the_list_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Select your state from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without selecting  valid 'guests'$")
	public void user_is_trying_to_submit_request_without_selecting_valid_guests() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setState("Tamilnadu");
		pageBean.setPersons("12");
		pageBean.clickSignUp();
	}

	@Then("^'Select Number of guest staying from the list' alert message should display$")
	public void select_Number_of_guest_staying_from_the_list_alert_message_should_display() throws Throwable {
	    
		String expectedAlertMessage ="Select Number of guest staying from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entring 'Debit Card Number'$")
	public void user_is_trying_to_submit_request_without_entring_Debit_Card_Number() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setPersons("5");
		pageBean.clickSignUp();
	}

	@Then("^'Debit Card Number must not be empty and must have numeric characters only' alert message should display$")
	public void debit_Card_Number_must_not_be_empty_and_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Debit Card Number must not be empty and must have numeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entring 'CVV'$")
	public void user_is_trying_to_submit_request_without_entring_CVV() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setDebitNo("012458");
		pageBean.clickSignUp();
	}

	@Then("^'CVV must not be empty' alert message should display$")
	public void cvv_must_not_be_empty_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="CVV must not be empty";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entring 'Expiration Month'$")
	public void user_is_trying_to_submit_request_without_entring_Expiration_Month() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCVV("45678");
		pageBean.clickSignUp();
	}

	@Then("^'Expiration Month must not be empty and must have numeric characters only' alert message should display$")
	public void expiration_Month_must_not_be_empty_and_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Expiration Month must not be empty and must have numeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entring 'Expiration Year'$")
	public void user_is_trying_to_submit_request_without_entring_Expiration_Year() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setMonth("January");
		pageBean.clickSignUp();
		driver.switchTo().alert().dismiss();
	}

	@Then("^'Expiration Year must not be empty and must have numeric characters only' alert message should display$")
	public void expiration_Year_must_not_be_empty_and_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Expiration Year must not be empty and must have numeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
		pageBean.setFirstName("Pritam");	
		pageBean.setLastName("Chakraborty");
		pageBean.setEmail("pritam@gmail.com");
		pageBean.setMobileNo("9807654321");
		pageBean.setAddress("H.A-330/5");
		pageBean.setCity("Pune");
		pageBean.setState("Tamilnadu");
		pageBean.setPersons("5");
		pageBean.setDebitNo("012458");
		pageBean.setCVV("45678");
		pageBean.setMonth("January");
		pageBean.setYear("2025");
		pageBean.clickSignUp();
		
	}

	@Then("^'Your Registration with HotelWorld\\.com has successfully done plz check your registred email addres to activate your booking' alert message should display$")
	public void your_Registration_with_HotelWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_booking_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
	}
}
