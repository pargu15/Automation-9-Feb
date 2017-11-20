package com.ZippSlipAutomation.admin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class CommunicationPageRepository {

	@FindBy(id = "aSelectParticipants")
	private WebElement oAllRecipientsButton;

	public ReturnElement getAllRecipientsButton() {
		return new ReturnElement(oAllRecipientsButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtSearchGroup")
	private WebElement oGroupSearchTextBox;

	public ReturnElement getGroupSearchTextBox() {
		return new ReturnElement(oGroupSearchTextBox, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtSearchStudent")
	private WebElement oStudentSearchTextBox;

	public ReturnElement getStudentSearchTextBox() {
		return new ReturnElement(oStudentSearchTextBox, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnSearchGroup")
	private WebElement oGroupSearchButton;

	public ReturnElement getGroupSearchButton() {
		return new ReturnElement(oGroupSearchButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnSearchStudent")
	private WebElement oStudentSearchButton;

	public ReturnElement getStudentSearchButton() {
		return new ReturnElement(oStudentSearchButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "__tab_tbStudents")
	private WebElement oStudentsTab;

	public ReturnElement getStudentsTab() {
		return new ReturnElement(oStudentsTab, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "a_4546")
	private WebElement oFavSelectButton;

	public ReturnElement getFavSelectButton() {
		return new ReturnElement(oFavSelectButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "a_8562")
	private WebElement oNoticationGroupButton;

	public ReturnElement getNoticationGroupButton() {
		return new ReturnElement(oNoticationGroupButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "a_20677")
	private WebElement oProdAllStudentsGroupButton;

	public ReturnElement getProdAllStudentsGroupButton() {
		return new ReturnElement(oProdAllStudentsGroupButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "a_11764")
	private WebElement oSocialAllStudentsGroupButton;

	public ReturnElement getSocialAllStudentsGroupButton() {
		return new ReturnElement(oSocialAllStudentsGroupButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = "//p[text()='Jayesh Weiss']")
	private WebElement oEnglishStudentSelect;

	public ReturnElement getEnglishStudentSelect() {
		return new ReturnElement(oEnglishStudentSelect, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = "//p[text()='first last']")
	private WebElement oFrenchStudentSelect;

	public ReturnElement getFrenchStudentSelect() {
		return new ReturnElement(oFrenchStudentSelect, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_ParticipantControl_btnSaveParticipantPopup")
	private WebElement oSaveNCloseButton;

	public ReturnElement getSaveNCloseButton() {
		return new ReturnElement(oSaveNCloseButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnBack")
	private WebElement oBackButton;

	public ReturnElement getBackButton() {
		return new ReturnElement(oBackButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnCancel")
	private WebElement oCancelButton;

	public ReturnElement getCancelButton() {
		return new ReturnElement(oCancelButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnNext")
	private WebElement oNextButton;

	public ReturnElement getNextButton() {
		return new ReturnElement(oNextButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnSavePublish")
	private WebElement oSaveNPublish;

	public ReturnElement getSaveNPublish() {
		return new ReturnElement(oSaveNPublish, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "rbDoNotNotify")
	private WebElement oDoNotNotifyAll;

	public ReturnElement getDoNotNotifyAll() {
		return new ReturnElement(oDoNotNotifyAll, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "rbNotifyAll")
	private WebElement oNotifyAll;

	public ReturnElement getNotifyAll() {
		return new ReturnElement(oNotifyAll, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnOkConfirmPublishUnpublish")
	private WebElement oConfirmNPublishFinal;

	public ReturnElement getConfirmNPublishFinal() {
		return new ReturnElement(oConfirmNPublishFinal, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
