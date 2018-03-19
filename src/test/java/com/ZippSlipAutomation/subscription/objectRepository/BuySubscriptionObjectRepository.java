package com.ZippSlipAutomation.subscription.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class BuySubscriptionObjectRepository {

	@FindBy(id = "btnGetStartFlyer")
	private WebElement oStartFlyerButton;

	public ReturnElement getStartFlyerButton() {
		return new ReturnElement(oStartFlyerButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


@FindBy(id = "txtZipCode")
private WebElement oZippCode;

public ReturnElement getZippCode() {
	return new ReturnElement(oZippCode, Thread.currentThread().getStackTrace()[1].getMethodName());

}

@FindBy(id = "ddlInstitution")
private WebElement oSelectInstitution;

public ReturnElement getInstitution() {
	return new ReturnElement(oSelectInstitution, Thread.currentThread().getStackTrace()[1].getMethodName());

}

@FindBy(xpath = "//*[@id=\"ddlInstitution\"]/option[2]")
private WebElement oSelectInstitutionFromDropdown;

public ReturnElement getSelectInstitutionFromDropdown() {
	return new ReturnElement(oSelectInstitutionFromDropdown, Thread.currentThread().getStackTrace()[1].getMethodName());

}

@FindBy(id = "btnContinue")
private WebElement oContinueButton;

public ReturnElement getContinueButton() {
	return new ReturnElement(oContinueButton, Thread.currentThread().getStackTrace()[1].getMethodName());

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

@FindBy(id = "btnNext")
private WebElement oSubmitButton;

public ReturnElement getSubmitButton() {
	return new ReturnElement(oSubmitButton, Thread.currentThread().getStackTrace()[1].getMethodName());

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

@FindBy(xpath = "//*[@id=\"ulGetStarted\"]/li[2]/a")
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


@FindBy(xpath = "//*[@id=\"ulGetStarted\"]/li[3]/a")
private WebElement oCreateZippGramStep;

public ReturnElement getCreateZippGramStep() {
	return new ReturnElement(oCreateZippGramStep, Thread.currentThread().getStackTrace()[1].getMethodName());

}


@FindBy(id = "CreateZippGram")
private WebElement oCreateZippGram;

public ReturnElement getCreateZippGram() {
	return new ReturnElement(oCreateZippGram, Thread.currentThread().getStackTrace()[1].getMethodName());

}

@FindBy(id = "btnSendNow")
private WebElement oSendZippGram;

public ReturnElement getSendZippGramButton() {
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

@FindBy(xpath = "//*[@id=\"ulGetStarted\"]/li[4]/a")
private WebElement oCreateZippMessageStep;

public ReturnElement getCreateZippMessageStep() {
	return new ReturnElement(oCreateZippMessageStep, Thread.currentThread().getStackTrace()[1].getMethodName());

}


@FindBy(id = "CreateZippMessage")
private WebElement oCreateZippMessage;

public ReturnElement getCreateoCreateZippMessage() {
	return new ReturnElement(oCreateZippMessage, Thread.currentThread().getStackTrace()[1].getMethodName());

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


@FindBy(id = "btnSendMessage")
private WebElement oSendZippMessage;

public ReturnElement getSendZippMessage() {
	return new ReturnElement(oSendZippMessage, Thread.currentThread().getStackTrace()[1].getMethodName());

}

@FindBy(id = "btnSaveZippMessage")
private WebElement oSendZippMessageConfirmation;

public ReturnElement getSendZippMessageConfirmation() {
	return new ReturnElement(oSendZippMessageConfirmation, Thread.currentThread().getStackTrace()[1].getMethodName());

}

}
