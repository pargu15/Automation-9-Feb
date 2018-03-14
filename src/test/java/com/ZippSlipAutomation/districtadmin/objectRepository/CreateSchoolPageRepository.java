package com.ZippSlipAutomation.districtadmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class CreateSchoolPageRepository {

	@FindBy(xpath = "//span[contains(.,'School List')]")
	private WebElement oSchoolListSelect;

	public ReturnElement getSchoolList() {
		return new ReturnElement(oSchoolListSelect, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "spnCreateInstitutionHeader")
	private WebElement oCreateSchool;

	public ReturnElement getCreateSchool() {
		return new ReturnElement(oCreateSchool, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnSaveInstitution")
	private WebElement oSavebtn;

	public ReturnElement getSavebtn() {
		return new ReturnElement(oSavebtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnOkConfirm")
	private WebElement oOKbtn;

	public ReturnElement getOKbtn() {
		return new ReturnElement(oOKbtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = "//td[contains(.,'Name is Required')]")
	private WebElement errorMessageForSchoolName;

	public ReturnElement getErrorMessageForSchoolName() {
		return new ReturnElement(errorMessageForSchoolName,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "MainContent_liSchoolAdmins")
	private WebElement ofocusout;

	public ReturnElement getfocusout() {
		return new ReturnElement(ofocusout,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//td[contains(.,'Please Select State.')]")
	private WebElement errorMessageForSchoolState;

	public ReturnElement getErrorMessageForSchoolState() {
		return new ReturnElement(errorMessageForSchoolState,Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = "//td[contains(.,'Institution key is required.')]")
	private WebElement errorMessageForInstitutionkey;

	public ReturnElement getErrorMessageForInstitutionkey() {
		return new ReturnElement(errorMessageForInstitutionkey,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//span[contains(.,'URL is Already in use in this state by other School')]")
	private WebElement duplicateMessageForURL;

	public ReturnElement getDuplicateMessageForURL() {
		return new ReturnElement(duplicateMessageForURL,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//span[contains(.,'User with this Email Address already exists')]")
	private WebElement duplicateMessageForEmail;

	public ReturnElement getDuplicateMessageForEmail() {
		return new ReturnElement(duplicateMessageForEmail,Thread.currentThread().getStackTrace()[1].getMethodName());
	}




	@FindBy(xpath = "//span[contains(.,'URL is available')]")
	private WebElement confirmationMessageForURL;

	public ReturnElement getconfirmationMessageForURL() {
		return new ReturnElement(confirmationMessageForURL,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//span[contains(.,'This userid is available')]")
	private WebElement confirmationMessageForEmail;

	public ReturnElement getconfirmationMessageForEmail() {
		return new ReturnElement(confirmationMessageForEmail,Thread.currentThread().getStackTrace()[1].getMethodName());
	}



	@FindBy(xpath = "//td[contains(.,'School id is required.')]")
	private WebElement errorMessageForSchoolID;

	public ReturnElement getErrorMessageForSchoolID() {
		return new ReturnElement(errorMessageForSchoolID,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//td[@class='ajax__validatorcallout_error_message_cell']")
	private WebElement errorMessageForGrade;

	public ReturnElement getErrorMessageForGrade() {
		return new ReturnElement(errorMessageForGrade,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = "//td[contains(.,'URL Required')]")
	private WebElement errorMessageForSchoolURL;

	public ReturnElement getErrorMessageForSchoolURL() {
		return new ReturnElement(errorMessageForSchoolURL,Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = "//td[contains(.,'Admin First Name is required')]")
	private WebElement errorMessageForSchoolAdminName;

	public ReturnElement getErrorMessageForSchoolAdminName() {
		return new ReturnElement(errorMessageForSchoolAdminName,Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@FindBy(xpath = "//td[contains(.,'Email is required')]")
	private WebElement errorMessageForAdminEmail;

	public ReturnElement getErrorMessageForAdminEmail() {
		return new ReturnElement(errorMessageForAdminEmail,Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = "//td[contains(.,'Password id required')]")
	private WebElement errorMessageForAdminPassword;

	public ReturnElement getErrorMessageForAdminPassword() {
		return new ReturnElement(errorMessageForAdminPassword,Thread.currentThread().getStackTrace()[1].getMethodName());


	}

	@FindBy(id = "MainContent_txtSchoolName")
	private WebElement oSchoolName;

	public ReturnElement getSchoolName() {
		return new ReturnElement(oSchoolName,Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@FindBy(id = "ddlStates")
	private WebElement oSchoolState;

	public ReturnElement getSchoolState() {
		return new ReturnElement(oSchoolState,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtInstitutionKey")
	private WebElement oSchooKey;

	public ReturnElement getSchooKey() {
		return new ReturnElement(oSchooKey,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtSchoolId")
	private WebElement oSchoolId;

	public ReturnElement getSchoolId() {
		return new ReturnElement(oSchoolId,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "ddlGradeFrom")
	private WebElement oGradeFrom;

	public ReturnElement getGradeFrom() {
		return new ReturnElement(oGradeFrom,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "ddlGradeTo")
	private WebElement oGradeTo;

	public ReturnElement getGradeTo() {
		return new ReturnElement(oGradeTo,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtURL")
	private WebElement oSchoolURL;

	public ReturnElement getSchoolURL() {
		return new ReturnElement(oSchoolURL,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "MainContent_txtFirstName")
	private WebElement oAdminFirstName;

	public ReturnElement getAdminFirstName() {
		return new ReturnElement(oAdminFirstName,Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@FindBy(id = "MainContent_txtLastName")
	private WebElement oAdminLastName;

	public ReturnElement getAdminLastName() {
		return new ReturnElement(oAdminLastName,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtEmail")
	private WebElement oAdminEmail;

	public ReturnElement getAdminEmail() {
		return new ReturnElement(oAdminEmail,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtPassword")
	private WebElement oAdminPassword;

	public ReturnElement getAdminPassword() {
		return new ReturnElement(oAdminPassword,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
