package com.ZippSlipAutomation.parent.operations;

import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.parent.objectRepository.PastFutureAbsencesResponseRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;

public class PastFutureAbsencesResponseFlow {


	CommonFunctions commonFunctions = new CommonFunctions();
	PastFutureAbsencesResponseRepository pastFutureAbsencesResponseRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			PastFutureAbsencesResponseRepository.class);


	public void pastAbsencesFunctionality() throws Exception {
		pastFutureAbsencesResponseRepository.getAbsencesMainMenu().getElement().click();
		Thread.sleep(2000);
		pastFutureAbsencesResponseRepository.getPastAbsencesResponseBtn().getElement().click();


	}

	public void futureAbsencesFunctionality() throws Exception {

		pastFutureAbsencesResponseRepository.getHomeScreen().getElement().click();
		Thread.sleep(1000);
		pastFutureAbsencesResponseRepository.getNewAbsenceNote().getElement().click();
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getMarkNewAbsences().getElement().click();
		Thread.sleep(1000);
		pastFutureAbsencesResponseRepository.getCalendar().getElement().click();
		Thread.sleep(1000);
		pastFutureAbsencesResponseRepository.getAbsenceMonth().getElement().click();
		Thread.sleep(2000);

		pastFutureAbsencesResponseRepository.getAbsenceDate().getElement().click();
		Thread.sleep(2000);

		pastFutureAbsencesResponseRepository.getAddBtn().getElement().click();
		Thread.sleep(1000);



	}

	public void pastfutureAbsencesResponseFunctionality() throws Exception {
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcelxlsx(0, 1, ExcelTypes.Excel2);

		pastFutureAbsencesResponseRepository.getPhoneQuestion().getElement()
		.sendKeys(excelReadEvent.getPhoneNumber());
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getDateQuestion().getElement()
		.sendKeys(excelReadEvent.getDateQuestion());
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getEmailQuestion().getElement()
		.sendKeys(excelReadEvent.getEmailQuestion());
		Thread.sleep(1000);


		pastFutureAbsencesResponseRepository.getFirstNameQuestion().getElement()
		.sendKeys(excelReadEvent.getFirstNameQuestion());
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getLastNameQuestion().getElement()
		.sendKeys(excelReadEvent.getLastNameQuestion());
		Thread.sleep(1000);


		pastFutureAbsencesResponseRepository.getMailingAddressQuestion().getElement()
		.sendKeys(excelReadEvent.getMailingAddressQuestion());
		Thread.sleep(1000);


		pastFutureAbsencesResponseRepository.getCityTownQuestion().getElement()
		.sendKeys(excelReadEvent.getCityTownQuestion());
		Thread.sleep(1000);

		commonFunctions.selectFromDropDown(pastFutureAbsencesResponseRepository.getAddressStatesQuestion().getElement(), 8);
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getZippCodeQuestion().getElement()
		.sendKeys(excelReadEvent.getZippCodeQuestion());
		Thread.sleep(1000);

		pastFutureAbsencesResponseRepository.getElectronicPin().getElement()
		.sendKeys(excelReadEvent.getElectronicPin());
		Thread.sleep(1000);
		pastFutureAbsencesResponseRepository.getSendResponseBtn().getElement()
		.click();
		Thread.sleep(1000);



	}

}
