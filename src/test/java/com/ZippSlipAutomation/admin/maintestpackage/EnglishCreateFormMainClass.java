package com.ZippSlipAutomation.admin.maintestpackage;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
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
		createFormActions.selectCreateFormLink();

	}

	@Test(priority = 2)
	public void verifyFormNameIsMandatory() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.verifyFormNameIsMandatory();
	}
	
	@Test(priority = 3)
	public void addParagraphController() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addParagraphController();
	}
	
	@Test(priority = 4)
	public void addTextBoxControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addTextBoxControl();
	}
	
	
	@Test(priority = 5)
	public void addSingleSelectControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addSingleSelectControl();
	}
	
	
	@Test(priority = 6)
	public void addMultipleSelectControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addMultipleSelectControl();
	}
	
	@Test(priority = 7)
	public void addDropDownControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addDropDownControl();
	}
	@Test(priority = 8)
	public void addPhoneControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addPhoneControl();
	}
	@Test(priority = 9)
	public void addDatePickerControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addDatePickerControl();
	}
	@Test(priority = 10)
	public void addEmailControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addEmailControl();
	}
	@Test(priority = 11)
	public void addNameControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addNameControl();
	}
	@Test(priority = 12)
	public void addAddressPickerControl() throws Exception {
		CreateFormActions createFormActions = new CreateFormActions();
		createFormActions.addAddressPickerControl();
	}

	@AfterClass
	public static void driverExit() throws IOException, InterruptedException {

		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");

	}
}
