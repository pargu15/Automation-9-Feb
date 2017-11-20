package com.ZippSlipAutomation.parentsignup.operations;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.ExcelWrite;
import jxl.Sheet;
import jxl.Workbook;

public class EnrolledStudentInfoFlow {

	ParentSignUpFlowRepository parentSignUpFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentSignUpFlowRepository.class);
	CommonFunctions commonFunctions = new CommonFunctions();

	public void enterEnrolledStudentData(int sheet) throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		ExcelWrite excelWrite = new ExcelWrite();

		String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheet);
		int totalNoOfRows = sh.getRows();

		commonFunctions.waitUntilElementDisplayed(parentSignUpFlowRepository.getEnterEnrolledStudentHeader().getElement());

		for (int x = 0; x < totalNoOfRows; x++) {
			excelReadEvent.readFromExcel(sheet, x, ExcelTypes.Excel1);
			if (excelReadEvent.getEnrolledStatus().contains("yes")) {

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

				break;
			}
		}

		for (int x1 = 0; x1 < totalNoOfRows; x1++) {
			if (excelReadEvent.readFromExcel(sheet, x1, ExcelTypes.Excel1)) {

				CommonVariables.enrolledrownumber = x1;
				parentSignUpFlowRepository.getStudentId().getElement().clear();
				parentSignUpFlowRepository.getStudentId().getElement().sendKeys(excelReadEvent.getEnrolledStudentID());
				Thread.sleep(1000);

				parentSignUpFlowRepository.getDateOfBirth().getElement().clear();
				parentSignUpFlowRepository.getDateOfBirth().getElement()
				.sendKeys(excelReadEvent.getEnrolledStudentDOB());
				Thread.sleep(1000);

				parentSignUpFlowRepository.getAddStudentButton().getElement().click();
				Thread.sleep(3000);

				String studendId = excelReadEvent.getEnrolledStudentID();

				try {
					WebElement oStudentAdded = DriverInitiation.getDriver().findElement(
							By.xpath(".//*[contains(@class,'newchild') and contains(@studentid,'" + studendId + "')]"));
					if (oStudentAdded.isDisplayed()) {
						System.out.println("Student has been addded");
					}
				} catch (Exception e) {
					System.err.println("Student not added");
				}

				parentSignUpFlowRepository.getIamDoneButton().getElement().click();
				Thread.sleep(1000);
				//excelWrite.writeresultinexcel(sheet, 2, x1, "yes");
				excelWrite.writeresultinexcelxls(sheet, 2, x1, "yes",ExcelTypes.Excel1);
				break;
			}
		}
	}
}
