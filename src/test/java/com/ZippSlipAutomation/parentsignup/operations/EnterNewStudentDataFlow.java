package com.ZippSlipAutomation.parentsignup.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.ExcelWrite;
import com.ZippSlipAutomation.utilities.URLTypes;

public class EnterNewStudentDataFlow {

	ParentSignUpFlowRepository parentSignUpFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentSignUpFlowRepository.class);

	CommonFunctions commonFunctions = new CommonFunctions();

	public void enterNewStudentDataFunctionality() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		ExcelWrite excelWrite = new ExcelWrite();

		commonFunctions.waitUntilElementDisplayed(parentSignUpFlowRepository.getEnterNewStudentDataHeader().getElement());
		excelReadEvent.readFromExcel(5, CommonVariables.rownumber, ExcelTypes.Excel1);
		parentSignUpFlowRepository.getStudentFirstName().getElement().sendKeys(excelReadEvent.getNewStudentFirstName());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getStudentLastName().getElement().sendKeys(excelReadEvent.getNewStudentLastName());
		Thread.sleep(1000);

		parentSignUpFlowRepository.getStudentDOB().getElement().sendKeys(excelReadEvent.getNewStudentDOB());
		Thread.sleep(1000);

		commonFunctions.selectFromDropDown(parentSignUpFlowRepository.getSchoolNameDropDown().getElement(), 1);
		Thread.sleep(1000);

		commonFunctions.selectFromDropDown(parentSignUpFlowRepository.getGradeDropDown().getElement(), 1);
		Thread.sleep(1000);

		parentSignUpFlowRepository.getAddChildButton().getElement().click();
		Thread.sleep(5000);
		System.out.println("New Student has been added");

		parentSignUpFlowRepository.getIamDoneButton().getElement().click();

		System.out.println("New Parent has been made");

		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelReadEvent.readFromExcel(3, CommonVariables.rownumber, ExcelTypes.Excel1);
	//		excelWrite.writeresultinexcel(0, 0, 3, excelReadEvent.getParentEmail());
			commonFunctions.writeExcel("NewLoginTest", "SocialParentUserName", excelReadEvent.getParentEmail());
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelReadEvent.readFromExcel(6, CommonVariables.rownumber, ExcelTypes.Excel1);
			commonFunctions.writeExcel("NewLoginTest", "ProdParentUserName", excelReadEvent.getParentEmail());
		//	excelWrite.writeresultinexcel(0, 0, 7, excelReadEvent.getParentEmail());
		}

		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelWrite.writeresultinexcel(3, 8, CommonVariables.rownumber, "Data Used");
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelWrite.writeresultinexcel(6, 8, CommonVariables.rownumber, "Data Used");
		}

	}

}
