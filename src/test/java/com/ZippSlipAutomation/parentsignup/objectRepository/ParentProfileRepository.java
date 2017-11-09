package com.ZippSlipAutomation.parentsignup.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class ParentProfileRepository {

	ExcelReadEvent excelReadEvent = new ExcelReadEvent();


	@FindBy(id = "aUserName")
	private WebElement oProfileButton;

	public ReturnElement getProfileButton() {
		return new ReturnElement(oProfileButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_lblProfileHeader")
	private WebElement oMyProfilePageHeader;

	public ReturnElement getMyProfilePageHeader() {
		return new ReturnElement(oMyProfilePageHeader, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtUserName")
	private WebElement oParentUserNameField;

	public ReturnElement getParentUserNameField() {
		return new ReturnElement(oParentUserNameField, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_txtFirstName")
	private WebElement oParentFirstNameField;

	public ReturnElement getParentFirstNameField() {
		return new ReturnElement(oParentFirstNameField, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_txtLastName")
	private WebElement oParentLastNameField;

	public ReturnElement getParentLastNameField() {
		return new ReturnElement(oParentLastNameField, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_txtPrimaryParentMobileNumber_phoneno")
	private WebElement oParentMobileNumberField;

	public ReturnElement getParentMobileNumberField() {
		return new ReturnElement(oParentMobileNumberField, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "lblChildFirstName")
	private WebElement oNewStudentFirstName;

	public ReturnElement getNewStudentFirstName() {
		return new ReturnElement(oNewStudentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "lblChildLastName")
	private WebElement oNewStudentLastName;

	public ReturnElement getNewStudentLastName() {
		return new ReturnElement(oNewStudentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
