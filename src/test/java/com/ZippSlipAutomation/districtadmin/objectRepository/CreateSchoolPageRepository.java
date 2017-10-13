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
	

	@FindBy(xpath = "//a[@class='right blue-btn']")
	private WebElement oCreateSchool;

	public ReturnElement getCreateSchool() {
		return new ReturnElement(oCreateSchool, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnSaveInstitution")
	private WebElement oSavebtn;

	public ReturnElement getSavebtn() {
		return new ReturnElement(oSavebtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(xpath = "//td[contains(.,'Name is Required')]")
	private WebElement errorMessageForSchoolName;

	public ReturnElement getErrorMessageForSchoolName() {
		return new ReturnElement(errorMessageForSchoolName,Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = "//td[contains(.,'Institution key is required.')]")
	private WebElement errorMessageForInstitutionkey;

	public ReturnElement getErrorMessageForInstitutionkey() {
		return new ReturnElement(errorMessageForInstitutionkey,Thread.currentThread().getStackTrace()[1].getMethodName());
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
	}
