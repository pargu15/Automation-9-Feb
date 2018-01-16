package com.ZippSlipAutomation.admin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class CreateZippGramPageRepository {

	@FindBy(id = "MainContent_CreateZippWireButton")
	private WebElement oCreateZippGramBtn;

	public ReturnElement getCreateZippGram() {
		return new ReturnElement(oCreateZippGramBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "txtZippGramTitle")
	private WebElement oZippGramName;

	public ReturnElement getZippGramName() {
		return new ReturnElement(oZippGramName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnNext")
	private WebElement oNextButton;

	public ReturnElement getNextButton() {
		return new ReturnElement(oNextButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(className = "ajax__validatorcallout_error_message_cell")
	private WebElement errorMessageForZippGramname;

	public ReturnElement getErrorMessageForZippGramname() {
		return new ReturnElement(errorMessageForZippGramname, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='1']/div[1]")
	private WebElement oParagraph;

	public ReturnElement getParagraph() {
		return new ReturnElement(oParagraph, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='dragablecontrol']/div[2]/p/span[1]") 

	private WebElement oImage;

	public ReturnElement getImageControl() {
		return new ReturnElement(oImage, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//a[@onclick='UploadImage(this);']") 

	private WebElement ouploadImageBtn;

	public ReturnElement getuploadImageBtn() {
		return new ReturnElement(ouploadImageBtn, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[@id='dragablecontrol']/div[3]/p/span[1]") 

	private WebElement oVideo;

	public ReturnElement getVideoControl() {
		return new ReturnElement(oVideo, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//a[contains(@id,'btn_vidprev')]") 

	private WebElement oAddVideo;

	public ReturnElement getAddVideo() {
		return new ReturnElement(oAddVideo, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtZippGramVideoPath") 

	private WebElement oVideoPath;

	public ReturnElement getVideoPath() {
		return new ReturnElement(oVideoPath, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "spnVideoPath") 

	private WebElement oErrorForVideo;

	public ReturnElement ErrorForVideo() {
		return new ReturnElement(oErrorForVideo, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "bntZippGramAddVideo") 

	private WebElement oVideoPathAddBtn;

	public ReturnElement getVideoPathAddBtn() {
		return new ReturnElement(oVideoPathAddBtn, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='dragablecontrol']/div[4]/p") 

	private WebElement oPoll;

	public ReturnElement getPollControl() {
		return new ReturnElement(oPoll, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//a[contains(@id,'pollbtn_')]") 

	private WebElement oAddPoll;

	public ReturnElement getAddPoll() {
		return new ReturnElement(oAddPoll, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtQuestionText") 

	private WebElement oAddPollQues;

	public ReturnElement getAddPollQues() {
		return new ReturnElement(oAddPollQues, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "spnTxtQuestionTextValidation") 

	private WebElement oErrorForPollQues;

	public ReturnElement getErrorForAddPollQues() {
		return new ReturnElement(oErrorForPollQues, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtzipOptionText") 

	private WebElement oAddPollOptn;

	public ReturnElement getAddPollOptn() {
		return new ReturnElement(oAddPollOptn, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "spnZippOptionValidation") 

	private WebElement oErrorForPollOptn;

	public ReturnElement getErrorForAddPollOptn() {
		return new ReturnElement(oErrorForPollOptn, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//input[contains(@onclick,'AddOptionsInPopUp()')]") 

	private WebElement oAddPollOptnBtn;

	public ReturnElement getAddPollOptnBtn() {
		return new ReturnElement(oAddPollOptnBtn, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(id = "btnPollOkclick") 

	private WebElement oSubmitPollQues;

	public ReturnElement getSubmitPollQues() {
		return new ReturnElement(oSubmitPollQues, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='MenuSchool']/ul/li[3]/a")
	private WebElement oParentActivitiesDropdown;

	public ReturnElement getParentActivitiesDropdown() {
		return new ReturnElement(oParentActivitiesDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='MenuSchool:submenu:4']/li[3]/a/span")
	private WebElement oZippGramFieldInDropdown;

	public ReturnElement getZippGramFieldInDropdown() {
		return new ReturnElement(oZippGramFieldInDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	

	@FindBy(id = "MainContent_divCurrentStatus")
	private WebElement oEventCurrentStatus;

	public ReturnElement getZippGramCurrentStatus() {
		return new ReturnElement(oEventCurrentStatus, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "divChangeEventPublishStatus")
	private WebElement oChangeEventPublishStatus;

	public ReturnElement getChangeZippGramPublishStatus() {
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

}
