package com.ZippSlipAutomation.districtadmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ParentImportRepository {
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
	
	@FindBy(xpath = ".//span[contains(.,' Refresh Logs')]")
	private WebElement oRefreshLogsBtn;

	public ReturnElement getRefreshLogsBtn() {
		return new ReturnElement(oRefreshLogsBtn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "rptTemplateList_lbDelete_0")
	private WebElement oDeleteTemplate;

	public ReturnElement getDeleteTemplate() {
		return new ReturnElement(oDeleteTemplate, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnOk")
	private WebElement oDeleteTemplateConfirmation;

	public ReturnElement getDeleteTemplateConfirmation() {
		return new ReturnElement(oDeleteTemplateConfirmation, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	
}
