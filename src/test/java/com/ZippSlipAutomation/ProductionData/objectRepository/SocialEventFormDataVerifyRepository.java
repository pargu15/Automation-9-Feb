package com.ZippSlipAutomation.ProductionData.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class SocialEventFormDataVerifyRepository {

	@FindBy(id = "MainContent_Question49508_divAnswerText")
	private WebElement oTextQuestionCheck;

	public ReturnElement getTextQuestionCheck() {
		return new ReturnElement(oTextQuestionCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question49509_rblOption_0') and contains(@checked,'checked') and contains(@type,'radio')]")
	private WebElement oSingleSelectAnsCheck;

	public ReturnElement getSingleSelectAnsCheck() {
		return new ReturnElement(oSingleSelectAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question49510_cbMultiSelect_0') and contains(@checked,'checked') and contains(@type,'checkbox')]")
	private WebElement oMultiSelectAnsCheck;

	public ReturnElement getMultiSelectAnsCheck() {
		return new ReturnElement(oMultiSelectAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question49511_divAnswerText']/span")
	private WebElement oDropDownAnsCheck;

	public ReturnElement getDropDownAnsCheck() {
		return new ReturnElement(oDropDownAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question49512_txtAnswer') and contains(@value,'(666) 666-6666')]")
	private WebElement oPhoneAnsCheck;

	public ReturnElement getPhoneAnsCheck() {
		return new ReturnElement(oPhoneAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question49513_txtDate') and contains(@value,'1/1/1992')]")
	private WebElement oDateAnsCheck;

	public ReturnElement getDateAnsCheck() {
		return new ReturnElement(oDateAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49514_divAnswerText")
	private WebElement oEMailAnsCheck;

	public ReturnElement getEMailAnsCheck() {
		return new ReturnElement(oEMailAnsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Question49515_divAnswerText")
	private WebElement oFullNameCheck;

	public ReturnElement getFullNameCheck() {
		return new ReturnElement(oFullNameCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48510_txtAnswer' and @value='S433332']")
	private WebElement oTextQuestionCheckPrefilled;

	public ReturnElement getTextQuestionCheckPrefilled() {
		return new ReturnElement(oTextQuestionCheckPrefilled,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'MainContent_Question48511') and @value='2' and @checked='checked' and contains(@type,'radio')]")
	private WebElement oSingleSelectAnsCheckPrefilled;

	public ReturnElement getSingleSelectAnsCheckPrefilled() {
		return new ReturnElement(oSingleSelectAnsCheckPrefilled,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48512_dlOptions']//*[@selected='selected']")
	private WebElement oDropDownAnsCheckPrefilled;

	public ReturnElement getDropDownAnsCheckPrefilled() {
		return new ReturnElement(oDropDownAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48513_txtAnswer' and @value='(222) 222-2222']")
	private WebElement oPhoneAnsCheckPrefilled;

	public ReturnElement getPhoneAnsCheckPrefilled() {
		return new ReturnElement(oPhoneAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48514_txtDate' and @value='12/9/2016']")
	private WebElement oDateAnsCheckPrefilled;

	public ReturnElement getDateAnsCheckPrefilled() {
		return new ReturnElement(oDateAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48515_txtAnswer' and @value='romit@dispostable.com']")
	private WebElement oEMailAnsCheckPrefilled;

	public ReturnElement getEMailAnsCheckPrefilled() {
		return new ReturnElement(oEMailAnsCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48516_txtFirstName' and @value='Kate']")
	private WebElement oFirstNameCheckPrefilled;

	public ReturnElement getFirstNameCheckPrefilled() {
		return new ReturnElement(oFirstNameCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_Question48516_txtLastName' and @value='Smith']")
	private WebElement oLastNameCheckPrefilled;

	public ReturnElement getLastNameCheckPrefilled() {
		return new ReturnElement(oLastNameCheckPrefilled, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
}
