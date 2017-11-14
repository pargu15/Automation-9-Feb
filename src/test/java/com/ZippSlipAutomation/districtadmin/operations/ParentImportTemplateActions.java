package com.ZippSlipAutomation.districtadmin.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ZippSlipAutomation.admin.objectRepository.UploadPastAbsencesRepository;
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
		
		parentImportTemplateRepository.getAvailableSchoolID().getElement().click();
		parentImportTemplateRepository.getMappedSchoolID().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getAvailableStudentID().getElement().click();
		parentImportTemplateRepository.getMappedStudentID().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getAvailableParentFirstName().getElement().click();
		parentImportTemplateRepository.getMappedParentFirstName().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getAvailableParentLastName().getElement().click();
		parentImportTemplateRepository.getMappedParentLastName().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getAvailableParentEmail().getElement().click();
		parentImportTemplateRepository.getMappedParentEmail().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getAvailableParentPassword().getElement().click();
		parentImportTemplateRepository.getMappedParentPassword().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getTemplateSaveBtn().getElement().click();
		Thread.sleep(2000);
		parentImportTemplateRepository.getTemplatelist().getElement().click();
		
	}
	
}
