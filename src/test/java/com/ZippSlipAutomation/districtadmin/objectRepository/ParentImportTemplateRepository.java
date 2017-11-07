package com.ZippSlipAutomation.districtadmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ParentImportTemplateRepository {
	
	@FindBy(xpath = ".//span[contains(.,'Administration')]")
	private WebElement oAdministrationLink;

	public ReturnElement getAdministrationLink() {
		return new ReturnElement(oAdministrationLink, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(xpath = "//span[contains(.,'Import Template Library')]")
	private WebElement oImportTemplate;

	public ReturnElement getImportTemplate() {
		return new ReturnElement(oImportTemplate, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//span[contains(.,'Create Template')]")
	private WebElement oCreateTemplateBtn;

	public ReturnElement getCreateTemplateBtn() {
		return new ReturnElement(oCreateTemplateBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "txtTemplateName")
	private WebElement oTemplateName;

	public ReturnElement getTemplateName() {
		return new ReturnElement(oTemplateName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "txtTemplateDescription")
	private WebElement oTemplateDescription;

	public ReturnElement getTemplateDescription() {
		return new ReturnElement(oTemplateDescription, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "ddlImportType")
	private WebElement oImportTypeDropDown;

	public ReturnElement getImportTypeDropDown() {
		return new ReturnElement(oImportTypeDropDown, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//option[contains(.,'User Profile')]")
	private WebElement oUserProfileImport;

	public ReturnElement getUserProfileImport() {
		return new ReturnElement(oUserProfileImport, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "divParentStudentFormImport")
	private WebElement oParentStudentImport;

	public ReturnElement getParentStudentImport() {
		return new ReturnElement(oParentStudentImport, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "divUploadFile")
	private WebElement oDivUploadFile;

	public ReturnElement getDivUploadFile() {
		return new ReturnElement(oDivUploadFile, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "ctl00_MainContent_fileUploadControl_ctl02")
	private WebElement oUploadFileBtn;

	public ReturnElement getUploadFileBtn() {
		return new ReturnElement(oUploadFileBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[2]")
	private WebElement oAvailableSchoolID;

	public ReturnElement getAvailableSchoolID() {
		return new ReturnElement(oAvailableSchoolID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='231']")
	private WebElement oMappedSchooID;

	public ReturnElement getMappedSchoolID() {
		return new ReturnElement(oMappedSchooID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[3]")
	private WebElement oAvailableStudentID;

	public ReturnElement getAvailableStudentID() {
		return new ReturnElement(oAvailableStudentID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='1']")
	private WebElement oMappedStudentID;

	public ReturnElement getMappedStudentID() {
		return new ReturnElement(oMappedStudentID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[4]")
	private WebElement oAvailableParentFirstName;

	public ReturnElement getAvailableParentFirstName() {
		return new ReturnElement(oAvailableParentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='19']")
	private WebElement oMappedParentFirstName;

	public ReturnElement getMappedParentFirstName() {
		return new ReturnElement(oMappedParentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[5]")
	private WebElement oAvailableParentLastName;

	public ReturnElement getAvailableParentLastName() {
		return new ReturnElement(oAvailableParentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='21']")
	private WebElement oMappedParentLastName;

	public ReturnElement getMappedParentLastName() {
		return new ReturnElement(oMappedParentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[6]")
	private WebElement oAvailableParentEmail;

	public ReturnElement getAvailableParentEmail() {
		return new ReturnElement(oAvailableParentEmail, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='22']")
	private WebElement oMappedParentEmail;

	public ReturnElement getMappedParentEmail() {
		return new ReturnElement(oMappedParentEmail, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[7]")
	private WebElement oAvailableParentPassword;

	public ReturnElement getAvailableParentPassword() {
		return new ReturnElement(oAvailableParentPassword, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	
	
	@FindBy(xpath = ".//*[@id='52']")
	private WebElement oMappedParentPassword;

	public ReturnElement getMappedParentPassword() {
		return new ReturnElement(oMappedParentPassword, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	
	
	@FindBy(id = "MainContent_btnSave")
	private WebElement oTemplateSaveBtn;

	public ReturnElement getTemplateSaveBtn() {
		return new ReturnElement(oTemplateSaveBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "MainContent_aTemplateList")
	private WebElement oTemplatelist;

	public ReturnElement getTemplatelist() {
		return new ReturnElement(oTemplatelist, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
}
