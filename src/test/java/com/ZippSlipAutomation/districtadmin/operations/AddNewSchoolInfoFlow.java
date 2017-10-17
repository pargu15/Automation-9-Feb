package com.ZippSlipAutomation.districtadmin.operations;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.districtadmin.objectRepository.CreateSchoolPageRepository;
import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelWrite;

import jxl.Sheet;
import jxl.Workbook;

public class AddNewSchoolInfoFlow {

	CreateSchoolPageRepository createSchoolPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			CreateSchoolPageRepository.class);
	CommonFunctions commonFunctions = new CommonFunctions();

	public void addNewSchoolData(int sheet) throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		ExcelWrite excelWrite = new ExcelWrite();

		String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheet);
		int totalNoOfRows = sh.getRows();

	//	commonFunctions.waitUntilElementDisplayed(parentSignUpFlowRepository.getEnterEnrolledStudentHeader().getElement());

		for (int x = 0; x < totalNoOfRows; x++) {
			excelReadEvent.readFromExcel(sheet, x);
			if (excelReadEvent.getDataStatus().contains("yes")) {
				
				commonFunctions.selectFromDropDown(createSchoolPageRepository.getSchoolState().getElement(), 3);
				createSchoolPageRepository.getSchoolURL().getElement().sendKeys(excelReadEvent.getSchoolURL());
				createSchoolPageRepository.getfocusout().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getDuplicateMessageForURL());
				
				
				createSchoolPageRepository.getAdminEmail().getElement().sendKeys(excelReadEvent.getAdminEmail());
				createSchoolPageRepository.getfocusout().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getDuplicateMessageForEmail());
				
				/*
				parentSignUpFlowRepository.getStudentId().getElement().sendKeys(excelReadEvent.getEnrolledStudentID());
				Thread.sleep(1000);

				parentSignUpFlowRepository.getDateOfBirth().getElement().click();
				System.out.println(excelReadEvent.getEnrolledStudentDOB());
				parentSignUpFlowRepository.getDateOfBirth().getElement()
						.sendKeys(excelReadEvent.getEnrolledStudentDOB());
				Thread.sleep(1000);

				parentSignUpFlowRepository.getAddStudentButton().getElement().click();
				Thread.sleep(4000);

				// To get the error message displayed on the page.
				try {
					System.out.println("Error message displayed is: "
							+ parentSignUpFlowRepository.getEnrolledStudentErrorMessage().getElement().getText());
				} catch (Exception e) {
					System.err.println("Error message is not displayed");
				}
*/
				break;
			}
		}
		

		for (int x1 = 0; x1 < totalNoOfRows; x1++) {
			excelReadEvent.readFromExcel(sheet, x1);
			if (excelReadEvent.getDataStatus().contains("no"))  {
				
				CommonVariables.schoolrownumber = x1;
				//createSchoolPageRepository.getSchoolName().getElement().sendKeys(excelReadEvent.getSchoolName());
				createSchoolPageRepository.getSavebtn().getElement().click();
				Thread.sleep(2000);
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolName());
				createSchoolPageRepository.getSchoolName().getElement().sendKeys(excelReadEvent.getSchoolName());
				Thread.sleep(1000);
				
				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolState());
				Thread.sleep(1000);
				commonFunctions.selectFromDropDown(createSchoolPageRepository.getSchoolState().getElement(), 3);
				Thread.sleep(1000);

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForInstitutionkey());
				Thread.sleep(1000);
				createSchoolPageRepository.getSchooKey().getElement().sendKeys(excelReadEvent.getSchoolKey());
				Thread.sleep(1000);

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolID());
				Thread.sleep(1000);
				createSchoolPageRepository.getSchoolId().getElement().sendKeys(excelReadEvent.getSchoolID());
				Thread.sleep(1000);

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForGrade());
				Thread.sleep(1000);
				commonFunctions.selectFromDropDown(createSchoolPageRepository.getGradeFrom().getElement(), 1);
				Thread.sleep(1000);
				commonFunctions.selectFromDropDown(createSchoolPageRepository.getGradeTo().getElement(), 8);
				Thread.sleep(1000);
			

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolURL());
				createSchoolPageRepository.getSchoolURL().getElement().sendKeys(excelReadEvent.getSchoolURL());
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getconfirmationMessageForURL());
				
				Thread.sleep(1000);

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForSchoolAdminName());
				createSchoolPageRepository.getAdminFirstName().getElement().sendKeys(excelReadEvent.getAdminFirstName());
				createSchoolPageRepository.getAdminLastName().getElement().sendKeys(excelReadEvent.getAdminlastName());
				Thread.sleep(1000);
				

				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForAdminEmail());
				createSchoolPageRepository.getAdminEmail().getElement().sendKeys(excelReadEvent.getAdminEmail());
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getconfirmationMessageForEmail());
				
				Thread.sleep(1000);


				createSchoolPageRepository.getSavebtn().getElement().click();
				commonFunctions.verifyElementIsPresent(createSchoolPageRepository.getErrorMessageForAdminPassword());
				createSchoolPageRepository.getAdminPassword().getElement().sendKeys(excelReadEvent.getAdminPassword());
				Thread.sleep(1000);

				
				createSchoolPageRepository.getSavebtn().getElement().click();
				Thread.sleep(1000);
				

				try {
					WebElement oSchoolAdded = DriverInitiation.getDriver().findElement(
							By.xpath(".//span[@id='lblSaveMessage']"));
					if (oSchoolAdded.isDisplayed()) {
						System.out.println("School has been addded");
					}
				} catch (Exception e) {
					System.err.println("School not added");
				}
				
				Thread.sleep(1000);
				createSchoolPageRepository.getOKbtn().getElement().click();

				excelWrite.writeresultinexcel(sheet, 8, x1, "yes");
				break;
			}
		}
	}
}
