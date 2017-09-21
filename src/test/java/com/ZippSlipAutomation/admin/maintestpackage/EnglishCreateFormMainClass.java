package com.ZippSlipAutomation.admin.maintestpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ZippSlipAutomation.admin.operations.CreateFormActions;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.URLTypes;

public class EnglishCreateFormMainClass {
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
			CommonVariables.recipient = URLTypes.prodenglishadmin;
			System.out.println("Prod English URL is running");
		}

		else if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Social")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "SocialURL"));
			CommonVariables.recipient = URLTypes.socialenglishadmin;
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
	public void selectFormList() throws Exception {
		 
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.selectFormCreateLink();

	}

	@Test(priority = 2)
	public void verifyFormNameIsMandatory() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.verifyFormNameIsMandatory();
	}

	/*
	@Test(priority = 3)
	public void verifyConfirmationPopupForNoLocation() throws InterruptedException {
		CreateActivityActions createActivityActions = new CreateActivityActions();
		createActivityActions.verifyConfirmationPopupForNoLocation();

	}
	*/


}
