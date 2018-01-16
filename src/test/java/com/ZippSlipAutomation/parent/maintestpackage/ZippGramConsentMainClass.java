package com.ZippSlipAutomation.parent.maintestpackage;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.parent.operations.ZippGramConsentFlow;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.URLTypes;

public class ZippGramConsentMainClass {
	@BeforeClass
	public static void driverInitiate() throws Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//src//resource//chromedriver.exe");
		CommonFunctions commonFunctions = new CommonFunctions();
		LoginPage loginPage = new LoginPage();

		Thread.sleep(2000);
		System.out.println("Start of script");

		if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Prod")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "ProdURL"));
			CommonVariables.recipient = URLTypes.prodenglishparent;
			System.out.println("Prod English URL is running");
		}

		else if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Social")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "SocialURL"));
			CommonVariables.recipient = URLTypes.socialenglishparent;
			System.out.println("Social English URL is running");
		}

		loginPage.logIntoApp();

	}

		
	@Test(priority = 1)
	public void verifyElementsArePresentOnZippGram() throws Exception {
		ZippGramConsentFlow zippGramConsentFlow = new ZippGramConsentFlow();
		zippGramConsentFlow.verifyElementsArePresentOnZippGram();
	}
	
	@Test(priority = 2)
	public void zippgramConsent() throws Exception {
		ZippGramConsentFlow zippGramConsentFlow = new ZippGramConsentFlow();
		zippGramConsentFlow.zippgramConsentFunctionality();
	}
	
	@AfterClass
	public static void driverExit() throws IOException {
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();
	}

}
