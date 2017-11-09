package com.ZippSlipAutomation.parent.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.parent.objectRepository.SocialEventFormDataVerifyRepository;
import com.ZippSlipAutomation.parent.objectRepository.EventConsentFlowRepository;
import com.ZippSlipAutomation.parent.objectRepository.ProdEventFormDataVerifyRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.URLTypes;

public class ConsentEventVerificationFlow {

	public void consentEventVerifyFunctionality() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		CommonFunctions commonFunctions = new CommonFunctions();

		EventConsentFlowRepository eventConsentFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
				EventConsentFlowRepository.class);

		SocialEventFormDataVerifyRepository socialEventFormDataVerifyRepository = PageFactory
				.initElements(DriverInitiation.getDriver(), SocialEventFormDataVerifyRepository.class);

		ProdEventFormDataVerifyRepository prodEventFormDataVerifyRepository = PageFactory
				.initElements(DriverInitiation.getDriver(), ProdEventFormDataVerifyRepository.class);

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1);

		eventConsentFlowRepository.getViewAllButton().getElement().click();
		Thread.sleep(10000);

		commonFunctions.clickOnEvent();
		try {
			if (eventConsentFlowRepository.getEditResponseButton().getElement().isDisplayed()) {
				System.out.println("Event has been consented Yes");

				eventConsentFlowRepository.getViewForms().getElement().click();

				commonFunctions.switchDriverToNewWindow();

				Thread.sleep(15000);

				if (CommonVariables.recipient == URLTypes.socialenglishparent) {

					excelReadEvent.readFromExcel(2, CommonVariables.rownumber, ExcelTypes.Excel1);

					if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

						if (socialEventFormDataVerifyRepository.getTextQuestionCheck().getElement().getText().contains(excelReadEvent.getTextQuestion())) {
							System.out.println("Text question ans has been submitted");
						} else {
							System.err.println("Text question ans is wrong");
						}

						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getSingleSelectAnsCheck());
						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getMultiSelectAnsCheck());
						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getDropDownAnsCheck());
						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getPhoneAnsCheck());
						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getDateAnsCheck());
						commonFunctions.verifyElementIsPresent(socialEventFormDataVerifyRepository.getFullNameCheck());

						if (socialEventFormDataVerifyRepository.getEMailAnsCheck().getElement().getText()
								.contains(excelReadEvent.getEmailQuestion())) {
							System.out.println("Email ans has been submitted");

						} else {
							System.err.println("Email ans is wrong");
						}
					} else if (excelReadEvent.getEventName()
							.contains("Event For Automation With A Form Which Have All Data Prefilled")) {
						System.out.println("Data was already prefilled");
					}

				} else if (CommonVariables.recipient == URLTypes.prodenglishparent) {

					excelReadEvent.readFromExcel(2, CommonVariables.rownumber, ExcelTypes.Excel1);

					if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

						if (prodEventFormDataVerifyRepository.getTextQuestionCheck().getElement().getText()
								.contains(excelReadEvent.getTextQuestion())) {
							System.out.println("Text question ans has been submitted");
						} else {
							System.err.println("Text question ans is wrong");
						}

						commonFunctions.verifyElementIsPresent(prodEventFormDataVerifyRepository.getSingleSelectAnsCheck());
						commonFunctions.verifyElementIsPresent(prodEventFormDataVerifyRepository.getMultiSelectAnsCheck());
						commonFunctions.verifyElementIsPresent(prodEventFormDataVerifyRepository.getPhoneAnsCheck());
						commonFunctions.verifyElementIsPresent(prodEventFormDataVerifyRepository.getDateAnsCheck());

						if (prodEventFormDataVerifyRepository.getDropDownAnsCheck().getElement().getText()
								.contains("Yes")) {
							System.out.println("Dropdown ans has been submitted");
						} else {
							System.err.println("Dropdown ans is wrong");
						}

						if (prodEventFormDataVerifyRepository.getEMailAnsCheck().getElement().getText()
								.contains(excelReadEvent.getEmailQuestion())) {
							System.out.println("Email ans has been submitted");

						} else {
							System.err.println("Email ans is wrong");
						}

						if (prodEventFormDataVerifyRepository.getFullNameCheck().getElement().getText()
								.contains(excelReadEvent.getFirstNameQuestion())) {
							System.out.println("Name ans has been submitted");

						} else {
							System.err.println("Name ans is wrong");
						}

					}

					else if (excelReadEvent.getEventName().contains("Event For Automation With A Form Which Have All Data Prefilled")) {
						System.out.println("Data was already prefilled");
					}

				}
			}
		} catch (Exception e) {
			System.err.println("Event has not been consented correctly");
		}
	}

}
