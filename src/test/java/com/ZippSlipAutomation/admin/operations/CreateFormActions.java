package com.ZippSlipAutomation.admin.operations;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

	EventPageRepository eventPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			EventPageRepository.class);
	
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void selectFormCreateLink() throws Exception {
		
		commonFunctions.waitUntilElementDisplayed(formCreationPageRepository.getFormList().getElement());
		
			
			formCreationPageRepository.getFormList().getElement().click();
			Thread.sleep(4000);
			formCreationPageRepository.getCreateFormLink().getElement().click();

		

	}
	
	
	
	public void verifyFormNameIsMandatory() throws Exception {

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);
		eventPageRepository.getNextButton().getElement().click();
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
		eventPageRepository.getNextButton().getElement().click();
		Thread.sleep(1000);
		
	}
	
	
	
	
	

}
