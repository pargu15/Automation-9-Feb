package com.ZippSlipAutomation.districtadmin.maintestpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ZippSlipAutomation.admin.objectRepository.LoginRepository;
import com.ZippSlipAutomation.admin.operations.CreateFormActions;
import com.ZippSlipAutomation.admin.operations.LoginPage;
import com.ZippSlipAutomation.districtadmin.operations.CreateSchoolActions;
import com.ZippSlipAutomation.parentsignup.operations.EnrolledStudentInfoFlow;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.URLTypes;

import jxl.Sheet;
import jxl.Workbook;

public class CreateSchoolMainClass {
	
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
	public void selectSchoolList() throws Exception {
		 
		CreateSchoolActions createSchoolActions = new CreateSchoolActions();
		createSchoolActions.selectSchoolListLink();
		createSchoolActions.selectCreateSchoolLink();

	}
	
	/*
	@Test(priority = 2)
	public void addSchoolDetails() throws Exception {
		 
		CreateSchoolActions createSchoolActions = new CreateSchoolActions();
		CreateSchoolActions.addSchoolDetails();

	}
	*/
	

	
	@AfterClass
	public static void driverExit() throws IOException, InterruptedException {
		Thread.sleep(5000);
		LoginRepository.clickOnLogoutButton();
		System.out.println("End of Script");
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();

	}
}