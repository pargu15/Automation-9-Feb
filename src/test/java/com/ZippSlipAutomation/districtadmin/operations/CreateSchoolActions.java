	package com.ZippSlipAutomation.districtadmin.operations;

import java.io.FileInputStream;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.districtadmin.objectRepository.CreateSchoolPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

import jxl.Sheet;
import jxl.Workbook;

public class CreateSchoolActions {
	CommonFunctions commonFunctions = new CommonFunctions();
	CreateSchoolPageRepository createSchoolPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			CreateSchoolPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	



	public void selectSchoolListLink() throws Exception {

		commonFunctions.waitUntilElementDisplayed(createSchoolPageRepository.getSchoolList().getElement());
		createSchoolPageRepository.getSchoolList().getElement().click();
		Thread.sleep(2000);

	}

	public void selectCreateSchoolLink() throws Exception {

		createSchoolPageRepository.getCreateSchool().getElement().click();
		Thread.sleep(2000);
	}


	public void addSchoolDetails() throws InterruptedException {
		
		//excelReadEvent.readFromExcel(10, CommonVariables.rownumber);
		createSchoolPageRepository.getSavebtn().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolName());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForInstitutionkey());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolID());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForGrade());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolURL());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolAdminName());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForAdminEmail());
		
		createSchoolPageRepository.getSavebtn().getElement().click();
		commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForAdminPassword());
		
		
		createSchoolPageRepository.getSavebtn().getElement().click();
	
	}
	


}
