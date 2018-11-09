package com.ZippSlipAutomation.subscription.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class BuySubscriptionObjectRepository {

	@FindBy(id = "btnGetStartFree")
	private WebElement oStartFlyerButton;
	
	public ReturnElement getStartFlyerButton() {
		return new ReturnElement(oStartFlyerButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnGetStartPermission")
	private WebElement oStartPermissionButton;
	
	public ReturnElement getStarPermissionButton() {
		return new ReturnElement(oStartPermissionButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtZipCode")
	private WebElement oZippCode;
	
	public ReturnElement getZippCode() {
		return new ReturnElement(oZippCode, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtInstitutionAutocomplete")
	private WebElement oSelectInstitution;
	
	public ReturnElement getInstitution() {
		return new ReturnElement(oSelectInstitution, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "ui-id-4")
	private WebElement oSelectInstitutionFromDropdown;
	
	public ReturnElement getSelectInstitutionFromDropdown() {
		return new ReturnElement(oSelectInstitutionFromDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnContinue")
	private WebElement oContinueButton;
	
	public ReturnElement getContinueButton() {
		return new ReturnElement(oContinueButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	

	@FindBy(id = "MainContent_aHrefRequestAccess")
	private WebElement oSignupBtn;
	
	public ReturnElement getSignupBtn() {
		return new ReturnElement(oSignupBtn, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	
	@FindBy(xpath = "//*[@id=\"divIamTeacher\"]/div[1]/div[1]/div") 
	private WebElement oTeacherRole;
	
	public ReturnElement getTeacherRole() {
		return new ReturnElement(oTeacherRole, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "txtFirstName")
	private WebElement oFirstName;
	
	public ReturnElement getFirstName() {
		return new ReturnElement(oFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	
	@FindBy(id = "txtLastName")
	private WebElement oLastName;
	
	public ReturnElement getLastName() {
		return new ReturnElement(oLastName, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	 
	
	
	@FindBy(id = "txtEmail")
	private WebElement oEmail;
	
	public ReturnElement getEmail() {
		return new ReturnElement(oEmail, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtMobile")
	private WebElement oMobile;
	
	public ReturnElement getMobile() {
		return new ReturnElement(oMobile, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtPassword")
	private WebElement oPassword;
	
	public ReturnElement getPassword() {
		return new ReturnElement(oPassword, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnSubmit")
	private WebElement oSubmitButton;
	
	public ReturnElement getSubmitButton() {
		return new ReturnElement(oSubmitButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	

	@FindBy(id = "ddlState")
	private WebElement oSchoolState;
	
	public ReturnElement getSchoolState() {
		return new ReturnElement(oSchoolState, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	
	@FindBy(xpath = "//*[@id=\"ddlState\"]/option[4]")
	private WebElement oSelectState;
	
	public ReturnElement getSelectState() {
		return new ReturnElement(oSelectState, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(xpath = "//*[@id=\"ui-id-1\"]/li[1]/a/small")
	private WebElement oSelectSchool;
	
	public ReturnElement getSelectSchool() {
		return new ReturnElement(oSelectSchool, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	@FindBy(id = "btnAddSchool")
	private WebElement oAddSchool;
	
	public ReturnElement getAddSchool() {
		return new ReturnElement(oAddSchool, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "txtOtp")
	private WebElement oOtp;
	
	public ReturnElement getOtp() {
		return new ReturnElement(oOtp, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnVerifyOtp")
	private WebElement oVerifyOtp;
	
	public ReturnElement getVerifyOtp() {
		return new ReturnElement(oVerifyOtp, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnplzConfirm")
	private WebElement oLoginButton;
	
	public ReturnElement getLoginButton() {
		return new ReturnElement(oLoginButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "AddClass")
	private WebElement oAddClassButton;
	
	public ReturnElement getAddClassButton() {
		return new ReturnElement(oAddClassButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "txtClassName")
	private WebElement oClassName;
	
	public ReturnElement getClassName() {
		return new ReturnElement(oClassName, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "ddlGrade")
	private WebElement oGradeDropdown;
	
	public ReturnElement getGradeDropdown() {
		return new ReturnElement(oGradeDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[@id=\"ddlGrade\"]/option[10]")
	private WebElement oSelectGradeDropdown;
	
	public ReturnElement getSelectGrade() {
		return new ReturnElement(oSelectGradeDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnCreate")
	private WebElement oCreateClass;
	
	public ReturnElement getCreateClass() {
		return new ReturnElement(oCreateClass, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[text()[contains(.,'Invite parent via email/SMS')]]") 
	private WebElement oInviteParentStep;
	
	public ReturnElement getInviteParentStep() {
		return new ReturnElement(oInviteParentStep, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[@id=\"ddlSelectEmails\"]/div/input")
	private WebElement oParentEmail;
	
	public ReturnElement getParentEmail() {
		return new ReturnElement(oParentEmail, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "InviteParent")
	private WebElement oInviteParent;
	
	public ReturnElement getInviteParentButton() {
		return new ReturnElement(oInviteParent, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnSendInvite")
	private WebElement oSendInvite;
	
	public ReturnElement getSendInvite() {
		return new ReturnElement(oSendInvite, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[text()[contains(.,'Send first Permission Slip')]]")
	private WebElement oCreatePermissionSlip;
	
	public ReturnElement getCreatePermissionSlipStep() {
		return new ReturnElement(oCreatePermissionSlip, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "CreatePermissionSlip")
	private WebElement oPermissionSlip;
	
	public ReturnElement getPermissionSlipButton() {
		return new ReturnElement(oPermissionSlip, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtName")
	private WebElement oEventName;
	
	public ReturnElement getEventName() {
		return new ReturnElement(oEventName, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	
	@FindBy(xpath = "//*[text()[contains(.,'Send first ZippGram')]]")
	//@FindBy(xpath = "//*[@id=\"ulGetStarted\"]/li[3]/a")
	private WebElement oCreateZippGramStep;
	
	public ReturnElement getCreateZippGramStep() {
		return new ReturnElement(oCreateZippGramStep, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "MainContent_divSentZippGram")
	private WebElement oCreateZippGram;
	
	public ReturnElement getCreateZippGram() {
		return new ReturnElement(oCreateZippGram, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnSendNow")
	private WebElement oSendZippGram;
	
	public ReturnElement getSendButton() {
		return new ReturnElement(oSendZippGram, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "rbDoNotNotify")
	private WebElement oDoNotNotify;
	
	public ReturnElement getDoNotNotify() {
		return new ReturnElement(oDoNotNotify, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "MainContent_btnOkConfirmPublishUnpublish")
	private WebElement oConfirmPublishUnpublish;
	
	public ReturnElement getConfirmPublishUnpublish() {
		return new ReturnElement(oConfirmPublishUnpublish, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[text()[contains(.,'Send first ZippMessage')]]")
	private WebElement oCreateZippMessageStep;
	
	public ReturnElement getCreateZippMessageStep() {
		return new ReturnElement(oCreateZippMessageStep, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
		
	@FindBy(id = "txtZippGramTitle")
	private WebElement oZippMessageTitle;
	
	public ReturnElement getZippMessageTitle() {
		return new ReturnElement(oZippMessageTitle, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtzipText")
	private WebElement oZippMessageText;
	
	public ReturnElement getZippMessageText() {
		return new ReturnElement(oZippMessageText, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "2")
	private WebElement oZippMessageEmailText;
	
	public ReturnElement getZippMessageEmailText() {
		return new ReturnElement(oZippMessageEmailText, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(id = "btnSendZippMessage")
	private WebElement oSendZippMessage;
	
	public ReturnElement getSendZippMessage() {
		return new ReturnElement(oSendZippMessage, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnSendMessageBottom")
	private WebElement oSubmitZippMessage;
	
	public ReturnElement getSubmitZippMessage() {
		return new ReturnElement(oSubmitZippMessage, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnSaveZippMessage")
	private WebElement oSendZippMessageConfirmation;
	
	public ReturnElement getSendZippMessageConfirmation() {
		return new ReturnElement(oSendZippMessageConfirmation, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[text()[contains(.,'Add Payment Card')]]")
	private WebElement oAddCardStep;
	
	public ReturnElement getAddCardStep() {
		return new ReturnElement(oAddCardStep, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	@FindBy(id = "txtFullName")
	private WebElement oCardHolderName;
	
	public ReturnElement getCardHolderName() {
		return new ReturnElement(oCardHolderName, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtCreditCardNumber")
	private WebElement oCreditCardNumber;
	
	public ReturnElement getCreditCardNumber() {
		return new ReturnElement(oCreditCardNumber, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "ddlExpiryYear")
	private WebElement oCreditCardExpiryDropdown;
	
	public ReturnElement getCreditCardExpiryDropdown() {
		return new ReturnElement(oCreditCardExpiryDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
		
	@FindBy(xpath = "//*[@id=\"ddlExpiryYear\"]/option[4]")
	private WebElement oCardExpiryYear;
	
	public ReturnElement getCardExpiryYear() {
		return new ReturnElement(oCardExpiryYear, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "txtCreditCardCVV")
	private WebElement oCreditCardCVV;
	
	public ReturnElement getCreditCardCVV() {
		return new ReturnElement(oCreditCardCVV, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "MainContent_btnNext")
	private WebElement oAddButton;
	
	public ReturnElement getAddButton() {
		return new ReturnElement(oAddButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	
	@FindBy(xpath = "//*[@id=\"MenuSchool\"]/ul/li[7]/a/span")
	private WebElement oMySubscriptionTab;
	
	public ReturnElement getMySubscriptionTab() {
		return new ReturnElement(oMySubscriptionTab, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "MainContent_btnStartTrail")
	private WebElement oStart30daysTrail;
	
	public ReturnElement getStart30daysTrail() {
		return new ReturnElement(oStart30daysTrail, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnGetStarted")
	private WebElement oConfirm30daysTrail;
	
	public ReturnElement getConfirm30daysTrail() {
		return new ReturnElement(oConfirm30daysTrail, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnUpgrade")
	private WebElement oPermissionUpgrade;
	
	public ReturnElement getPermissionUpgrade() {
		return new ReturnElement(oPermissionUpgrade, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	@FindBy(id = "ddlSelectPackage")
	private WebElement oSelectPackage;
	
	public ReturnElement getSelectPackage() {
		return new ReturnElement(oSelectPackage, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}

	@FindBy(xpath = "//*[@id=\"ddlSelectPackage\"]/option[2]")
	private WebElement oSelectPackageFromDropdown;
	
	public ReturnElement getSelectPackageFromDropdown() {
		return new ReturnElement(oSelectPackageFromDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(id = "btnPay")
	private WebElement oPayButton;
	
	public ReturnElement getPayButton() {
		return new ReturnElement(oPayButton, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
	@FindBy(xpath = "//*[@id=\"divSuccess\"]/button")
	private WebElement oPaymentSuccessful;
	
	public ReturnElement getPaymentSuccessful() {
		return new ReturnElement(oPaymentSuccessful, Thread.currentThread().getStackTrace()[1].getMethodName());
	
	}
	
}
