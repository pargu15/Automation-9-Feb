package com.ZippSlipAutomation.districtadmin.operations;

import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.districtadmin.objectRepository.DistrictAdminCommunicationPageRepository;
import com.ZippSlipAutomation.districtadmin.objectRepository.FormPacketPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;

import junit.framework.Assert;

public class CreateFormPacketActions {

	CommonFunctions commonFunctions = new CommonFunctions();
	FormPacketPageRepository formPacketPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			FormPacketPageRepository.class);
	DistrictAdminCommunicationPageRepository districtAdminCommunicationPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			DistrictAdminCommunicationPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void selectActivityType() throws Exception {

		commonFunctions.waitUntilElementDisplayed(formPacketPageRepository.getActivityDropDown().getElement());
		formPacketPageRepository.getActivityDropDown().getElement().click();
		Thread.sleep(2000);
		formPacketPageRepository.getCreateFormPacketButton().getElement().click();
		Thread.sleep(4000);

	}

	public void verifyEventNameIsMandatory() throws Exception {

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1);
		formPacketPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getErrorMessageForEventname());
		//formPacketPageRepository.getEventName().getElement().sendKeys(excelReadEvent.getEventName());
		formPacketPageRepository.getEventName().getElement().sendKeys("Form Packet For Automation With Blank Form");
		Thread.sleep(1000);
	}

	public void verifyParticipantTypeIsMandatory() throws InterruptedException {

		formPacketPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getErrorMessageForParticipantType());
		formPacketPageRepository.getParentStudentButton().getElement().click();
		Thread.sleep(1000);
	}

	public void verifyConfirmationPopupForNoLocation() throws InterruptedException {

		formPacketPageRepository.getNextButton().getElement().click();
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getConfirmationForNoLocation());
		Thread.sleep(1000);

	}

	public void verifyFieldsOnConfirmPopupForNoLocation() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getMessageInConfirmForNoLocation());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getCancelButtonInPopup());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getOKButtonInPopup());
		formPacketPageRepository.getCancelButtonInPopup().getElement().click();
		Thread.sleep(5000);

	}

	public void verifyPopupOnSeeAllForms() throws InterruptedException {

		formPacketPageRepository.getSeeAllFormsButton().getElement().click();
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getSeeAllFormsPopup());
		formPacketPageRepository.getCancelButtonInFormsPopup().getElement().click();

		Thread.sleep(6000);

	}

	public void verifyParticipantType() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getParentStudentButton());
		formPacketPageRepository.getParentStudentButton().getElement().click();
		Thread.sleep(2000);

	}


	public void verifyCurrentlySelectedForms() throws Exception {
		formPacketPageRepository.getSeeAllFormsButton().getElement().click();
		Thread.sleep(2000);
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1 );
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate localDate = LocalDate.now();


		//formPacketPageRepository.getSearchformTextbox().getElement().sendKeys(excelReadEvent.getFormName() + " " + dtf.format(localDate));
		formPacketPageRepository.getSearchformTextbox().getElement().sendKeys(excelReadEvent.getFormName());
		formPacketPageRepository.getSearchformButton().getElement().click();
		formPacketPageRepository.getRequiredformButton().getElement().click();
		formPacketPageRepository.getFormOkConfirmationButton().getElement().click();
		if (formPacketPageRepository.getCurrentSelectedFormsSection().getElement().getText()
				.contains(excelReadEvent.getFormName())) {
			System.out.println("Form has been attached");
		} else {
			System.err.println("Form has not been attached");
		}
		Thread.sleep(1000);
	}


	public void verifySectionOnAdvancedSettingsButton() throws InterruptedException {

		formPacketPageRepository.getAdvancedSettings().getElement().click();
		commonFunctions.waitUntilElementDisplayed(formPacketPageRepository.getAdvancedSettings().getElement());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getAttachmentSection());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getPaymentSection());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getSettingSection());
		Thread.sleep(1000);

	}

	public void verifyAttachmentsSection() throws InterruptedException {
		formPacketPageRepository.getVideoTextbox().getElement().sendKeys("https://www.youtube.com/watch?v=Vjk2So3KvSQ");
		formPacketPageRepository.getAddVideoButton().getElement().click();
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getVideosDiv());
		Thread.sleep(1000);

	}

	/* verifying payments section */

	public void verifyFieldsInPaymentsSection() throws InterruptedException {

		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getAddItemTextbox());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getAddItemButton());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getCashMode());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getCheckMode());
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getCreditDebitMode());
		Thread.sleep(1000);

	}

	public void verifyFeeTable() throws InterruptedException {

		formPacketPageRepository.getAddItemTextbox().getElement().sendKeys("item1");
		formPacketPageRepository.getAddItemButton().getElement().click();
		formPacketPageRepository.getAddItemTextbox().getElement().sendKeys("item2");
		formPacketPageRepository.getAddItemButton().getElement().click();
		formPacketPageRepository.getAddItemTextbox().getElement().sendKeys("item3");
		formPacketPageRepository.getAddItemButton().getElement().click();
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getFeeTable());
		Thread.sleep(1000);

	}

	public void verifyTotalFees() throws InterruptedException {

		int actualSumAmount;
		int expectedSumAmount = (100 + 200 + 300);

		formPacketPageRepository.getFees("1").getElement().sendKeys("100");
		formPacketPageRepository.getFees("2").getElement().sendKeys("200");
		formPacketPageRepository.getFees("3").getElement().sendKeys("300");
		formPacketPageRepository.getAddItemButton().getElement().click();

		actualSumAmount = Integer.parseInt(formPacketPageRepository.getTotalSum().getElement().getText().substring(1, 4));
		System.out.println("actual" + actualSumAmount);

		Assert.assertEquals(actualSumAmount, expectedSumAmount);
		Thread.sleep(1000);
		// assertion.assertEquals(Thread.currentThread().getStackTrace()[1],
		// "Verify Sum Of Amount", actualSumAmount, expectedSumAmount);

	}

	public void verifyCashInstructionsTextbox() throws InterruptedException {
		formPacketPageRepository.getCashMode().getElement().click();
		commonFunctions.verifyElementIsPresent(formPacketPageRepository.getCashInstructions());
		formPacketPageRepository.getCashInstructions().getElement().sendKeys("these are cash instructions");
		Thread.sleep(1000);

	}

	public void directToCommunicationPage() throws InterruptedException {

		formPacketPageRepository.getNextButton().getElement().click();
		Thread.sleep(4000);

		commonFunctions.checkForModalWindow();
		Thread.sleep(4000);

	}

	public void communicationPageFunctionality() throws Exception {
		try {
			districtAdminCommunicationPageRepository.getDistrictStudentsGroup().getElement().click();
			Thread.sleep(4000);

			districtAdminCommunicationPageRepository.getNextButton().getElement().click();
			Thread.sleep(3000);

			System.out.println("Communication Page has been filled");

			districtAdminCommunicationPageRepository.getSaveNPublish().getElement().click();
			Thread.sleep(4000);

			districtAdminCommunicationPageRepository.getDoNotNotifyAll().getElement().click();
			Thread.sleep(2000);

			districtAdminCommunicationPageRepository.getConfirmNPublishFinal().getElement().click();
			Thread.sleep(3000);

			System.out.println("Event is made");

		} catch (Exception e) {

			System.err.println("Communication page details could not entered");
		};

	}

}
