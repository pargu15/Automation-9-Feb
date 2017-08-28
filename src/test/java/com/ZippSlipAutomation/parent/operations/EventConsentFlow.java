package com.ZippSlipAutomation.parent.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.parent.objectRepository.EventConsentFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class EventConsentFlow {

	public void eventConsentFunctionality() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		CommonFunctions commonFunctions = new CommonFunctions();

		EventConsentFlowRepository eventConsentFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
				EventConsentFlowRepository.class);

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);

		commonFunctions.waitUntilElementDisplayed(eventConsentFlowRepository.getViewAllButton().getElement());

		eventConsentFlowRepository.getViewAllButton().getElement().click();
		Thread.sleep(10000);

		try {

			// Click on the event name from the list
			commonFunctions.clickOnEvent();

			excelReadEvent.readFromExcel(2, CommonVariables.rownumber);

			if (excelReadEvent.getEventConsentResponse().contains("Yes")) {
				System.out.println("Response entered from user is Yes");
				commonFunctions.respondYesForFormEvent();
				System.out.println("Responded Yes");
			}

			else if (excelReadEvent.getEventConsentResponse().contains("No")) {
				System.out.println("Response entered from user is No");
				Thread.sleep(5000);
				eventConsentFlowRepository.getRespondNoButton().getElement().click();
				System.out.println("Responded No");
			}
		}

		catch (Exception e) {
			System.err.println("Event could not be consented");
		}

	}

}
