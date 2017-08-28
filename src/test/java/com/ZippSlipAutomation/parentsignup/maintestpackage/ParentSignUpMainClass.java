package com.ZippSlipAutomation.parentsignup.maintestpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.parentsignup.operations.AfterRegistrationFlow;
import com.ZippSlipAutomation.parentsignup.operations.EnrolledStudentInfoFlow;
import com.ZippSlipAutomation.parentsignup.operations.EnterNewStudentDataFlow;
import com.ZippSlipAutomation.parentsignup.operations.RegisterWithZippSlipFlow;
import com.ZippSlipAutomation.parentsignup.operations.RegistrationDataVerification;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.URLTypes;

import jxl.Sheet;
import jxl.Workbook;

public class ParentSignUpMainClass {

	@BeforeClass
	public static void driverInitiate() throws Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//src//resource//chromedriver.exe");
		CommonFunctions commonFunctions = new CommonFunctions();

		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.out.println("Start of script");

		if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Prod")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "ProdURL"));
			CommonVariables.recipient = URLTypes.prodenglishparentsignup;
			System.out.println("Prod English URL is running");
		}

		else if (commonFunctions.readExcel("NewLoginTest", "UrlType").contains("Social")) {
			DriverInitiation.getDriver().get(commonFunctions.readExcel("NewLoginTest", "SocialURL"));
			CommonVariables.recipient = URLTypes.socialenglishparentsignup;
			System.out.println("Social English URL is running");
		}

		if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {

			// Setting the row number for which the parent will be signed up
			String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(6);
			int totalNoOfRows = sh.getRows();

			ExcelReadEvent excelReadEvent = new ExcelReadEvent();
			for (int x = 0; x < totalNoOfRows; x++) {
				excelReadEvent.readFromExcel(6, x);
				if (excelReadEvent.getDataStatus().contains("DataNotUsed")) {
					CommonVariables.rownumber = x;
					break;
				}
			}
		}

		else if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {

			// Setting the row number for which the parent will be signed up
			String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(3);
			int totalNoOfRows = sh.getRows();

			ExcelReadEvent excelReadEvent = new ExcelReadEvent();
			for (int x = 0; x < totalNoOfRows; x++) {
				excelReadEvent.readFromExcel(3, x);
				if (excelReadEvent.getDataStatus().contains("DataNotUsed")) {
					CommonVariables.rownumber = x;
					break;
				}
			}
		}
	}

	@Test(priority = 1)
	public void registerWithZippSlipFunctionality() throws Exception {
		RegisterWithZippSlipFlow registerWithZippSlipFlow = new RegisterWithZippSlipFlow();
		registerWithZippSlipFlow.registerNewParentFunctionality();
	}

	@Test(priority = 2)
	public void enrolledStudentDataFunctionality() throws Exception {
		EnrolledStudentInfoFlow enrolledStudentInfoFlow = new EnrolledStudentInfoFlow();
		if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			enrolledStudentInfoFlow.enterEnrolledStudentData(7);
		} else if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			enrolledStudentInfoFlow.enterEnrolledStudentData(4);
		}
	}

	@Test(priority = 3)
	public void newStudentDataFunctionality() throws Exception {
		EnterNewStudentDataFlow enterNewStudentDataFlow = new EnterNewStudentDataFlow();
		enterNewStudentDataFlow.enterNewStudentDataFunctionality();
	}

	@Test(priority = 4)
	public void aterRegistrationFlowFunctionality() throws Exception {
		AfterRegistrationFlow afterRegistrationFlow = new AfterRegistrationFlow();
		afterRegistrationFlow.afterRegistrationFunctionality();
	}

	@Test(priority = 5)
	public void directToProfilePage() throws Exception {
		RegistrationDataVerification registrationDataVerification = new RegistrationDataVerification();
		registrationDataVerification.directToParentProfilePage();
	}

	@Test(priority = 6)
	public void parentDataVerificationFlow() throws Exception {
		RegistrationDataVerification registrationDataVerification = new RegistrationDataVerification();
		registrationDataVerification.parentDataVerificationFunctionality();
	}

	@Test(priority = 7)
	public void enrolledStudentDataVerificationFlow() throws Exception {
		RegistrationDataVerification registrationDataVerification = new RegistrationDataVerification();
		registrationDataVerification.enrolledStudentDataVerificationFunctionality();
	}

	@Test(priority = 8)
	public void newAddedStudentDataVerificationFlow() throws Exception {
		RegistrationDataVerification registrationDataVerification = new RegistrationDataVerification();
		registrationDataVerification.newAddedStudentDataVerificationFunctionality();
	}

	@AfterClass
	public static void driverExit() throws IOException {
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");
	}

}
