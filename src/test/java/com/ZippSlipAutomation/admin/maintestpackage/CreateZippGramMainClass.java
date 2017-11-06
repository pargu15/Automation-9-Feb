package com.ZippSlipAutomation.admin.maintestpackage;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.CommunicationPage;
import com.ZippSlipAutomation.admin.operations.CreateZippGramActions;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.URLTypes;

public class CreateZippGramMainClass {

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

	}

	@Test(priority = 1)
	public void selectZippGram() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.selectZippGram();

	}

	@Test(priority = 2)
	public void verifyEventNameIsMandatory() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.verifyZippGramNameIsMandatory();
	}
	
	@Test(priority = 3)
	public void addImageControl() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.addImageControl();

	}

	@Test(priority = 4)
	public void addVideoControl() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.addVideoControl();
	}
	
	@Test(priority = 5)
	public void addPollControl() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.addPollControl();
	}
	
	@Test(priority = 6)
	public void directToCommunicationPage() throws Exception {
		CreateZippGramActions createZippGramActions = new CreateZippGramActions();
		createZippGramActions.directToCommunicationPage();
	}
	

	@Test(priority = 7)
	public void communicationsPageFunctionality() throws Exception {
		CommunicationPage communicationPage = new CommunicationPage();
		communicationPage.communicationPageFunctionality();
	}

	
	@AfterClass
	public static void driverExit() throws IOException, InterruptedException {

		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");

	}

}

