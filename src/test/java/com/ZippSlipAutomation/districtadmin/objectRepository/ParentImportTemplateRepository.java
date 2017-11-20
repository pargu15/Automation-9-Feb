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
	private WebElement oImportedSchoolID;

	public ReturnElement getImportedSchoolID() {
		return new ReturnElement(oImportedSchoolID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='231']")
	private WebElement oAvailableSchooID;

	public ReturnElement getAvailableSchoolID() {
		return new ReturnElement(oAvailableSchooID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[3]")
	private WebElement oImportedStudentID;

	public ReturnElement getImportedStudentID() {
		return new ReturnElement(oImportedStudentID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='1']")
	private WebElement oAvailableStudentID;

	public ReturnElement getAvailableStudentID() {
		return new ReturnElement(oAvailableStudentID, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[4]")
	private WebElement oImportedParentFirstName;

	public ReturnElement getImportedParentFirstName() {
		return new ReturnElement(oImportedParentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='19']")
	private WebElement oAvailableParentFirstName;

	public ReturnElement getAvailableParentFirstName() {
		return new ReturnElement(oAvailableParentFirstName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[5]")
	private WebElement oImportedParentLastName;

	public ReturnElement getImportedParentLastName() {
		return new ReturnElement(oImportedParentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='21']")
	private WebElement oAvailableParentLastName;

	public ReturnElement getAvailableParentLastName() {
		return new ReturnElement(oAvailableParentLastName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[6]")
	private WebElement oImportedParentEmail;

	public ReturnElement getImportedParentEmail() {
		return new ReturnElement(oImportedParentEmail, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='22']")
	private WebElement oAvailableParentEmail;

	public ReturnElement getAvailableParentEmail() {
		return new ReturnElement(oAvailableParentEmail, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[7]")
	private WebElement oImportedParentPassword;

	public ReturnElement getImportedParentPassword() {
		return new ReturnElement(oImportedParentPassword, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	

	@FindBy(xpath = ".//*[@id='52']")
	private WebElement oAvailableParentPassword;

	public ReturnElement getAvailableParentPassword() {
		return new ReturnElement(oAvailableParentPassword, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	



	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[8]")
	private WebElement oImportedParentStreetNo;

	public ReturnElement getImportedParentStreetNo() {
		return new ReturnElement(oImportedParentStreetNo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='234']")
	private WebElement oAvailableParentStreetNo;

	public ReturnElement getAvailableParentStreetNo() {
		return new ReturnElement(oAvailableParentStreetNo, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[9]")
	private WebElement oImportedParentAddress;

	public ReturnElement getImportedParentAddress() {
		return new ReturnElement(oImportedParentAddress, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='24']")
	private WebElement oAvailableParentAddress;

	public ReturnElement getAvailableParentAddress() {
		return new ReturnElement(oAvailableParentAddress, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[10]")
	private WebElement oImportedParentStreetType;

	public ReturnElement getImportedParentStreetType() {
		return new ReturnElement(oImportedParentStreetType, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='235']")
	private WebElement oAvailableParentStreetType;

	public ReturnElement getAvailableParentStreetType() {
		return new ReturnElement(oAvailableParentStreetType, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[11]")
	private WebElement oImportedParentDirection;

	public ReturnElement getImportedParentDirection() {
		return new ReturnElement(oImportedParentDirection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='236']")
	private WebElement oAvailableParentDirection;

	public ReturnElement getAvailableParentDirection() {
		return new ReturnElement(oAvailableParentDirection, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[12]")
	private WebElement oImportedParentApartments;

	public ReturnElement getImportedParentApartments() {
		return new ReturnElement(oImportedParentApartments, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='25']")
	private WebElement oAvailableParentApartments;

	public ReturnElement getAvailableParentApartments() {
		return new ReturnElement(oAvailableParentApartments, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[13]")
	private WebElement oImportedParentCity;

	public ReturnElement getImportedParentCity() {
		return new ReturnElement(oImportedParentCity, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	

	@FindBy(xpath = ".//*[@id='26']")
	private WebElement oAvailableParentCity;

	public ReturnElement getAvailableParentCity() {
		return new ReturnElement(oAvailableParentCity, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	


	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[14]")
	private WebElement oImportedParentState;

	public ReturnElement getImportedParentState() {
		return new ReturnElement(oImportedParentState, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='27']")
	private WebElement oAvailableParentState;

	public ReturnElement getAvailableParentState() {
		return new ReturnElement(oAvailableParentState, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulAvailableFields']/li[15]")
	private WebElement oImportedParentZippcode;

	public ReturnElement getImportedParentZippcode() {
		return new ReturnElement(oImportedParentZippcode, Thread.currentThread().getStackTrace()[1].getMethodName());

	}	

	@FindBy(xpath = ".//*[@id='28']")
	private WebElement oAvailableParentZippcode;

	public ReturnElement getAvailableParentZippcode() {
		return new ReturnElement(oAvailableParentZippcode, Thread.currentThread().getStackTrace()[1].getMethodName());

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
