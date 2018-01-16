package com.ZippSlipAutomation.parentsignup.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.URLTypes;

public class CommonLoginRegisterWithZippSlipFlow {

	ParentSignUpFlowRepository parentSignUpFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentSignUpFlowRepository.class);
	CommonFunctions commonFunctions = new CommonFunctions();

	public void registerNewParentFunctionality() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();

		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelReadEvent.readFromExcel(3, CommonVariables.rownumber, ExcelTypes.Excel1);
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelReadEvent.readFromExcel(6, CommonVariables.rownumber, ExcelTypes.Excel1);
		}

		parentSignUpFlowRepository.getCreateParentAccountButton().getElement().click();
		Thread.sleep(1000);
		
		//commonFunctions.waitUntilElementDisplayed(parentSignUpFlowRepository.getRegisterPageHeader().getElement());
		
		parentSignUpFlowRepository.getSelectParentRole().getElement().click();
		
		parentSignUpFlowRepository.getParentFirstName().getElement().sendKeys(excelReadEvent.getParentFirstName());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getParentLastName().getElement().sendKeys(excelReadEvent.getParentLastName());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getParentEMailText().getElement().sendKeys(excelReadEvent.getParentEmail());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getMobileNo().getElement().sendKeys(excelReadEvent.getParentMobileNumber());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getPasswordText().getElement().sendKeys(excelReadEvent.getParentPassword());
		Thread.sleep(1000);

		//parentSignUpFlowRepository.getConfirmPasswordText().getElement().sendKeys(excelReadEvent.getParentConfirmPassword());
		//Thread.sleep(1000);

		parentSignUpFlowRepository.getContinueButton().getElement().click();
		Thread.sleep(1000);
		
		parentSignUpFlowRepository.getSearchInstitution().getElement().sendKeys("River");
		Thread.sleep(1000);
		
		parentSignUpFlowRepository.getSelectInstitution().getElement().click();
		Thread.sleep(1000);
		
		parentSignUpFlowRepository.getValidateInstitution().getElement().click();
		Thread.sleep(1000);
	}

}
