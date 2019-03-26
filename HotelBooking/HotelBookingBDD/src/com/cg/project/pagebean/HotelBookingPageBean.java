package com.cg.project.pagebean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageBean {

	@FindBy(how=How.NAME,name="txtFN")
	private WebElement firstName ;

	@FindBy(how=How.NAME,name="txtLN")
	private WebElement lastName;

	@FindBy(how=How.NAME,name="Email")
	private WebElement email;

	@FindBy(how=How.NAME,name="Phone")
	private WebElement mobileNo;

	@FindBy(how=How.NAME,name="Address")
	private WebElement address;

	@FindBy(how=How.NAME,name="city")
	private WebElement city;

	@FindBy(how=How.NAME,name="state")
	private WebElement state;

	@FindBy(how=How.NAME,name="persons")
	private WebElement persons;

	@FindBy(how=How.NAME,name="debit")
	private WebElement debitNo;

	@FindBy(how=How.NAME,name="cvv")
	private WebElement cvv;
	
	@FindBy(how=How.NAME,name="year")
	private WebElement year;
	
	@FindBy(how=How.NAME,name="month")
	private WebElement month;
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public String getFirstName() {
		return firstName.getAttribute("value");
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public String getLastName() {
		return lastName.getAttribute("value");
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public String getEmail() {
		return email.getAttribute("value");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public String getMobileNo() {
		return mobileNo.getAttribute("value");
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}
	public String getAddress() {
		return address.getAttribute("value");
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();
	}
	public void setCity(String city) {
		Select select=new Select(this.city);
		select.selectByVisibleText(city);
	}
	public String getState() {
		return new Select(this.state).getFirstSelectedOption().getText();
	}
	public void setState(String state) {
		Select select=new Select(this.state);
		select.selectByVisibleText(state);
	}
	public String getPersons() {
		return new Select(this.persons).getFirstSelectedOption().getText();
	}
	public void setPersons(String persons) {
		Select select=new Select(this.persons);
		select.selectByVisibleText(persons);
	}
	public String getDebitNo() {
		return debitNo.getAttribute("value");
	}
	public void setDebitNo(String debitNo) {
		this.debitNo.sendKeys(debitNo);
	}
	public String getCVV() {
		return cvv.getAttribute("value");
	}
	public void setCVV(String cVV) {
		this.cvv.sendKeys(cVV);
	}
	public String getYear() {
		return year.getAttribute("value");
	}
	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	public String getMonth() {
		return month.getAttribute("value");
	}
	public void setMonth(String month) {
		this.month.sendKeys(month);
	}
	public void clickSignUp() {
		submitBtn.submit();
	}
	
	
}
