package com.ZippSlipAutomation.subscription.maintestpackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.subscription.operations.BuySubscriptionActions;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.URLTypes;

import jxl.Sheet;
import jxl.Workbook;

public class BuySubscriptionMainClass {
	/*
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
			DriverInitiation.getDriver().get("http://social.zippslip.com/ZippSlips/PermissionManager/FL/District/zippslip");
			CommonVariables.recipient = URLTypes.socialenglishparent;
			System.out.println("Social English URL is running");
		}

		loginPage.logIntoApp();
	}
	*/
	
		@BeforeClass
		public static void driverInitiate() throws Exception {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//src//resource//chromedriver.exe");
			CommonFunctions commonFunctions = new CommonFunctions();

			// TODO Auto-generated method stub
			Thread.sleep(2000);
			System.out.println("Start of script");

			if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Prod")) {
				DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "ProdSubscriptionURL"));
				CommonVariables.recipient = URLTypes.prodenglishSubscription;
				System.out.println("Prod English URL is running");
			}

			else if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Social")) {
				DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "SocialSubscriptionURL"));
				CommonVariables.recipient = URLTypes.socialenglishSubscription;
				System.out.println("Social English URL is running");
			}

			if (CommonVariables.recipient == URLTypes.prodenglishSubscription) {

				// Setting the row number for which the parent will be signed up
				String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
				FileInputStream fs = new FileInputStream(FilePath);
				Workbook wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(6);
				int totalNoOfRows = sh.getRows();

				ExcelReadEvent excelReadEvent = new ExcelReadEvent();
				for (int x = 0; x < totalNoOfRows; x++) {
					excelReadEvent.readFromExcel(6, x, ExcelTypes.Excel1);
					if (excelReadEvent.getDataStatus().contains("DataNotUsed")) {
						CommonVariables.rownumber = x;
						break;
					}
				}
			}

			else if (CommonVariables.recipient == URLTypes.socialenglishSubscription) {

				// Setting the row number for which the parent will be signed up
				String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
				FileInputStream fs = new FileInputStream(FilePath);
				Workbook wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(3);
				int totalNoOfRows = sh.getRows();

				ExcelReadEvent excelReadEvent = new ExcelReadEvent();
				for (int x = 0; x < totalNoOfRows; x++) {
					excelReadEvent.readFromExcel(3, x, ExcelTypes.Excel1);
					if (excelReadEvent.getDataStatus().contains("DataNotUsed")) {
						CommonVariables.rownumber = x;
						break;
					}
				}
			}
		}

		@Test(priority = 1)
		public void registerTeacherForFlyerFunctionality() throws Exception {
			BuySubscriptionActions buySubscriptionActions = new BuySubscriptionActions();
			buySubscriptionActions.buyFlyerFunctionality();
			buySubscriptionActions.registerNewTeacherFunctionality();
			buySubscriptionActions.enterOTPFunctionality();
			buySubscriptionActions.autoLoginFunctionality();
			
		}
		
		
		
		@Test(priority = 2)
		public void createClassroomFunctionality() throws Exception {
			BuySubscriptionActions buySubscriptionActions = new BuySubscriptionActions();
			buySubscriptionActions.AddClassroom();
		
		}
	
		
		@Test(priority = 3)
		public void inviteParentFunctionality() throws Exception {
			BuySubscriptionActions buySubscriptionActions = new BuySubscriptionActions();
			buySubscriptionActions.InviteParent();
						
		}
		
		
		@Test(priority = 4)
		public void sendZippGramFunctionality() throws Exception {
			BuySubscriptionActions buySubscriptionActions = new BuySubscriptionActions();
			buySubscriptionActions.SendZippGramWindow();
			buySubscriptionActions.verifyZippGramNameIsMandatory();
			buySubscriptionActions.addImageControl();
			buySubscriptionActions.addVideoControl();
			buySubscriptionActions.addPollControl();
			buySubscriptionActions.SendZippGram();		
		}
		
		
		@Test(priority = 5)
		public void sendZippMessageFunctionality() throws Exception {
			BuySubscriptionActions buySubscriptionActions = new BuySubscriptionActions();
			buySubscriptionActions.SendZippMessage();
			
		}

		@AfterClass
		public static void driverExit() throws IOException {
			LoginRepository.clickOnLogoutButton();
			System.out.println("End of Script");
		}

	}

