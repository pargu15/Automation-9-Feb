package com.ZippSlipAutomation.admin.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.CommunicationPageRepository;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class CommunicationPage {

	CommunicationPageRepository communicationPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			CommunicationPageRepository.class);

	public void communicationPageFunctionality() throws Exception {

		try {
			System.out.println("On the Communication Page");
			ExcelReadEvent excelReadEvent = new ExcelReadEvent();

			excelReadEvent.readFromExcel(1, 1);

			communicationPageRepository.getAllRecipientsButton().getElement().click();
			Thread.sleep(3000);

			switch (CommonVariables.recipient) {
			case socialenglishadmin:
				recipientForSocialEnglish();
				break;
			case socialfrenchadmin:
				recipientForSocialFrench();
				break;
			case prodenglishadmin:
				recipientForProdEnglish();
				break;
			case prodfrenchadmin:
				recipientForProdFrench();
				break;
			default:
				System.out.println("Communication page details are invalid");
				break;
			}

			communicationPageRepository.getSaveNCloseButton().getElement().click();
			Thread.sleep(3000);

			communicationPageRepository.getNextButton().getElement().click();
			Thread.sleep(3000);

			System.out.println("Communication Page has been filled");

			communicationPageRepository.getSaveNPublish().getElement().click();
			Thread.sleep(4000);

			communicationPageRepository.getDoNotNotifyAll().getElement().click();
			Thread.sleep(2000);

			communicationPageRepository.getConfirmNPublishFinal().getElement().click();
			Thread.sleep(3000);

			System.out.println("Event is made");
		} catch (Exception e) {

			System.err.println("Communication page details could not entered");
		}
	}

	private void recipientForSocialEnglish() throws InterruptedException {

		communicationPageRepository.getGroupSearchTextBox().getElement().sendKeys("all");
		Thread.sleep(4000);
		communicationPageRepository.getGroupSearchButton().getElement().click();
		Thread.sleep(4000);
		communicationPageRepository.getSocialAllStudentsGroupButton().getElement().click();
		Thread.sleep(2000);
	}

	private void recipientForSocialFrench() throws InterruptedException {

		communicationPageRepository.getGroupSearchTextBox().getElement().sendKeys("not");
		Thread.sleep(4000);
		communicationPageRepository.getGroupSearchButton().getElement().click();
		Thread.sleep(4000);
		communicationPageRepository.getNoticationGroupButton().getElement().click();
		Thread.sleep(2000);
	}

	private void recipientForProdEnglish() throws InterruptedException {

		communicationPageRepository.getGroupSearchTextBox().getElement().sendKeys("all");
		Thread.sleep(4000);
		communicationPageRepository.getGroupSearchButton().getElement().click();
		Thread.sleep(4000);
		communicationPageRepository.getProdAllStudentsGroupButton().getElement().click();
		Thread.sleep(2000);
	}

	private void recipientForProdFrench() throws InterruptedException {

		communicationPageRepository.getStudentsTab().getElement().click();
		Thread.sleep(6000);
		communicationPageRepository.getStudentSearchTextBox().getElement().sendKeys("first");
		Thread.sleep(5000);
		communicationPageRepository.getStudentSearchButton().getElement().click();
		Thread.sleep(4000);
		communicationPageRepository.getFrenchStudentSelect().getElement().click();
		Thread.sleep(2000);
	}

}
