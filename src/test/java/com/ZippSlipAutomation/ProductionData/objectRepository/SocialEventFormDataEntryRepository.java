package com.ZippSlipAutomation.ProductionData.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class SocialEventFormDataEntryRepository {

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

	@FindBy(id = "MainContent_Question49508_txtAnswer")
	private WebElement oTextQuestion;

	public ReturnElement getTextQuestion() {
		return new ReturnElement(oTextQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question49509_rblOption_0']")
	private WebElement oSingleSelectOptionOne;

	public ReturnElement getSingleSelectOptionOne() {
		return new ReturnElement(oSingleSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question49510_cbMultiSelect_0']")
	private WebElement oMultiSelectOptionOne;

	public ReturnElement getMultiSelectOptionOne() {
		return new ReturnElement(oMultiSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question49510_cbMultiSelect_1']")
	private WebElement oMultiSelectOptionTwo;

	public ReturnElement getMultiSelectOptionTwo() {
		return new ReturnElement(oMultiSelectOptionTwo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49511_dlOptions")
	private WebElement oDropDownQuestion;

	public ReturnElement getDropDownQuestion() {
		return new ReturnElement(oDropDownQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49512_txtAnswer")
	private WebElement oPhoneQuestion;

	public ReturnElement getPhoneQuestion() {
		return new ReturnElement(oPhoneQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49513_txtDate")
	private WebElement oDateQuestion;

	public ReturnElement getDateQuestion() {
		return new ReturnElement(oDateQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49514_txtAnswer")
	private WebElement oEmailQuestion;

	public ReturnElement getEmailQuestion() {
		return new ReturnElement(oEmailQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49515_txtFirstName")
	private WebElement oFirstNameQuestion;

	public ReturnElement getFirstNameQuestion() {
		return new ReturnElement(oFirstNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49515_txtLastName")
	private WebElement oLastNameQuestion;

	public ReturnElement getLastNameQuestion() {
		return new ReturnElement(oLastNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
