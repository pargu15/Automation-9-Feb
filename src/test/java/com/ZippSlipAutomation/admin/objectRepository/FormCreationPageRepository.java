package com.ZippSlipAutomation.admin.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class FormCreationPageRepository {
	
	@FindBy(xpath = ".//span[contains(.,'Administration')]")
	private WebElement oFormList;

	public ReturnElement getFormList() {
		return new ReturnElement(oFormList,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	


	@FindBy(xpath = ".//span[contains(.,'Create Form')]") 
	private WebElement oCreateForm;

	public ReturnElement getCreateFormLink() {
		return new ReturnElement(oCreateForm,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
	@FindBy(id = "txtName")
	private WebElement oFormName;

	public ReturnElement getNewFormName() {
		return new ReturnElement(oFormName,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	
@FindBy(id = "MainContent_rfcFormName")
	private WebElement errorMessageForFormname;

	public ReturnElement getErrorMessageForFormname() {
		return new ReturnElement(errorMessageForFormname, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@FindBy(id = "txtDescription")
	private WebElement oFormDescription;

	public ReturnElement getFormDescription() {
		return new ReturnElement(oFormDescription,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
}
