package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class EventFormDataEntryRepository {

	@FindBy(xpath = "//*[contains(@id,'_lblQuestionText')]")
	private WebElement oQuestionsPresent;

	public ReturnElement getQuestionsPresent() {
		return new ReturnElement(oQuestionsPresent, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question') and contains(@style,'visibility: visible')]//td[3]")
	private WebElement oErrorMessage;

	public ReturnElement getErrorMessage() {
		return new ReturnElement(oErrorMessage, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49508_txtAnswer")
	@FindBy(xpath = ".//*[contains(@id,'_txtAnswer') and contains(@type,'text')]") 
	private WebElement oTextQuestion;

	public ReturnElement getTextQuestion() {
		return new ReturnElement(oTextQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(xpath = ".//label[@for='MainContent_Question49509_rblOption_0']")
	@FindBy(xpath = ".//*[contains(@id,'_rblOption_0') and contains(@type,'radio')]") 
	private WebElement oSingleSelectOptionOne;

	public ReturnElement getSingleSelectOptionOne() {
		return new ReturnElement(oSingleSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(xpath = ".//label[@for='MainContent_Question49510_cbMultiSelect_0']")
	@FindBy(xpath = ".//*[contains(@id,'cbMultiSelect_0') and contains(@type,'checkbox')]") 
	private WebElement oMultiSelectOptionOne;

	public ReturnElement getMultiSelectOptionOne() {
		return new ReturnElement(oMultiSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(xpath = ".//label[@for='MainContent_Question49510_cbMultiSelect_1']")
	@FindBy(xpath = ".//*[contains(@id,'cbMultiSelect_1') and contains(@type,'checkbox')]")
	private WebElement oMultiSelectOptionTwo;

	public ReturnElement getMultiSelectOptionTwo() {
		return new ReturnElement(oMultiSelectOptionTwo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49511_dlOptions")
	@FindBy(xpath = ".//*[contains(@id,'dlOptions')]")
	private WebElement oDropDownQuestion;

	public ReturnElement getDropDownQuestion() {
		return new ReturnElement(oDropDownQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49512_txtAnswer")
	@FindBy(xpath = ".//*[contains(@id,'_txtAnswer') and contains(@class,'phonemask')]")
	private WebElement oPhoneQuestion;

	public ReturnElement getPhoneQuestion() {
		return new ReturnElement(oPhoneQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49513_txtDate")
	@FindBy(xpath = ".//*[contains(@id,'_txtDate')]")
	private WebElement oDateQuestion;

	public ReturnElement getDateQuestion() {
		return new ReturnElement(oDateQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49514_txtAnswer")
	@FindBy(xpath = ".//input[@class='frm_inputtext frm_medium']")
	private WebElement oEmailQuestion;

	public ReturnElement getEmailQuestion() {
		return new ReturnElement(oEmailQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49515_txtFirstName")
	@FindBy(xpath = ".//*[contains(@id,'_txtFirstName') and contains(@type,'text')]")
	private WebElement oFirstNameQuestion;

	public ReturnElement getFirstNameQuestion() {
		return new ReturnElement(oFirstNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	//@FindBy(id = "MainContent_Question49515_txtLastName")
	@FindBy(xpath = ".//*[contains(@id,'_txtLastName') and contains(@type,'text')]")
	private WebElement oLastNameQuestion;

	public ReturnElement getLastNameQuestion() {
		return new ReturnElement(oLastNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtMailingAddressStreetNumber') and contains(@class,'street')]") 

	private WebElement oStreetNumber;

	public ReturnElement getStreetNumberQuestion() {
		return new ReturnElement(oStreetNumber, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtMailingAddress') and contains(@class,'streetadd')]") 

	private WebElement oMailingAddress;

	public ReturnElement getMailingAddressQuestion() {
		return new ReturnElement(oMailingAddress, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@FindBy(xpath = ".//*[contains(@id,'_txtMailingStreetType') and contains(@class,'streettype')]") 

	private WebElement oStreetType;

	public ReturnElement getStreetTypeQuestion() {
		return new ReturnElement(oStreetType, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_ddlMailingStreetDirection') and contains(@class,'streetdirection')]") 

	private WebElement oStreetDirection;

	public ReturnElement getStreetDirectionQuestion() {
		return new ReturnElement(oStreetDirection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtMailingAddressApartment') and contains(@class,'apartment')]") 

	private WebElement oMailingAddressApartment;

	public ReturnElement getMailingAddressApartmentQuestion() {
		return new ReturnElement(oMailingAddressApartment, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtMailingAddressCityTown') and contains(@class,'city')]") 

	private WebElement oCityTown;

	public ReturnElement getCityTownQuestion() {
		return new ReturnElement(oCityTown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ddlMailingAddressStates") 

	private WebElement oAddressStates;

	public ReturnElement getAddressStatesQuestion() {
		return new ReturnElement(oAddressStates, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtMaillingAddressZippCode') and contains(@class,'zippcode')]") 

	private WebElement oZippCode;

	public ReturnElement getZippCodeQuestion() {
		return new ReturnElement(oZippCode, Thread.currentThread().getStackTrace()[1].getMethodName());

	}



}
