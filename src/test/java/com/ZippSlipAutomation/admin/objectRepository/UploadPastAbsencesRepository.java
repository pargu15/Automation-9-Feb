package com.ZippSlipAutomation.admin.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class UploadPastAbsencesRepository {

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

	@FindBy(id = "txtSearch")
	private WebElement oTemplateSearch;

	public ReturnElement getTemplateSearch() {
		return new ReturnElement(oTemplateSearch, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtSearch")
	private WebElement oSearchBtn;

	public ReturnElement getSearchBtn() {
		return new ReturnElement(oSearchBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "rptTemplateList_btnImport_0")
	private WebElement oImportBtn;

	public ReturnElement getImportBtn() {
		return new ReturnElement(oImportBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//input[contains(@id,'_MainContent_fileUploadControl')]")
	private WebElement ouploadfileBtn;

	public ReturnElement getuploadfileBtn() {
		return new ReturnElement(ouploadfileBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "popupImportButton")
	private WebElement oPopupImportBtn;

	public ReturnElement getPopupImportBtn() {
		return new ReturnElement(oPopupImportBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
