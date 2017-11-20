package com.ZippSlipAutomation.admin.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class EventPageRepository {

	@FindBy(id = "MainContent_CreateActivityButton")
	private WebElement oActivityDropDown;

	public ReturnElement getActivityDropDown() {
		return new ReturnElement(oActivityDropDown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_SelectActivityControl1_btnCreateEvent")
	private WebElement oCreateEvent;

	public ReturnElement getCreateEventButton() {
		return new ReturnElement(oCreateEvent, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ddlActivityList")
	private WebElement oCopyExistingActivity;

	public ReturnElement getCopyExistingActivity() {
		return new ReturnElement(oCopyExistingActivity, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MenuSchool']/ul/li[3]/a")
	private WebElement oParentActivitiesDropdown;

	public ReturnElement getParentActivitiesDropdown() {
		return new ReturnElement(oParentActivitiesDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MenuSchool:submenu:4']/li[1]/a")
	private WebElement oEventFieldInDropdown;

	public ReturnElement getEventFieldInDropdown() {
		return new ReturnElement(oEventFieldInDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_divCurrentStatus")
	private WebElement oEventCurrentStatus;

	public ReturnElement getEventCurrentStatus() {
		return new ReturnElement(oEventCurrentStatus, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "divChangeEventPublishStatus")
	private WebElement oChangeEventPublishStatus;

	public ReturnElement getChangeEventPublishStatus() {
		return new ReturnElement(oChangeEventPublishStatus, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnOkConfrm")
	private WebElement oClickOnConfirmToUnpublish;

	public ReturnElement getClickOnConfirmToUnpublish() {
		return new ReturnElement(oClickOnConfirmToUnpublish, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "txtName")
	private WebElement oEventName;

	public ReturnElement getEventName() {
		return new ReturnElement(oEventName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtLocation")
	private WebElement oLocationName;

	public ReturnElement getLocationName() {
		return new ReturnElement(oLocationName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ckActivityDescription")
	private WebElement oDescription;

	public ReturnElement getDescription() {
		return new ReturnElement(oDescription, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnOkconfirm")
	private WebElement oButtonOkConfirm;

	public ReturnElement getButtonOkConfirm() {
		return new ReturnElement(oButtonOkConfirm, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cbRespondOnlyYes")
	private WebElement oDoNotRespondNoCheck;

	public ReturnElement getDoNotRespondNoCheck() {
		return new ReturnElement(oDoNotRespondNoCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "spanAttachments")
	private WebElement oAdvancedSettings;

	public ReturnElement getAdvancedSettings() {
		return new ReturnElement(oAdvancedSettings, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cbShowDifference")
	private WebElement oShowFormDifferenceCheck;

	public ReturnElement getShowFormDifferenceCheck() {
		return new ReturnElement(oShowFormDifferenceCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cblPrintSetting_0")
	private WebElement oSummaryPageCheck;

	public ReturnElement getSummaryPageCheck() {
		return new ReturnElement(oSummaryPageCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cblPrintSetting_1")
	private WebElement oAllFormsCheck;

	public ReturnElement getAllFormsCheck() {
		return new ReturnElement(oAllFormsCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtPrintSummaryDescription")
	private WebElement oPrintInstruction;

	public ReturnElement getPrintInstruction() {
		return new ReturnElement(oPrintInstruction, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cbAllowResponseEdit")
	private WebElement oAllowResponseEditCheck;

	public ReturnElement getAllowResponseEditCheck() {
		return new ReturnElement(oAllowResponseEditCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cbNoAllowZippNote")
	private WebElement oDoNotAllowZippNoteCheck;

	public ReturnElement getDoNotAllowZippNoteCheck() {
		return new ReturnElement(oDoNotAllowZippNoteCheck, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "cbDocumentRequired")
	private WebElement oRecipientToUploadFiles;

	public ReturnElement getRecipientToUploadFiles() {
		return new ReturnElement(oRecipientToUploadFiles, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtDocumentDescription")
	private WebElement oSpecifyDocs;

	public ReturnElement getSpecifyDocs() {
		return new ReturnElement(oSpecifyDocs, Thread.currentThread().getStackTrace()[1].getMethodName());

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

	@FindBy(className = "ajax__validatorcallout_error_message_cell")
	private WebElement errorMessageForEventname;

	public ReturnElement getErrorMessageForEventname() {
		return new ReturnElement(errorMessageForEventname, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='vceParticipantType_popupTable']/tbody/tr/td[3]")
	private WebElement errorMessageForParticipantType;

	public ReturnElement getErrorMessageForParticipantType() {
		return new ReturnElement(errorMessageForParticipantType,
				Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "rbStudentParentBoth")
	private WebElement parentStudentButton;

	public ReturnElement getParentStudentButton() {
		return new ReturnElement(parentStudentButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtSearchForms")
	private WebElement searchFormTextbox;

	public ReturnElement getSearchformTextbox() {
		return new ReturnElement(searchFormTextbox, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "btnSearchForms")
	private WebElement searchFormButton;

	public ReturnElement getSearchformButton() {
		return new ReturnElement(searchFormButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//p[contains(.,'AutomationTestForm_DataToBeEntered')]")
	private WebElement formSelection;

	public ReturnElement getRequiredformButton() {
		return new ReturnElement(formSelection, Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@FindBy(id = "MainContent_btnOk")
	private WebElement FormSelectionOkButton;

	public ReturnElement getFormOkConfirmationButton() {
		return new ReturnElement(FormSelectionOkButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@FindBy(id = "pnlConfirm")
	private WebElement confirmationForNoLocation;

	public ReturnElement getConfirmationForNoLocation() {
		return new ReturnElement(confirmationForNoLocation, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "lblmessage")
	private WebElement messageInConfirmForNoLocation;

	public ReturnElement getMessageInConfirmForNoLocation() {
		return new ReturnElement(messageInConfirmForNoLocation,
				Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "MainContent_btnCancelConfirm")
	private WebElement cancelButtonInPopup;

	public ReturnElement getCancelButtonInPopup() {
		return new ReturnElement(cancelButtonInPopup, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "MainContent_btnOkconfirm")
	private WebElement OKButtonInPopup;

	public ReturnElement getOKButtonInPopup() {
		return new ReturnElement(OKButtonInPopup, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "rbParentOnly")
	private WebElement parentOnly;

	public ReturnElement getParentOnly() {
		return new ReturnElement(parentOnly, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "rbFormPacketParentOnly")
	private WebElement parentOnlyFormPacket;

	public ReturnElement getParentOnlyFormPacket() {
		return new ReturnElement(parentOnlyFormPacket, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "rbStudentParentBoth")
	private WebElement parentStudentBoth;

	public ReturnElement getParentStudentBoth() {
		return new ReturnElement(parentStudentBoth, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "divSelectFavoriteForms")
	private WebElement tableForForms;

	public ReturnElement getTableForForms() {
		return new ReturnElement(tableForForms, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "rbNoConsentRequired")
	private WebElement noConsentRequired;

	public ReturnElement getNoConsentRequired() {
		return new ReturnElement(noConsentRequired, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "cbRespondOnlyYes")
	private WebElement respondOnlyYes;

	public ReturnElement getRespondOnlyYes() {
		return new ReturnElement(respondOnlyYes, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "aViewForms")
	private WebElement seeAllFormsButton;

	public ReturnElement getSeeAllFormsButton() {
		return new ReturnElement(seeAllFormsButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "MainContent_pnlForm")
	private WebElement seeAllFormsPopup;

	public ReturnElement getSeeAllFormsPopup() {
		return new ReturnElement(seeAllFormsPopup, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='cb_432']")
	private WebElement firstForm;

	public ReturnElement getFirstForm() {
		return new ReturnElement(firstForm, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	// buttons in form
	// popup----------------------------------------------------------------------------------

	@FindBy(id = "MainContent_btnFormSelectionCancel")
	private WebElement cancelButtonInFormsPopup;

	public ReturnElement getCancelButtonInFormsPopup() {
		return new ReturnElement(cancelButtonInFormsPopup, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='tblFavoriteForms']/tbody/tr[1]/td[2]")
	private WebElement firstFormName;

	public ReturnElement getFirstFormName() {
		return new ReturnElement(firstFormName, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	// to find the checkbox corresponding to a form
	String checkboxCorrospondingToForm = "//table[@id='tblFavoriteForms']/descendant::*[contains(text(),'k1')]/parent::td/parent::tr/td[1]/input";

	public ReturnElement getCheckboxCorrospondingToForm(String k) {
		return new ReturnElement(DriverInitiation.getDriver().findElement(By.xpath(setCheckboxCorrospondingToForm(k))),
				"Checkbox Corrosponding To Form ( " + k + " )");
	}

	public String setCheckboxCorrospondingToForm(String k) {
		return checkboxCorrospondingToForm.replace("k1", k);
	}

	// xpath for div containing currently selected
	// forms--------------------------------------------------------

	public ReturnElement getCurrentSelectedFormsSection() {
		return new ReturnElement(currentSelectedFormsSection,
				Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//ul[@id='ulFinalSelectedParentForms']")
	private WebElement currentSelectedFormsSection;

	// sections displayed after advanced settings button is clicked
	@FindBy(id = "ulAttachments")
	private WebElement attachmentSection;

	public ReturnElement getAttachmentSection() {
		return new ReturnElement(attachmentSection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "uiAdvanced")
	private WebElement paymentSection;

	public ReturnElement getPaymentSection() {
		return new ReturnElement(paymentSection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ulSettings")
	private WebElement settingSection;

	public ReturnElement getSettingSection() {
		return new ReturnElement(settingSection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	// Attachments Section Objects

	@FindBy(id = "txtVideoPath")
	private WebElement videoTextbox;

	public ReturnElement getVideoTextbox() {
		return new ReturnElement(videoTextbox, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "bntAddVideo")
	private WebElement addVideoButton;

	public ReturnElement getAddVideoButton() {
		return new ReturnElement(addVideoButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "ctl00_MainContent_flupload_fileUpload_ctl02")
	private WebElement docUploadButton;

	public ReturnElement getDocUploadButton() {
		return new ReturnElement(docUploadButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "ctl00_MainContent_flUploadPicture_fileUpload_ctl02")
	private WebElement pictureUploadButton;

	public ReturnElement getPictureUploadButton() {
		return new ReturnElement(pictureUploadButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "divSelectedVideos")
	private WebElement videosDiv;

	public ReturnElement getVideosDiv() {
		return new ReturnElement(videosDiv, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	// xpaths of uploaded
	// documents--------------------------------------------------

	String uploadedDoc = "//div[@id='MainContent_flupload_spanUpload']/ul/child::li/*[contains(text(),'key1')]";

	public ReturnElement getUploadedDoc(String key) {
		return new ReturnElement(DriverInitiation.getDriver().findElement(By.xpath(setUploadedDoc(key))),
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	public String setUploadedDoc(String key) {
		return uploadedDoc.replace("key1", key);

	}

	/*------------------Payments Section--------------------------------------------------------------------*/

	@FindBy(id = "txtEnterAdditionalItem")
	private WebElement addItemTextbox;

	public ReturnElement getAddItemTextbox() {
		return new ReturnElement(addItemTextbox, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "btnAdAdditinalItem")
	private WebElement addItemButton;

	public ReturnElement getAddItemButton() {
		return new ReturnElement(addItemButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/*
	 * @FindBy(id="cblPaymentMode_0") private WebElement cashMode;
	 */

	@FindBy(xpath = ".//*[@id='cblPaymentMode_0']")
	private WebElement cashMode;

	public ReturnElement getCashMode() {
		return new ReturnElement(cashMode, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "cblPaymentMode_1")
	private WebElement checkMode;

	public ReturnElement getCheckMode() {
		return new ReturnElement(checkMode, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "cblPaymentMode_2")
	private WebElement creditDebitMode;

	public ReturnElement getCreditDebitMode() {
		return new ReturnElement(creditDebitMode, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtCashCheckInstructions")
	private WebElement cashInstructions;

	public ReturnElement getCashInstructions() {
		return new ReturnElement(cashInstructions, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//table[@id='tblPaymentItems']")
	private WebElement feeTable;

	// List<WebElement> rows =feeTable.findElements(By.tagName("tr"));
	// System.out.println("Number of rows:"+rows.size());

	public ReturnElement getFeeTable() {
		return new ReturnElement(feeTable, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//table[@id='tblPaymentItems']/tbody/tr")
	private List<WebElement> rows;

	public List<WebElement> getAllItemsRows() {
		return rows;
	}

	String fees = "//tbody/tr[num]/td[@class='textcenter feetext']/input";

	public ReturnElement getFees(String u) {
		return new ReturnElement(DriverInitiation.getDriver().findElement(By.xpath(setFees(u))),
				Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	public String setFees(String u) {
		return fees.replace("num", u);
	}

	@FindBy(id = "spanTotalFee")
	private WebElement totalSum;

	public ReturnElement getTotalSum() {
		return new ReturnElement(totalSum, Thread.currentThread().getStackTrace()[1].getMethodName());
	}



}
