package com.ZippSlipAutomation.districtadmin.maintestpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.districtadmin.operations.ParentImportActions;
import com.ZippSlipAutomation.districtadmin.operations.ParentImportTemplateActions;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.URLTypes;

public class ParentImportMainClass {

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
	}


	@Test(priority = 1)
	public void createParentImportTemplate() throws Exception {

		ParentImportTemplateActions parentImportTemplateActions = new ParentImportTemplateActions();
		parentImportTemplateActions.createParentImportTemplate();

	}


	@Test(priority = 2)
	public void importParent() throws Exception {
		Thread.sleep(2000);
		ParentImportActions parentImportActions = new ParentImportActions();
		parentImportActions.importParent();
		parentImportActions.checkLogs();
	}

	@Test(priority = 3)
	public void deleteTemplate() throws Exception {
		Thread.sleep(2000);
		ParentImportActions parentImportActions = new ParentImportActions();
		parentImportActions.deleteTemplate();
		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
	}


	@Test(priority = 4)
	public static void loginWithImportedParent() throws Exception {
		ParentImportActions parentImportActions = new ParentImportActions();
		parentImportActions.loginWithImportedParent();
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	public static void verifyImportedParentInfo() throws Exception {
		ParentImportActions parentImportActions = new ParentImportActions();
		parentImportActions.verifyImportedParentInfo();
		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
	}
}
