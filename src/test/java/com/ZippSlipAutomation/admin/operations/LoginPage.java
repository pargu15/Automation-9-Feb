package com.ZippSlipAutomation.admin.operations;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;

public class LoginPage {

	public void logIntoApp() throws Exception {

		try {

			System.out.println("On the login page");

			switch (CommonVariables.recipient) {
			case socialenglishadmin:
				loginForSocialEnglishAdmin();
				break;
			case socialfrenchadmin:
				loginForSocialFrenchAdmin();
				break;
			case prodenglishadmin:
				loginForProdEnglishAdmin();
				break;
			case prodfrenchadmin:
				loginForProdFrenchAdmin();
				break;
			case socialenglishparent:
				loginForSocialEnglishParent();
				break;
			case prodenglishparent:
				loginForProdEnglishParent();
				break;
			case socialenglishdistrictadmin:
				loginForSocialEnglishDistrictAdmin();
				break;
			case prodenglishdistrictadmin:
				loginForProdEnglishDistrictAdmin();
				break;
			default:
				System.err.println("Login URL is invalid");
				break;
			}

		} catch (Exception e) {
			System.err.println("Could not login");
		}
	}

	private void loginForSocialEnglishAdmin() throws Exception {

		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialAdminUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialAdminPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

		commonFunctions.waitUntilElementDisplayed(loginRepository.getSocialEnglishInstitutionName().getElement());

		loginRepository.getSocialEnglishInstitutionName().getElement().click();

	}

	private void loginForSocialFrenchAdmin() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);

		excelReadEvent.readFromExcel(0, 2, ExcelTypes.Excel1);

		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(excelReadEvent.getLoginid());
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(excelReadEvent.getPassword());
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

		commonFunctions.waitUntilElementDisplayed(loginRepository.getSocialFrenchInstitutionName().getElement());

		loginRepository.getSocialFrenchInstitutionName().getElement().click();
	}

	private void loginForProdEnglishAdmin() throws Exception {

		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdAdminUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdAdminPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

		commonFunctions.waitUntilElementDisplayed(loginRepository.getProdEnglishInstitutionName().getElement());

		loginRepository.getProdEnglishInstitutionName().getElement().click();

	}

	private void loginForProdFrenchAdmin() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);

		excelReadEvent.readFromExcel(0, 6, ExcelTypes.Excel1);

		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(excelReadEvent.getLoginid());
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(excelReadEvent.getPassword());
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

		commonFunctions.waitUntilElementDisplayed(loginRepository.getProdFrenchInstitutionName().getElement());

		loginRepository.getProdFrenchInstitutionName().getElement().click();

	}

	private void loginForSocialEnglishParent() throws Exception {

		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);

		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialParentUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialParentPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

	}

	private void loginForProdEnglishParent() throws Exception {
		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);

		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdParentUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdParentPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

	}

	private void loginForSocialEnglishDistrictAdmin() throws Exception {

		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialDistrictAdminUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "SocialDistrictAdminPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

	}
	
	private void loginForProdEnglishDistrictAdmin() throws Exception {

		CommonFunctions commonFunctions = new CommonFunctions();
		LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
		commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
		loginRepository.getUserName().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdDistrictAdminUserName"));
		Thread.sleep(1000);
		loginRepository.getPassword().getElement().sendKeys(commonFunctions.readExcel("NewLoginTest", "ProdDistrictAdminPassword"));
		Thread.sleep(1000);
		loginRepository.getSubmitButton().getElement().click();

	}

}
