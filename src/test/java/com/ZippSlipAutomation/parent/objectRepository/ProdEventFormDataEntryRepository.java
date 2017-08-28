package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ProdEventFormDataEntryRepository {

	@FindBy(id = "MainContent_Question261018_txtAnswer")
	private WebElement oTextQuestion;

	public ReturnElement getTextQuestion() {
		return new ReturnElement(oTextQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question261019_rblOption_0']")
	private WebElement oSingleSelectOptionOne;

	public ReturnElement getSingleSelectOptionOne() {
		return new ReturnElement(oSingleSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question261020_cbMultiSelect_0']")
	private WebElement oMultiSelectOptionOne;

	public ReturnElement getMultiSelectOptionOne() {
		return new ReturnElement(oMultiSelectOptionOne, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//label[@for='MainContent_Question261020_cbMultiSelect_1']")
	private WebElement oMultiSelectOptionTwo;

	public ReturnElement getMultiSelectOptionTwo() {
		return new ReturnElement(oMultiSelectOptionTwo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261021_dlOptions")
	private WebElement oDropDownQuestion;

	public ReturnElement getDropDownQuestion() {
		return new ReturnElement(oDropDownQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261022_txtAnswer")
	private WebElement oPhoneQuestion;

	public ReturnElement getPhoneQuestion() {
		return new ReturnElement(oPhoneQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261023_txtDate")
	private WebElement oDateQuestion;

	public ReturnElement getDateQuestion() {
		return new ReturnElement(oDateQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261024_txtAnswer")
	private WebElement oEmailQuestion;

	public ReturnElement getEmailQuestion() {
		return new ReturnElement(oEmailQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261025_txtFirstName")
	private WebElement oFirstNameQuestion;

	public ReturnElement getFirstNameQuestion() {
		return new ReturnElement(oFirstNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261025_txtLastName")
	private WebElement oLastNameQuestion;

	public ReturnElement getLastNameQuestion() {
		return new ReturnElement(oLastNameQuestion, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
