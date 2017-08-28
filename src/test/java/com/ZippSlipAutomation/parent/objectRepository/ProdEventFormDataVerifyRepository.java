package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ProdEventFormDataVerifyRepository {

	@FindBy(id = "MainContent_Question261018_divAnswerText")
	private WebElement oTextQuestionCheck;

	public ReturnElement getTextQuestionCheck() {
		return new ReturnElement(oTextQuestionCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question261019_rblOption_0') and contains(@checked,'checked') and contains(@type,'radio')]")
	private WebElement oSingleSelectAnsCheck;

	public ReturnElement getSingleSelectAnsCheck() {
		return new ReturnElement(oSingleSelectAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question261020_cbMultiSelect_0') and contains(@checked,'checked') and contains(@type,'checkbox')]")
	private WebElement oMultiSelectAnsCheck;

	public ReturnElement getMultiSelectAnsCheck() {
		return new ReturnElement(oMultiSelectAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question261021_divAnswerText']/span")
	private WebElement oDropDownAnsCheck;

	public ReturnElement getDropDownAnsCheck() {
		return new ReturnElement(oDropDownAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question261022_txtAnswer') and contains(@value,'(666) 666-6666')]")
	private WebElement oPhoneAnsCheck;

	public ReturnElement getPhoneAnsCheck() {
		return new ReturnElement(oPhoneAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question261023_txtDate') and contains(@value,'1/1/1992')]")
	private WebElement oDateAnsCheck;

	public ReturnElement getDateAnsCheck() {
		return new ReturnElement(oDateAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261024_divAnswerText")
	private WebElement oEMailAnsCheck;

	public ReturnElement getEMailAnsCheck() {
		return new ReturnElement(oEMailAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question261025_divAnswerText")
	private WebElement oFullNameCheck;

	public ReturnElement getFullNameCheck() {
		return new ReturnElement(oFullNameCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260366_txtAnswer' and @value='8105']")
	private WebElement oTextQuestionCheckPrefilled;

	public ReturnElement getTextQuestionCheckPrefilled() {
		return new ReturnElement(oTextQuestionCheckPrefilled,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question260367') and @value='3' and @checked='checked' and contains(@type,'radio')]")
	private WebElement oSingleSelectAnsCheckPrefilled;

	public ReturnElement getSingleSelectAnsCheckPrefilled() {
		return new ReturnElement(oSingleSelectAnsCheckPrefilled,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260368_dlOptions']//*[@selected='selected']")
	private WebElement oDropDownAnsCheckPrefilled;

	public ReturnElement getDropDownAnsCheckPrefilled() {
		return new ReturnElement(oDropDownAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260369_txtAnswer']")
	private WebElement oPhoneAnsCheckPrefilled;

	public ReturnElement getPhoneAnsCheckPrefilled() {
		return new ReturnElement(oPhoneAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260370_txtDate' and @value='8/2/1998']")
	private WebElement oDateAnsCheckPrefilled;

	public ReturnElement getDateAnsCheckPrefilled() {
		return new ReturnElement(oDateAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260371_txtAnswer' and @value='yashika@dispostable.com']")
	private WebElement oEMailAnsCheckPrefilled;

	public ReturnElement getEMailAnsCheckPrefilled() {
		return new ReturnElement(oEMailAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260372_txtFirstName' and @value='Jayesh']")
	private WebElement oFirstNameCheckPrefilled;

	public ReturnElement getFirstNameCheckPrefilled() {
		return new ReturnElement(oFirstNameCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question260372_txtLastName' and @value='Weiss']")
	private WebElement oLastNameCheckPrefilled;

	public ReturnElement getLastNameCheckPrefilled() {
		return new ReturnElement(oLastNameCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
