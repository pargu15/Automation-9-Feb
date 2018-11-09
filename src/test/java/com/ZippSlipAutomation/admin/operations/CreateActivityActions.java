package com.ZippSlipAutomation.admin.operations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;

import junit.framework.Assert;

public class CreateActivityActions {

	CommonFunctions commonFunctions = new CommonFunctions();
	EventPageRepository eventPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			EventPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void selectActivityType() throws Exception {

		commonFunctions.waitUntilElementDisplayed(eventPageRepository.getActivity().getElement());
		eventPageRepository.getActivity().getElement().click();
		Thread.sleep(2000);
		eventPageRepository.getCreateEventButton().getElement().click();
		Thread.sleep(4000);

	}

	public void verifyEventNameIsMandatory() throws Exception {

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1);
		eventPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(eventPageRepository.getErrorMessageForEventname());
		eventPageRepository.getEventName().getElement().sendKeys(excelReadEvent.getEventName());
		Thread.sleep(1000);
	}

	public void verifyParticipantTypeIsMandatory() throws InterruptedException {

		eventPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(eventPageRepository.getErrorMessageForParticipantType());
		eventPageRepository.getParentButton().getElement().click();
		Thread.sleep(1000);
	}

	public void verifyConfirmationPopupForNoLocation() throws InterruptedException {

		eventPageRepository.getNextButton().getElement().click();
		commonFunctions.verifyElementIsPresent(eventPageRepository.getConfirmationForNoLocation());
		Thread.sleep(1000);

	}

	public void verifyFieldsOnConfirmPopupForNoLocation() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(eventPageRepository.getMessageInConfirmForNoLocation());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getCancelButtonInPopup());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getOKButtonInPopup());
		eventPageRepository.getCancelButtonInPopup().getElement().click();
		Thread.sleep(5000);

	}

	public void verifyPopupOnSeeAllForms() throws InterruptedException {

		eventPageRepository.getSeeAllFormsButton().getElement().click();
		commonFunctions.verifyElementIsPresent(eventPageRepository.getSeeAllFormsPopup());
		eventPageRepository.getCancelButtonInFormsPopup().getElement().click();

		Thread.sleep(6000);

	}

	public void verifyParticipantType() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(eventPageRepository.getParentButton());
		eventPageRepository.getParentButton().getElement().click();
		Thread.sleep(2000);

	}


	public void verifyCurrentlySelectedForms() throws Exception {
		eventPageRepository.getSeeAllFormsButton().getElement().click();
		Thread.sleep(2000);
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1 );
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();

		eventPageRepository.getSearchformTextbox().getElement().sendKeys(excelReadEvent.getFormName() + " " + dtf.format(localDate));
		eventPageRepository.getSearchformButton().getElement().click();
		Thread.sleep(1000);
		eventPageRepository.getRequiredformButton().getElement().click();
		Thread.sleep(1000);
		eventPageRepository.getFormOkConfirmationButton().getElement().click();
		Thread.sleep(1000);
		if (eventPageRepository.getCurrentSelectedFormsSection().getElement().getText()
				.contains(excelReadEvent.getFormName())) {
			System.out.println("Form has been attached");
		} else {
			System.err.println("Form has not been attached");
		}
		Thread.sleep(1000);
	}

	/*
	public void verifyCurrentlySelectedForms() throws Exception {
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);
		eventPageRepository.getCheckboxCorrospondingToForm(excelReadEvent.getFormName()).getElement().click();
		if (eventPageRepository.getCurrentSelectedFormsSection().getElement().getText()
				.contains(excelReadEvent.getFormName())) {
			System.out.println("Form has been attached");
		} else {
			System.err.println("Form has not been attached");
		}

		Thread.sleep(1000);
	}
	 */
	public void verifySectionOnAdvancedSettingsButton() throws InterruptedException {

		eventPageRepository.getAdvancedSettings().getElement().click();
		commonFunctions.waitUntilElementDisplayed(eventPageRepository.getAdvancedSettings().getElement());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getAttachmentSection());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getPaymentSection());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getSettingSection());
		Thread.sleep(1000);

	}

	public void verifyAttachmentsSection() throws InterruptedException {
		eventPageRepository.getVideoTextbox().getElement().sendKeys("https://www.youtube.com/watch?v=Vjk2So3KvSQ");
		eventPageRepository.getAddVideoButton().getElement().click();
		commonFunctions.verifyElementIsPresent(eventPageRepository.getVideosDiv());
		Thread.sleep(1000);

	}

	/* verifying payments section */

	public void verifyFieldsInPaymentsSection() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(eventPageRepository.getAddItemTextbox());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getAddItemButton());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getCashMode());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getCheckMode());
		commonFunctions.verifyElementIsPresent(eventPageRepository.getCreditDebitMode());
		Thread.sleep(1000);

	}

	public void verifyFeeTable() throws InterruptedException {

		eventPageRepository.getAddItemTextbox().getElement().sendKeys("item1");
		eventPageRepository.getAddItemButton().getElement().click();
		eventPageRepository.getAddItemTextbox().getElement().sendKeys("item2");
		eventPageRepository.getAddItemButton().getElement().click();
		eventPageRepository.getAddItemTextbox().getElement().sendKeys("item3");
		eventPageRepository.getAddItemButton().getElement().click();
		commonFunctions.verifyElementIsPresent(eventPageRepository.getFeeTable());
		Thread.sleep(1000);

	}

	public void verifyTotalFees() throws InterruptedException {

		int actualSumAmount;
		int expectedSumAmount = (100 + 200 + 300);

		eventPageRepository.getFees("1").getElement().sendKeys("100");
		eventPageRepository.getFees("2").getElement().sendKeys("200");
		eventPageRepository.getFees("3").getElement().sendKeys("300");
		eventPageRepository.getAddItemButton().getElement().click();

		actualSumAmount = Integer.parseInt(eventPageRepository.getTotalSum().getElement().getText().substring(1, 4));
		System.out.println("actual" + actualSumAmount);

		Assert.assertEquals(actualSumAmount, expectedSumAmount);
		Thread.sleep(1000);
		// assertion.assertEquals(Thread.currentThread().getStackTrace()[1],
		// "Verify Sum Of Amount", actualSumAmount, expectedSumAmount);

	}

	public void verifyCashInstructionsTextbox() throws InterruptedException {
		eventPageRepository.getCashMode().getElement().click();
		commonFunctions.verifyElementIsPresent(eventPageRepository.getCashInstructions());
		eventPageRepository.getCashInstructions().getElement().sendKeys("these are cash instructions");
		Thread.sleep(1000);

	}

	public void directToCommunicationPage() throws InterruptedException {

		eventPageRepository.getNextButton().getElement().click();
		Thread.sleep(4000);

		commonFunctions.checkForModalWindow();
		Thread.sleep(4000);

	}

	public void communicationPageFunctionality() throws InterruptedException {

		eventPageRepository.getNextButton().getElement().click();
		Thread.sleep(4000);

		commonFunctions.checkForModalWindow();
		Thread.sleep(4000);

	}
}
