package com.ZippSlipAutomation.parentsignup.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ParentSignUpFlowRepository {

	@FindBy(id = "MainContent_aHrefRequestAccess")
	private WebElement oCreateParentAccountButton;

	public ReturnElement getCreateParentAccountButton() {
		return new ReturnElement(oCreateParentAccountButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = "//*[@id=\"divUserSelection\"]/div[1]/div/div[2]")
	private WebElement oSelectParentRole;

	public ReturnElement getSelectParentRole() {
		return new ReturnElement(oSelectParentRole, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(xpath = ".//*[@id='divFirstStepHeader']/h1")
	private WebElement oRegisterPageHeader;

	public ReturnElement getRegisterPageHeader() {
		return new ReturnElement(oRegisterPageHeader, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtFirstName")
	private WebElement oParentFirstName;

	public ReturnElement getParentFirstName() {
		return new ReturnElement(oParentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtLastName")
	private WebElement oParentLastName;

	public ReturnElement getParentLastName() {
		return new ReturnElement(oParentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtEmail")
	private WebElement oParentEmailText;

	public ReturnElement getParentEMailText() {
		return new ReturnElement(oParentEmailText, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtPassword")
	private WebElement oPasswordText;

	public ReturnElement getPasswordText() {
		return new ReturnElement(oPasswordText, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtConfirmPassword")
	private WebElement oConfirmPasswordText;

	public ReturnElement getConfirmPasswordText() {
		return new ReturnElement(oConfirmPasswordText, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtMobile")
	private WebElement oMobileNo;

	public ReturnElement getMobileNo() {
		return new ReturnElement(oMobileNo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "txtMobilePhoneNumber")
	private WebElement oMobileNumber;

	public ReturnElement getMobileNumber() {
		return new ReturnElement(oMobileNumber, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnCreateAccount")
	private WebElement oCreateAccountButton;

	public ReturnElement getCreateAccountButton() {
		return new ReturnElement(oCreateAccountButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "btnSubmit")
	private WebElement oContinueButton;

	public ReturnElement getContinueButton() {
		return new ReturnElement(oContinueButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "txtInstitutions")
	private WebElement oSearchInstitution;

	public ReturnElement getSearchInstitution() {
		return new ReturnElement(oSearchInstitution, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[contains(@id,'ui-id-')]")
	private WebElement oSelectInstitution;

	public ReturnElement getSelectInstitution() {
		return new ReturnElement(oSelectInstitution, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	
	@FindBy(id = "btnContinue")
	private WebElement oValidateInstitution;

	public ReturnElement getValidateInstitution() {
		return new ReturnElement(oValidateInstitution, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	
	@FindBy(xpath = ".//*[@id='divEnrolledChildStepHeader']/div/h1")
	private WebElement oEnterEnrolledStudentHeader;

	public ReturnElement getEnterEnrolledStudentHeader() {
		return new ReturnElement(oEnterEnrolledStudentHeader,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtStudentId")
	private WebElement oStudentId;

	public ReturnElement getStudentId() {
		return new ReturnElement(oStudentId, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_txtChildDoB_txtDate")
	private WebElement oDateOfBirth;

	public ReturnElement getDateOfBirth() {
		return new ReturnElement(oDateOfBirth, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnAddEnrolledChild")
	private WebElement oAddStudentButton;

	public ReturnElement getAddStudentButton() {
		return new ReturnElement(oAddStudentButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnIamDone")
	private WebElement oIamDoneButton;

	public ReturnElement getIamDoneButton() {
		return new ReturnElement(oIamDoneButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[contains(@id,'lblStudentAlreadyAttached') and contains(@class,'error show')]")
	private WebElement oEnrolledStudentErrorMessage;

	public ReturnElement getEnrolledStudentErrorMessage() {
		return new ReturnElement(oEnrolledStudentErrorMessage,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnSkip")
	private WebElement oSkipButton;

	public ReturnElement getSkipButton() {
		return new ReturnElement(oSkipButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='divNewChildStepHeader']/div/h1")
	private WebElement oEnterNewStudentDataHeader;

	public ReturnElement getEnterNewStudentDataHeader() {
		return new ReturnElement(oEnterNewStudentDataHeader, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtStudentFirstName")
	private WebElement oStudentFirstName;

	public ReturnElement getStudentFirstName() {
		return new ReturnElement(oStudentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtStudentLastName")
	private WebElement oStudentLastName;

	public ReturnElement getStudentLastName() {
		return new ReturnElement(oStudentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_txtNewChildDOB_txtDate")
	private WebElement oStudentDOB;

	public ReturnElement getStudentDOB() {
		return new ReturnElement(oStudentDOB, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ddlSchoolAdd")
	private WebElement oSchoolNameDropDown;

	public ReturnElement getSchoolNameDropDown() {
		return new ReturnElement(oSchoolNameDropDown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "ddlGradeAdd")
	private WebElement oGradeDropDown;

	public ReturnElement getGradeDropDown() {
		return new ReturnElement(oGradeDropDown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnAddChild")
	private WebElement oAddChildButton;

	public ReturnElement getAddChildButton() {
		return new ReturnElement(oAddChildButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnBack")
	private WebElement oBackButton;

	public ReturnElement getBackButton() {
		return new ReturnElement(oBackButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='MainContent_divThanxText']/div[2]/a")
	private WebElement oLoginAfterRegistration;

	public ReturnElement getLoginAfterRegistration() {
		return new ReturnElement(oLoginAfterRegistration, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtElectronicPin")
	private WebElement oNewElectronicPin;

	public ReturnElement getNewElectronicPin() {
		return new ReturnElement(oNewElectronicPin, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtConfirmNewPin")
	private WebElement oConfirmElectronicPin;

	public ReturnElement getConfirmElectronicPin() {
		return new ReturnElement(oConfirmElectronicPin, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnChangePin")
	private WebElement oAddElectronicPin;

	public ReturnElement getAddElectronicPin() {
		return new ReturnElement(oAddElectronicPin, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnOk")
	private WebElement oElectronicPinAddedButton;

	public ReturnElement getElectronicPinAddedButton() {
		return new ReturnElement(oElectronicPinAddedButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "Button1")
	private WebElement oWelcomeOkButton;

	public ReturnElement getWelcomeOkButton() {
		return new ReturnElement(oWelcomeOkButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
