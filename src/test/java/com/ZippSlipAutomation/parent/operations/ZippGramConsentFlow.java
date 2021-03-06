package com.ZippSlipAutomation.parent.operations;

import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.parent.objectRepository.ZippGramConsentFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;


public class ZippGramConsentFlow {

	CommonFunctions commonFunctions = new CommonFunctions();

	ZippGramConsentFlowRepository zippGramConsentFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ZippGramConsentFlowRepository.class);

	public void zippgramConsentFunctionality() throws Exception {


		commonFunctions.waitUntilElementDisplayed(zippGramConsentFlowRepository.getViewZippGram().getElement());

		zippGramConsentFlowRepository.getViewZippGram().getElement().click();
		Thread.sleep(2000);
		zippGramConsentFlowRepository.getSelectPollOptn().getElement().click();
		Thread.sleep(2000);
		zippGramConsentFlowRepository.getSavePollOptn().getElement().click();
		zippGramConsentFlowRepository.getHomeScreen().getElement().click();
		Thread.sleep(1000);
	}


	public void verifyElementsArePresentOnZippGram() throws Exception {
		commonFunctions.verifyElementIsPresent(zippGramConsentFlowRepository.getImageCheck());
		commonFunctions.verifyElementIsPresent(zippGramConsentFlowRepository.getVideoCheck());
		commonFunctions.verifyElementIsPresent(zippGramConsentFlowRepository.getPollCheck());

	}
}
