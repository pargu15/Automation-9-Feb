package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class EventConsentFlowRepository {

	@FindBy(xpath = ".//*[@id='MainContent_EventListViewControl1_aViewAll']/span")
	private WebElement oViewAllButton;

	public ReturnElement getViewAllButton() {
		return new ReturnElement(oViewAllButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "Pager_lbNext")
	private WebElement oNextButton;

	public ReturnElement getNextButton() {
		return new ReturnElement(oNextButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnRespondNoBottom")
	private WebElement oBackButton;

	public ReturnElement getBackButton() {
		return new ReturnElement(oBackButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnRespondNoBottom")
	private WebElement oRespondNoButton;

	public ReturnElement getRespondNoButton() {
		return new ReturnElement(oRespondNoButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnRespondYesBottom")
	private WebElement oRespondYesButton;

	public ReturnElement getRespondYesButton() {
		return new ReturnElement(oRespondYesButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnStartResponseBottom")
	private WebElement oRespondYesButtonForFormEvent;

	public ReturnElement getRespondYesForFormEvent() {
		return new ReturnElement(oRespondYesButtonForFormEvent,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnOkConfirm")
	private WebElement oOkConfirmAfterYesResponse;

	public ReturnElement getOkConfirmAfterYesResponse() {
		return new ReturnElement(oOkConfirmAfterYesResponse, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnNext")
	private WebElement oSaveNNextButton;

	public ReturnElement getSaveNNextButton() {
		return new ReturnElement(oSaveNNextButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtNotes")
	private WebElement oZippNoteTextBox;

	public ReturnElement getZippNoteTextBox() {
		return new ReturnElement(oZippNoteTextBox, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnCommit")
	private WebElement oSubmitFormsButton;

	public ReturnElement getSubmitFormsButton() {
		return new ReturnElement(oSubmitFormsButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnCommit")
	private WebElement oAcceptNPay;

	public ReturnElement getAcceptNPay() {
		return new ReturnElement(oAcceptNPay, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "chkDontShowMessage")
	private WebElement oDontShowMessageButton;

	public ReturnElement getDontShowMessageButton() {
		return new ReturnElement(oDontShowMessageButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_Button2")
	private WebElement oFinalOkButton;

	public ReturnElement getFinalOkButton() {
		return new ReturnElement(oFinalOkButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnEditResponseBottom")
	private WebElement oEditResponseButton;

	public ReturnElement getEditResponseButton() {
		return new ReturnElement(oEditResponseButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_aViewForms")
	private WebElement oViewForms;

	public ReturnElement getViewForms() {
		return new ReturnElement(oViewForms, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
