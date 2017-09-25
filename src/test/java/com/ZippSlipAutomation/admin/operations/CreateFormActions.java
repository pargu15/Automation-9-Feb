package com.ZippSlipAutomation.admin.operations;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.admin.objectRepository.FormCreationPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class CreateFormActions {
	CommonFunctions commonFunctions = new CommonFunctions();
	FormCreationPageRepository formCreationPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			FormCreationPageRepository.class);
	
	Actions action = new Actions(DriverInitiation.getDriver());
	
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void selectCreateFormLink() throws Exception {
		
		commonFunctions.waitUntilElementDisplayed(formCreationPageRepository.getFormList().getElement());
		
			
			formCreationPageRepository.getFormList().getElement().click();
			Thread.sleep(4000);
			formCreationPageRepository.getCreateFormLink().getElement().click();

		

	}
	
	
	
	public void verifyFormNameIsMandatory() throws Exception {

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);
		formCreationPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(formCreationPageRepository.getErrorMessageForFormname());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		/*
		formCreationPageRepository.getNewFormName().getElement().sendKeys(excelReadEvent.getNewFormName() + " " + dtf.format(localDate));
		Thread.sleep(1000);
		formCreationPageRepository.getFormDescription().getElement().sendKeys(excelReadEvent.getFormDescription());
		Thread.sleep(1000);
		*/
		formCreationPageRepository.getNewFormName().getElement().sendKeys(excelReadEvent.getFormName() + " " + dtf.format(localDate));
		Thread.sleep(1000);
		formCreationPageRepository.getFormDescription().getElement().sendKeys(excelReadEvent.getFormName());
		Thread.sleep(1000);
		formCreationPageRepository.getNextButton().getElement().click();
		Thread.sleep(3000);
			
	}
	
	public void addParagraphController() throws Exception {

		action.doubleClick(formCreationPageRepository.getParagraphControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getParagraphQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Test");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addTextBoxControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getTextBoxControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getTextBoxQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("What is the reason for the change request.");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);

	}

	public void addSingleSelectControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getSingleSelectControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getSingleSelectControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("What is the best way to notify you if your form is approved?");
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("Email");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("SMS");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("PushNotification");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addMultipleSelectControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getMultipleSelectControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getMultipleSelectControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("What best describes your request?");
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("NewStudent");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("ChangeOfAddress");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("Other");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addDropDownControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getDropDownControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getDropDownControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Do you want to receive follow ups on the form");
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("Yes");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getOptionTextArea().getElement().sendKeys("No");
		formCreationPageRepository.getAddOptionButton().getElement().click();
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addPhoneControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getPhoneControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getPhoneControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Parent Contact Number");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}	

	public void addDatePickerControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getDatePickerControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getDatePickerControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Parent Date of Birth");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
		
	}

	public void addEmailControl() throws Exception {
		action.doubleClick(formCreationPageRepository.getEmailControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getDatePickerControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Parent Date of Birth");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addNameControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getNameControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getNameControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Parent Name");
		formCreationPageRepository.getTitleCheckBox().getElement().click();
		formCreationPageRepository.getMiddlenameCheckBox().getElement().click();
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
	}

	public void addAddressPickerControl() throws Exception {

		action.doubleClick(formCreationPageRepository.getAddressPickerControl().getElement()).build().perform();
		Thread.sleep(1000);
		action.doubleClick(formCreationPageRepository.getAddressPickerControlQuesInput().getElement()).build().perform();
		Thread.sleep(1000);
		formCreationPageRepository.getQuestionText().getElement().sendKeys("Parent Address");
		formCreationPageRepository.getPopupSaveButton().getElement().click();
		Thread.sleep(1000);
		
		
	}
	
	

}
