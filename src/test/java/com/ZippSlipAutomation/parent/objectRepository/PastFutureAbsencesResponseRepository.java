package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class PastFutureAbsencesResponseRepository {


	@FindBy(id = "btnAddeNewUser")
	private WebElement oNewAbsenceNote;

	public ReturnElement getNewAbsenceNote() {
		return new ReturnElement(oNewAbsenceNote, Thread.currentThread().getStackTrace()[1].getMethodName());

	}



	@FindBy(xpath = ".//input[contains(@class,'zs-header-button')]")
	private WebElement oMarkNewAbsences;

	public ReturnElement getMarkNewAbsences() {
		return new ReturnElement(oMarkNewAbsences, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnDate1")
	private WebElement oCalendar;

	public ReturnElement getCalendar() {
		return new ReturnElement(oCalendar, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//span[contains(.,'Next')]")
	private WebElement oSelectAbsenceMonth;

	public ReturnElement getAbsenceMonth() {
		return new ReturnElement(oSelectAbsenceMonth, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//a[contains(.,'9')]")
	private WebElement oSelectAbsenceDate;

	public ReturnElement getAbsenceDate() {
		return new ReturnElement(oSelectAbsenceDate, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ui-datepicker-div")
	private WebElement oCalendarSelect;

	public ReturnElement getCalendarSelect() {
		return new ReturnElement(oCalendarSelect, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//input[contains(@class,'addChild')]")
	private WebElement oAddBtn;

	public ReturnElement getAddBtn() {
		return new ReturnElement(oAddBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//a[contains(.,'Absences')]")
	private WebElement oAbsencesMainMenu;

	public ReturnElement getAbsencesMainMenu() {
		return new ReturnElement(oAbsencesMainMenu, Thread.currentThread().getStackTrace()[1].getMethodName());

	}			


	@FindBy(id = "btnSendResponse")
	private WebElement oPastAbsencesResponseBtn;

	public ReturnElement getPastAbsencesResponseBtn() {
		return new ReturnElement(oPastAbsencesResponseBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[contains(@id,'_txtAnswer') and contains(@class,'phonemask')]")
	private WebElement oPhoneQuestion;

	public ReturnElement getPhoneQuestion() {
		return new ReturnElement(oPhoneQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'_txtDate')]")
	private WebElement oDateQuestion;

	public ReturnElement getDateQuestion() {
		return new ReturnElement(oDateQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//input[@class='frm_inputtext frm_medium']")
	private WebElement oEmailQuestion;

	public ReturnElement getEmailQuestion() {
		return new ReturnElement(oEmailQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[contains(@id,'_txtFirstName') and contains(@type,'text')]")
	private WebElement oFirstNameQuestion;

	public ReturnElement getFirstNameQuestion() {
		return new ReturnElement(oFirstNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[contains(@id,'_txtLastName') and contains(@type,'text')]")
	private WebElement oLastNameQuestion;

	public ReturnElement getLastNameQuestion() {
		return new ReturnElement(oLastNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[contains(@id,'_txtMailingAddress') and contains(@class,'streetadd')]") 

	private WebElement oMailingAddress;

	public ReturnElement getMailingAddressQuestion() {
		return new ReturnElement(oMailingAddress, Thread.currentThread().getStackTrace()[1].getMethodName());

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

	@FindBy(id = "txtElectronicSignature") 

	private WebElement oElectronicPin;

	public ReturnElement getElectronicPin() {
		return new ReturnElement(oElectronicPin, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnSendResponse") 

	private WebElement oSendResponseBtn;

	public ReturnElement getSendResponseBtn() {
		return new ReturnElement(oSendResponseBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//a[contains(.,'Home')]") 

	private WebElement oHomeScreen;

	public ReturnElement getHomeScreen() {
		return new ReturnElement(oHomeScreen, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


}
