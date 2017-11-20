package com.ZippSlipAutomation.ProductionData.maintestpackage;

import java.io.FileInputStream;

import com.ZippSlipAutomation.ProductionData.objectRepository.EventConsentFlowRepository;
import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;

import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.parent.operations.EventConsentFlow;
import com.ZippSlipAutomation.parent.operations.ConsentEventVerificationFlow;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.URLTypes;

public class EnglishEventConsentMainClass {

	LoginRepository loginRepository;

	//CommonFunctions commonFunctions = new CommonFunctions();

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

		if (commonFunctions.readExcel("NewLoginTest", "FormType").contains("BlankForm")) {
			System.out.println("Blank Data Form is Selected");
			CommonVariables.rownumber = 1;
		}

		else if (commonFunctions.readExcel("NewLoginTest", "FormType").contains("PrefilledForm")) {
			System.out.println("Prefilled Data Form is Selected");
			CommonVariables.rownumber = 2;
		}
	}


	@Test(priority=1)
	public void readXlsData()
	{
		try
		{
			String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);

			// TO get the access to the sheet
			//@param sheet need to pass
			Sheet sh = wb.getSheet(9);

			// To get the number of rows present in sheet
			int totalNoOfRows = sh.getRows();

			// To get the number of columns present in sheet
			//int totalNoOfCols = sh.getColumns();

			//String[] singlerow = new String[totalNoOfCols];

			for (int row = 1; row < totalNoOfRows; row++) {

				String emailID = sh.getCell(0,row).getContents();
				String password = sh.getCell(1,row).getContents();
				String child = sh.getCell(2,row).getContents();

				Login(emailID, password);
				Thread.sleep(2000);
				eventConsent(child);
				Logout(emailID,child);

			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}



	public void Login(String username, String password)
	{
		try
		{
			CommonFunctions commonFunctions = new CommonFunctions();
			LoginRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(), LoginRepository.class);
			commonFunctions.waitUntilElementDisplayed(loginRepository.getUserName().getElement());
			loginRepository.getUserName().getElement().clear();
			loginRepository.getUserName().getElement().sendKeys(username);
			Thread.sleep(1000);
			loginRepository.getPassword().getElement().clear();
			loginRepository.getPassword().getElement().sendKeys(password);
			Thread.sleep(1000);
			loginRepository.getSubmitButton().getElement().click();
			Thread.sleep(2000);
			System.out.println("Login successful for " + username );
			Thread.sleep(2000);

		}
		catch(Exception e)
		{

		}
	}

	private void eventConsent(String childname) throws Exception{
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		CommonFunctions commonFunctions = new CommonFunctions();

		EventConsentFlowRepository eventConsentFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
				EventConsentFlowRepository.class);

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1);

		commonFunctions.waitUntilElementDisplayed(eventConsentFlowRepository.getViewAllButton().getElement());

		eventConsentFlowRepository.getViewAllButton().getElement().click();
		Thread.sleep(2000);
		try{

			// Click on the event name from the list
			commonFunctions.clickOnEvent(childname);
			commonFunctions.respondYesForFormEventforProductionData(childname);
			Thread.sleep(2000);
		}

		catch(Exception e){
			System.err.println("Event could not be consented");
		}

	}

	private void Logout(String user,String userchild) throws Exception {

		try{
			Thread.sleep(2000);
			LoginRepository.clickOnLogoutButton();
			System.out.println("Consent completed for parent " + user + " & his/her child " + userchild  );
		}

		catch(Exception e){
			System.err.println("Couldn't Logout");
		}

	}

	@AfterClass
	public static void driverExit() throws IOException, InterruptedException {
		System.out.println("End of Script");
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();

	}

}