package com.ZippSlipAutomation.districtadmin.maintestpackage;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.CommunicationPage;
import com.ZippSlipAutomation.admin.operations.CreateActivityActions;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.districtadmin.operations.CreateFormPacketActions;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.URLTypes;

public class CreateFormPacketMainClass {

	@BeforeClass
	public static void driverInitiate() throws Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//src//resource//chromedriver.exe");
		CommonFunctions commonFunctions = new CommonFunctions();
		LoginPage loginPage = new LoginPage();

		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.out.println("Start of script");

		if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Prod")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "ProdURL"));
			CommonVariables.recipient = URLTypes.prodenglishdistrictadmin;
			System.out.println("Prod English URL is running");
		}

		else if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Social")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "SocialURL"));
			CommonVariables.recipient = URLTypes.socialenglishdistrictadmin;
			System.out.println("Social English URL is running");
		}

		loginPage.logIntoApp();

		if (commonFunctions.readExcel("NewLoginTest", "FormType").contains("BlankForm")) {
			System.out.println("Blank Data Form is Selected");
			CommonVariables.rownumber = 1;
		}

		else if (commonFunctions.readExcel("NewLoginTest", "FormType").contains("PrefilledForm")) {
			System.out.println("Prefilled Data Form is Selected");
			CommonVariables.rownumber = 2;
		}

	}

	@Test(priority = 1)
	public void selectActivityType() throws Exception {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.selectActivityType();

	}

	@Test(priority = 2)
	public void verifyEventNameIsMandatory() throws Exception {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyEventNameIsMandatory();
	}

	/*
	@Test(priority = 3)
	public void verifyConfirmationPopupForNoLocation() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyConfirmationPopupForNoLocation();

	}

	@Test(priority = 4)
	public void verifyFieldsOnConfirmPopupForNoLocation() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyFieldsOnConfirmPopupForNoLocation();

	}
	*/
	@Test(priority = 5)
	public void verifyPopupOnSeeAllForms() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyPopupOnSeeAllForms();

	}
	
	/*
	@Test(priority = 6)
	public void selectParticipantType() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyParticipantType();

	}
	*/
	
	@Test(priority = 7)
	public void verifyCurrentlySelectedForms() throws Exception {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyCurrentlySelectedForms();

	}

	@Test(priority = 8)
	public void verifySectionOnAdvancedSettingsButton() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifySectionOnAdvancedSettingsButton();

	}

	@Test(priority = 9)
	public void verifyAttachmentsSection() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyAttachmentsSection();

	}

	@Test(priority = 10)
	public void verifyFieldsInPaymentsSection() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyFieldsInPaymentsSection();

	}

	@Test(priority = 11)
	public void verifyFeeTable() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyFeeTable();

	}

	@Test(priority = 12)
	public void verifyTotalFees() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyTotalFees();

	}

	@Test(priority = 13)
	public void verifyCashInstructionsTextbox() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.verifyCashInstructionsTextbox();

	}

	@Test(priority = 14)
	public void directToCommunicationPage() throws InterruptedException {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.directToCommunicationPage();

	}

	@Test(priority = 15)
	public void communicationsPageFunctionality() throws Exception {
		CreateFormPacketActions createFormPacketActions = new CreateFormPacketActions();
		createFormPacketActions.communicationPageFunctionality();
	}

	@AfterClass
	public static void driverExit() throws IOException, InterruptedException {

		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");

	}

}
