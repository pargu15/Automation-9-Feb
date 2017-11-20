package com.ZippSlipAutomation.districtadmin.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ZippSlipAutomation.districtadmin.objectRepository.ParentImportTemplateRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class ParentImportTemplateActions {


	CommonFunctions commonFunctions = new CommonFunctions();
	ParentImportTemplateRepository parentImportTemplateRepository = PageFactory.initElements(DriverInitiation.getDriver(),ParentImportTemplateRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void createParentImportTemplate() throws Exception {

		Thread.sleep(2000);
		commonFunctions.hoverOverElement(parentImportTemplateRepository.getAdministrationLink().getElement());
		parentImportTemplateRepository.getImportTemplate().getElement().click();
		parentImportTemplateRepository.getCreateTemplateBtn().getElement().click();

		parentImportTemplateRepository.getTemplateName().getElement().sendKeys("Parent Profile Import Template1");
		parentImportTemplateRepository.getTemplateDescription().getElement().sendKeys("Test Description");
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportTypeDropDown().getElement().click();
		parentImportTemplateRepository.getUserProfileImport().getElement().click();
		parentImportTemplateRepository.getParentStudentImport().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getDivUploadFile().getElement().click();
		Thread.sleep(1000);
		parentImportTemplateRepository.getUploadFileBtn().getElement().click();

		String Filepath = System.getProperty("user.dir") + "\\src\\resource\\ParentImport.xlsx";
		CommonFunctions.uploadFile(Filepath);
		WebDriverWait wait = new WebDriverWait(DriverInitiation.getDriver(), 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='divUploadForImport']/div")));

		parentImportTemplateRepository.getImportedSchoolID().getElement().click();
		parentImportTemplateRepository.getAvailableSchoolID().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedStudentID().getElement().click();
		parentImportTemplateRepository.getAvailableStudentID().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentFirstName().getElement().click();
		parentImportTemplateRepository.getAvailableParentFirstName().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentLastName().getElement().click();
		parentImportTemplateRepository.getAvailableParentLastName().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentEmail().getElement().click();
		parentImportTemplateRepository.getAvailableParentEmail().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentPassword().getElement().click();
		parentImportTemplateRepository.getAvailableParentPassword().getElement().click();
		Thread.sleep(2000);

		parentImportTemplateRepository.getImportedParentStreetNo().getElement().click();
		parentImportTemplateRepository.getAvailableParentStreetNo().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentAddress().getElement().click();
		parentImportTemplateRepository.getAvailableParentAddress().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentStreetType().getElement().click();
		parentImportTemplateRepository.getAvailableParentStreetType().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentDirection().getElement().click();
		parentImportTemplateRepository.getAvailableParentDirection().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentApartments().getElement().click();
		parentImportTemplateRepository.getAvailableParentApartments().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentCity().getElement().click();
		parentImportTemplateRepository.getAvailableParentCity().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentState().getElement().click();
		parentImportTemplateRepository.getAvailableParentState().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getImportedParentZippcode().getElement().click();
		parentImportTemplateRepository.getAvailableParentZippcode().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getTemplateSaveBtn().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getTemplatelist().getElement().click();

	}

}
