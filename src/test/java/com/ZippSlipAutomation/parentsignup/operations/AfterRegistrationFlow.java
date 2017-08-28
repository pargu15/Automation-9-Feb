package com.ZippSlipAutomation.parentsignup.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.URLTypes;

public class AfterRegistrationFlow {
	ParentSignUpFlowRepository parentSignUpFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentSignUpFlowRepository.class);
	CommonFunctions commonFunctions = new CommonFunctions();
	LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void afterRegistrationFunctionality() throws Exception {
		
		// commonFunctions.waitUntilElementDisplayed(socialParentSignUpRepository.getLoginAfterRegistration().getElement());
		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelReadEvent.readFromExcel(3, CommonVariables.rownumber);
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelReadEvent.readFromExcel(6, CommonVariables.rownumber);
		}
		
		Thread.sleep(5000);
		parentSignUpFlowRepository.getLoginAfterRegistration().getElement().click();

		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdParentUserName"));
			Thread.sleep(1000);
			loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdParentPassword"));
			Thread.sleep(1000);
		}
	
		else if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialParentUserName"));
			Thread.sleep(1000);
			loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialParentPassword"));
			Thread.sleep(1000);
		}
			
		loginRepository.getSubmitButton().getElement().click();

		System.out.println("New parent has been logged in");

		commonFunctions.waitUntilElementDisplayed(parentSignUpFlowRepository.getNewElectronicPin().getElement());
		parentSignUpFlowRepository.getNewElectronicPin().getElement().sendKeys(excelReadEvent.getElectronicPin());
		Thread.sleep(1000);
		parentSignUpFlowRepository.getConfirmElectronicPin().getElement()
				.sendKeys(excelReadEvent.getConfirmElectronicPin());
		Thread.sleep(1000);
		parentSignUpFlowRepository.getAddElectronicPin().getElement().click();
		Thread.sleep(3000);

		System.out.println("Electronic Pin has been added");

		parentSignUpFlowRepository.getElectronicPinAddedButton().getElement().click();
		Thread.sleep(3000);

		parentSignUpFlowRepository.getWelcomeOkButton().getElement().click();
		Thread.sleep(1000);

	}

}
